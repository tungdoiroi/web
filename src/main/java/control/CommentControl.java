package control;

import dao.DAO;
import entity.Category;
import entity.Comment;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/comment")
public class CommentControl extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = req.getRequestDispatcher("product.jsp");
        String PROID= req.getParameter("pid");
        DAO dao = new DAO();
        List<Comment> listCmt = dao.getComment(PROID);
        req.setAttribute("listCmt",listCmt);
        rd.forward(req,resp);
    }
}
