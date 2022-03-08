package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.DataValidation.SalesAgentLoginValidation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SalesAgentLogin", value = "/SalesAgentLogin")
public class SalesAgentLoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("username");
        String passwd = request.getParameter("passwd");
        int state = new SalesAgentLoginValidation(userName,passwd).checkLoginValidation();

        if(state == 1){
            HttpSession session = request.getSession();
            session.setAttribute("SalesAgent",userName);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("SalesMangerOrders");
            requestDispatcher.forward(request,response);
        }
        else{
            response.sendRedirect("SalesAgentLogin.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
