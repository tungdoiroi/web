/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;

import entity.Category;
import entity.Product;
import java.io.IOException;

import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author trinh
 */
@WebServlet (value = "/")
public class HomeControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        WebContext ctx = new WebContext(request, response, servletContext, new Locale("fr"));

        RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
        DAO dao = new DAO();
        List<   Product> list = dao.getAllProduct();
        List<Category> listC = dao.getAllCategory();

        req.setAttribute("listP", list);
        req.setAttribute("listCC", listC);

        rd.forward(req, resp);
    }


}