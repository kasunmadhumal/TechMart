package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "mailVerification", value = "/mailVerification")
public class mailVerificationController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userEnteredOTP = request.getParameter("otp");
        HttpSession session = request.getSession();
        String OTP = (String) session.getAttribute("OTP");

        if(userEnteredOTP.equals(OTP)){
            RepositoryOperation repositoryOperation;
            String email = (String) session.getAttribute("userID");
            String firstName = (String) session.getAttribute("firstName");
            String lastName = (String) session.getAttribute("lastName");
            String password = (String) session.getAttribute("password");
            repositoryOperation = new DataRepositoryOperationFactory("addUser").getItemDataClass();
            repositoryOperation.addUserDetails(email,firstName,lastName,password);
            response.sendRedirect("HomePage");
        }
        else{
            request.setAttribute("message","OTP is wrong");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("verification.jsp");
            requestDispatcher.forward(request,response);

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
