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
 //       RequestDispatcher rd = req.getRequestDispatcher("product.jsp");

        String PROID= req.getParameter("1");
        String cmt = req.getParameter("cmt");
        String gmail = req.getParameter("gmail");
        String ten = req.getParameter("ten");

        DAO dao = new DAO();
        dao.addComment(cmt,gmail,ten, "1");
//        List<Comment> listCmt = dao.getComment();
//        req.setAttribute("listCmt",listCmt);


        resp.sendRedirect("/detail?pid=" + 1);
    }
}
