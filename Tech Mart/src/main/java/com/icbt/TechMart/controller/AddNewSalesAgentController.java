package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.Operations.AddNewSalesAgent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddNewSalesAgentController", value = "/AddNewSalesAgentController")
public class AddNewSalesAgentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String branch = request.getParameter("branch");
        new AddNewSalesAgent(userName,password,branch).addNewSalesAgent();
        response.sendRedirect("AdminAllCustomerOrdersController");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
