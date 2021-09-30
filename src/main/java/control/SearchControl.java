package control;

import dao.DAO;
import entity.Category;
import entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/search")
public class SearchControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
        String txtSearch = req.getParameter("txt");//lay ten tim kiem
        DAO dao = new DAO();
        DAO dao1 = new DAO();
        List<Category> listC = dao1.getAllCategory();
        List<Product> list = dao.searchByName(txtSearch);
        req.setAttribute("listCC",listC);
        req.setAttribute("listP" ,list);
        rd.forward(req,resp);

    }


}

