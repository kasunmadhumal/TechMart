package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.AdminOperationFactory;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AdminOperations;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RequestToSupplier", value = "/RequestToSupplier")
public class RequestToSupplierController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String agent = request.getParameter("agent");
        String branch = request.getParameter("branch");
        String message = request.getParameter("request");
        AdminOperations addNewRequest = new AdminOperationFactory("addNewRequest").getItemDataClass();
        addNewRequest.update(agent,branch,message);
        response.sendRedirect("SalesMangerOrders");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
