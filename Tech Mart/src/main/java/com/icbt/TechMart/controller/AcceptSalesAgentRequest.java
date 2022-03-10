package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.Operations.DeleteSalesAgentRequest;
import com.icbt.TechMart.operation.emailSender.gmail.SendEmail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AcceptSalesAgentRequest", value = "/AcceptSalesAgentRequest")
public class AcceptSalesAgentRequest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String salesagentID = request.getParameter("email");
        String branch = request.getParameter("branch");
        String message = request.getParameter("request");
        String date = request.getParameter("date");
        new DeleteSalesAgentRequest(salesagentID,branch,message,date).deleteRequest();
        String details = "We are successfully restock the your requested Items ("+message+") sent to us on "+date+"from "+branch+" branch";

        SendEmail sendEmail = new SendEmail(salesagentID,details);
        response.sendRedirect("ShowsAllRequest");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
