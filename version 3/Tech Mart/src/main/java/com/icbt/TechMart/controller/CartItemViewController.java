package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.product.ProductInCart;
import com.icbt.TechMart.operation.dataBindingOperations.cartItemData.CreateCartItemDataList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CartItemViewController", value = "/CartItemViewController")
public class CartItemViewController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //codes for navigation bar.....................
        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");

        ArrayList<ProductInCart> cartItemData = new CreateCartItemDataList(userID).getItemDetailsOfCart();
        int cartItemCount = 0;

        for(int i=0;i<cartItemData.size();i++){cartItemCount += cartItemData.get(i).getQuantity();}
        request.setAttribute("cartItemData",cartItemData);
        request.setAttribute("cartItemCount",cartItemCount);
        request.setAttribute("firstName",userID);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("cartPage.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
