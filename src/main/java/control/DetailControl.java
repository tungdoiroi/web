package control;


import dao.DAO;
import entity.Category;
import entity.Comment;
import entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value="/detail")
public class DetailControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String PROID= req.getParameter("pid");
        String cateID=req.getParameter("cid");
//        String PROID= req.getParameter("id");
//        String cateID=req.getParameter("id");
        DAO dao = new DAO();
        List<Category> listC = dao.getAllCategory();
        List<Product> listPC = dao.getProductCID(cateID);

        List<Comment> listCmt = dao.getComment();
        req.setAttribute("listCmt",listCmt);

        Product proid= dao.getProductID(PROID);
        req.setAttribute("detail",proid);
        req.setAttribute("listCC",listC);
        req.setAttribute("tag",cateID);
        RequestDispatcher rd= req.getRequestDispatcher("product.jsp");
        rd.forward(req,resp);

    }
}
