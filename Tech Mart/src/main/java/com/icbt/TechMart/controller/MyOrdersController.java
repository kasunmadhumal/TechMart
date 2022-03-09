package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.orders.Orders;
import com.icbt.TechMart.operation.dataBindingOperations.MyOrders.CreateMyOrdersList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "MyOrdersController", value = "/MyOrdersController")
public class MyOrdersController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");
        ArrayList<Orders> orders = new CreateMyOrdersList(userID).getMyOrders();
        request.setAttribute("myOrders",orders);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("MyOrdersStatus.jsp");
        requestDispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
