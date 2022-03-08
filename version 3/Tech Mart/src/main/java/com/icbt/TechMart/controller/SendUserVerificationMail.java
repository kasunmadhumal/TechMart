package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.emailSender.gmail.GmailSMTP;
import com.icbt.TechMart.operation.emailSender.gmail.SendEmail;
import sun.plugin.dom.core.Element;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "SendUserVerificationMail", value = "/SendUserVerificationMail")
public class SendUserVerificationMail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");

        //generate random number for OTP
        Random r = new Random();
        int low = 1000;
        int high = 9999;
        int verificationCode = r.nextInt(high-low) + low;

        String otp = String.valueOf(verificationCode);
        String sendValue = "Your OTP code is :"+ otp;
        session.setAttribute("OTP",otp);
        SendEmail sendEmail = new SendEmail(userID,sendValue);

        request.setAttribute("message2","OTP is send");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("verification.jsp");
        requestDispatcher.forward(request,response);

    }
}
