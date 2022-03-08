package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.operation.DataValidation.UserLoginValidation;
import com.icbt.TechMart.operation.dataBindingOperations.homePageData.CreateHomePageItemDataViewList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "userLogin", value = "/userLogin")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userID");
        String password = request.getParameter("password");
        int state = new UserLoginValidation(userName, password).checkLoginValidation();
        if(state == 1){
            HttpSession session = request.getSession();
            session.setAttribute("userID",userName);
            response.sendRedirect("HomePage");
        }else{
            request.setAttribute("message","Invalid username or password..");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request,response);

        }



    }
}
