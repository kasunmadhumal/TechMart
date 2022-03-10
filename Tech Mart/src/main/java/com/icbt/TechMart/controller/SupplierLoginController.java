package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.DataValidation.SalesAgentLoginValidation;
import com.icbt.TechMart.operation.DataValidation.SupplierLoginValidation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SupplierLogin", value = "/SupplierLogin")
public class SupplierLoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String passwd = request.getParameter("passwd");
        int state = new SupplierLoginValidation(userName,passwd).checkLoginValidation();

        if(state == 1){
            HttpSession session = request.getSession();
            session.setAttribute("SupplierAgent",userName);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("ShowsAllRequest");
            requestDispatcher.forward(request,response);
        }
        else{
            response.sendRedirect("SupplierLoginPage.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
