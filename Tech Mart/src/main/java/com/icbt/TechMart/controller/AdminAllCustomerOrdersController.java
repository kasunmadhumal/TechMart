package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.AdminOperationFactory;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AdminOperations;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet(name = "AdminAllCustomerOrdersController", value = "/AdminAllCustomerOrdersController")
public class AdminAllCustomerOrdersController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdminOperations allOrdersClass = new AdminOperationFactory("allCustomerOrders").getItemDataClass();
        ResultSet allCustomerOrders = allOrdersClass.allCustomerOrders();
        request.setAttribute("result",allCustomerOrders);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminOrdersView.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
