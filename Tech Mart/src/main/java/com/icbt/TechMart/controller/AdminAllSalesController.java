package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.AdminOperationFactory;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AdminOperations;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet(name = "AdminAllSalesController", value = "/AdminAllSalesController")
public class AdminAllSalesController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     AdminOperations resultClass = new AdminOperationFactory("RetrieveAllSales").getItemDataClass();
     ResultSet resultSet = resultClass.allCustomerOrders();
        request.setAttribute("result",resultSet);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminAllSalesView.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
