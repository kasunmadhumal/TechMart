package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.DataValidation.AdminLoginValidation;
import com.icbt.TechMart.operation.DataValidation.SalesAgentLoginValidation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdminLoginController", value = "/AdminLoginController")
public class AdminLoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String passwd = request.getParameter("passwd");
        int state = new AdminLoginValidation(userName,passwd).checkLoginValidation();

        if(state == 1){
            HttpSession session = request.getSession();
            session.setAttribute("Admin",userName);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminAllCustomerOrdersController");
            requestDispatcher.forward(request,response);
        }
        else{
            response.sendRedirect("AdminLogin.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
