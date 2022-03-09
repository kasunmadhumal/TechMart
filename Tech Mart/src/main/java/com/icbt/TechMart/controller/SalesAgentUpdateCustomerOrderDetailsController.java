package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.AdminOperationFactory;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AdminOperations;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdateCustomerOrderDetails", value = "/UpdateCustomerOrderDetails")
public class SalesAgentUpdateCustomerOrderDetailsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String driverID = request.getParameter("driverID");
        String vehicleType = request.getParameter("vehicleType");
        String status = request.getParameter("status");
        String email = request.getParameter("email");
        double price  = Double.parseDouble(request.getParameter("price"));

        AdminOperations updateCustomerOrders = new AdminOperationFactory("updateCustomerOrderDetails").getItemDataClass();
        updateCustomerOrders.updateCustomerOrder(driverID,vehicleType,status,email,price);
        response.sendRedirect("SalesMangerOrders");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
