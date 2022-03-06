package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.model.product.ProductInCart;
import com.icbt.TechMart.operation.dataBindingOperations.cartItemData.CreateCartItemDataList;
import com.icbt.TechMart.operation.dataBindingOperations.homePageData.CreateHomePageItemDataViewList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "homePage", value = "/HomePage")
public class HomePageController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<ProductImplementation> itemDetailsList = new CreateHomePageItemDataViewList().getItemDetailsToShowInHomePage();
//        ArrayList<ProductInCart> cartItemDate = new CreateCartItemDataList().getItemDetailsOfCart();
//        int cartItemCount = cartItemDate.size();
         request.setAttribute("itemList",itemDetailsList);
//         request.setAttribute("cartItemCount",cartItemCount);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("homePage.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<ProductImplementation> itemDetailsList = new CreateHomePageItemDataViewList().getItemDetailsToShowInHomePage();
        request.setAttribute("itemList",itemDetailsList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("homePage.jsp");
        requestDispatcher.forward(request,response);
    }
}
