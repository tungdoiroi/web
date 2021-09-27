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
import java.util.ArrayList;
import java.util.List;

@WebServlet(value="/category")
public class CategoryControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cateID=req.getParameter("cid");
        DAO dao= new DAO();
        List<Product> listPC = dao.getProductCID(cateID);
        List<Product> list = dao.getAllProduct();
        List<Category> listC = dao.getAllCategory();
        req.setAttribute("listP",list);
        req.setAttribute("listP",listPC);
        req.setAttribute("listCC",listC);
        req.setAttribute("tag",cateID);

        RequestDispatcher rd= req.getRequestDispatcher("home.jsp");
        rd.forward(req,resp);
    }
}
