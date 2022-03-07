package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CartItemDeleteController", value = "/CartItemDeleteController")
public class CartItemDeleteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String c= request.getParameter("itemID");
        String itemID = null;
        if(c!=null)
        {
            itemID = c;
        }
        HttpSession session = request.getSession();

        String email = (String) session.getAttribute("userID");
        RepositoryOperation deleteCartItems = new DataRepositoryOperationFactory("deleteCartItem").getItemDataClass();
        deleteCartItems.deleteCartItem(email,itemID);
        session.setAttribute("itemID",itemID);
        response.sendRedirect("CartItemViewController");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
