package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.AdminOperationFactory;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AdminOperations;
import com.icbt.TechMart.operation.AdminsOperations.Operations.RetrieveAllRequestDetails;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet(name = "ShowsAllRequest", value = "/ShowsAllRequest")
public class ShowsAllRequestController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResultSet resultSet = new RetrieveAllRequestDetails().getRequestDetails();
        request.setAttribute("result",resultSet);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("SalesAgentsRequests.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
