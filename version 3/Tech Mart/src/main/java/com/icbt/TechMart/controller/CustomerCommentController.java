package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.Operations.AddNewReview;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CustomerCommentController", value = "/CustomerCommentController")
public class CustomerCommentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String userID = (String) session.getAttribute("userID");
        String itemID = request.getParameter("itemID");
        String comment = request.getParameter("comment");
        int rating = 6;

        new AddNewReview(itemID,userID,comment,rating).addNewUserComment();
        request.setAttribute("itemID",itemID);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("AboutItem");
        requestDispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
