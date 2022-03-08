package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.DataValidation.UserSignupValidation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "userSignup", value = "/userSignup")
public class SignupController extends HttpServlet {
    HttpSession session;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        UserSignupValidation userSignupValidation = new UserSignupValidation(firstName,lastName,email,password,confirmPassword);
        int verificationStatus = userSignupValidation.verifySignup();

        if(verificationStatus == 1){
            session = request.getSession();
            session.setAttribute("userID", email);
            session.setAttribute("firstName", firstName);
            session.setAttribute("lastName", lastName);
            session.setAttribute("password", password);

            response.sendRedirect("verification.jsp");

        }
        else{
            request.setAttribute("message","confirm password not matching to password");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("signup.jsp");
            requestDispatcher.forward(request,response);
        }
    }
}
