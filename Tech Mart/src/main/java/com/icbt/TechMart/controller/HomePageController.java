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
        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");
        ArrayList<ProductImplementation> itemDetailsList = new CreateHomePageItemDataViewList().getItemDetailsToShowInHomePage();
        ArrayList<ProductInCart> cartItemData = new CreateCartItemDataList(userID).getItemDetailsOfCart();
        int cartItemCount = 0;
        for(int i=0;i<cartItemData.size();i++){cartItemCount += cartItemData.get(i).getQuantity();}
         request.setAttribute("itemList",itemDetailsList);
        request.setAttribute("cartItemCount",cartItemCount);
        request.setAttribute("firstName",userID);
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
