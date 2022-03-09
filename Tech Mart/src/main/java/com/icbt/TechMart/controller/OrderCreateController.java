package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;
import com.sun.corba.se.spi.orb.OperationFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "OrderCreateController", value = "/OrderCreateController")
public class OrderCreateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String branch = request.getParameter("branch");
        String customerEmail = request.getParameter("customerEmail");
        Double totPrice = Double.valueOf(request.getParameter("totPrice"));
        String itemList = request.getParameter("itemList");

        RepositoryOperation makeOrder = new DataRepositoryOperationFactory("makeOrder").getItemDataClass();
        makeOrder.UpdateCustomerOrders(customerEmail,branch,itemList,totPrice);
        response.sendRedirect("HomePage");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
