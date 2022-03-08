package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.model.product.ProductInCart;
import com.icbt.TechMart.operation.dataBindingOperations.cartItemData.CreateCartItemDataList;
import com.icbt.TechMart.operation.dataBindingOperations.selectedItemCategory.SelectedItemCategoryDetailList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CategoryController", value = "/CategoryController")
public class CategoryController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String c= request.getParameter("category");
        String category = null;
        if(c!=null)
        {
            category = c;
        }
        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");


        ArrayList<ProductImplementation> selectedCategoryItemDetails = new SelectedItemCategoryDetailList(category).getItemDetailsSelectedCategory();

        ArrayList<ProductInCart> cartItemData = new CreateCartItemDataList(userID).getItemDetailsOfCart();
        int cartItemCount = 0;
        for(int i=0;i<cartItemData.size();i++){cartItemCount += cartItemData.get(i).getQuantity();}
        request.setAttribute("cartItemCount",cartItemCount);
        request.setAttribute("firstName",userID);
        request.setAttribute("itemList",selectedCategoryItemDetails);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("category.jsp");
        requestDispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
