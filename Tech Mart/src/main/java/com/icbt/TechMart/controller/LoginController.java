package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.product.ProductImplementation;
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

    }
}
