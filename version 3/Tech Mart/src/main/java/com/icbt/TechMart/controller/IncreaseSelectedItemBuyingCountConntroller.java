package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.product.ProductInCart;
import com.icbt.TechMart.operation.dataBindingOperations.cartItemData.CreateCartItemDataList;
import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "IncreaseSelectedItemBuyingCountController", value = "/IncreaseSelectedItemBuyingCountController")
public class IncreaseSelectedItemBuyingCountConntroller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String c= request.getParameter("itemID");
        String itemID = null;
        if(c!=null)
        {
            itemID = c;
        }
        HttpSession session = request.getSession();

        String email = (String) session.getAttribute("userID");
        ArrayList<ProductInCart> cartItemData = new CreateCartItemDataList(email).getItemDetailsOfCart();
        int oldCartItemCount = 0;
        int SelectedItemCount = 0;
        for(int i=0;i<cartItemData.size();i++){

            if(cartItemData.get(i).getItemID().equals(itemID) && cartItemData.get(i).getUserID().equals(email)){
                oldCartItemCount = cartItemData.get(i).getQuantity();


            }
        }

        SelectedItemCount = oldCartItemCount + 1;
        System.out.println(email+" "+SelectedItemCount+" "+itemID);
        RepositoryOperation updateCart = new DataRepositoryOperationFactory("updateItemCountInCart").getItemDataClass();
        updateCart.updateCartTable(email,SelectedItemCount,itemID);
        session.setAttribute("itemID",itemID);
        response.sendRedirect("AboutItem");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String c= request.getParameter("itemID");
        String itemID = null;
        if(c!=null)
        {
            itemID = c;
        }
        HttpSession session = request.getSession();

        String email = (String) session.getAttribute("userID");
        ArrayList<ProductInCart> cartItemData = new CreateCartItemDataList(email).getItemDetailsOfCart();
        int oldCartItemCount = 0;
        int SelectedItemCount = 0;
        for(int i=0;i<cartItemData.size();i++){

            if(cartItemData.get(i).getItemID().equals(itemID) && cartItemData.get(i).getUserID().equals(email)){
                oldCartItemCount = cartItemData.get(i).getQuantity();


            }
        }

        SelectedItemCount = oldCartItemCount + 1;
        System.out.println(email+" "+SelectedItemCount+" "+itemID);
        RepositoryOperation updateCart = new DataRepositoryOperationFactory("updateItemCountInCart").getItemDataClass();
        updateCart.updateCartTable(email,SelectedItemCount,itemID);
        session.setAttribute("itemID",itemID);
        response.sendRedirect("AboutItem");
    }
}
