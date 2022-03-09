package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.AdminOperationFactory;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AdminOperations;
import com.icbt.TechMart.operation.emailSender.gmail.SendEmail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SalesAgentOrderAccepting", value = "/SalesAgentOrderAccepting")
public class SalesAgentOrderAccepting extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        double OrderPrice = Double.parseDouble(request.getParameter("price"));
        String orderDate = request.getParameter("date");
        String items = request.getParameter("items");
        String driverID = request.getParameter("driverID");
        String vehicleType = request.getParameter("vehicleType");
        HttpSession session = request.getSession();
        String salesAgent = (String) session.getAttribute("SalesAgent");

//        data remove from database
        AdminOperations orderItemsRemove = new AdminOperationFactory("orderRemoveFromDatabase").getItemDataClass();
        orderItemsRemove.orderRemoveFromDatabase(email,OrderPrice,salesAgent);
        String details = "Your requested "+items+" on "+orderDate+" was successfully sent to you. ( Deliver Person: "+driverID+"  ||  "+
                "Type of vehicle come to delivered : "+vehicleType+"  ||   Total Amount : "+OrderPrice +")";

        SendEmail sendEmail = new SendEmail(email,details);
        response.sendRedirect("SalesMangerOrders");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
