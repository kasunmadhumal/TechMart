package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.product.ProductInCart;
import com.icbt.TechMart.operation.dataBindingOperations.cartItemData.CreateCartItemDataList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "NavBarController", value = "/NavBarController")
public class NavBarController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");
        ArrayList<ProductInCart> cartItemDate = new CreateCartItemDataList(userID).getItemDetailsOfCart();
        int cartItemCount = cartItemDate.size();

        request.setAttribute("cartItemCount",cartItemCount);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("NavigationBar2.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
