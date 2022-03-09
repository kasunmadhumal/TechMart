package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.Review.CustomerReviews;
import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.model.product.ProductInCart;
import com.icbt.TechMart.operation.dataBindingOperations.cartItemData.CreateCartItemDataList;
import com.icbt.TechMart.operation.dataBindingOperations.homePageData.CreateHomePageItemDataViewList;
import com.icbt.TechMart.operation.dataBindingOperations.reviewItemDetailsList.ReviewItemDetailsList;
import com.icbt.TechMart.operation.dataBindingOperations.selectedItemDetailsList.AboutItemDetailList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "AboutItem", value = "/AboutItem")
public class AboutItemController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");
        String itemID =null;
        itemID = request.getParameter("itemID");
        if(itemID == null){
            itemID = (String) session.getAttribute("itemID");
        }




        ArrayList<ProductImplementation> itemDetailsList = new AboutItemDetailList(itemID).getSelectedItemDetailList();

        ArrayList<CustomerReviews> itemReviewList = new ReviewItemDetailsList(itemID).getItemReviewDetailList();

        //codes for navigation bar.....................
        ArrayList<ProductInCart> cartItemData = new CreateCartItemDataList(userID).getItemDetailsOfCart();
        int cartItemCount = 0;

        for(int i=0;i<cartItemData.size();i++){cartItemCount += cartItemData.get(i).getQuantity();}
        request.setAttribute("cartItemCount",cartItemCount);
        request.setAttribute("firstName",userID);

        //calculate selected item count in cart
        int ItemCountInCart = 0;

        for(int j=0;j<cartItemData.size();j++){
            if(cartItemData.get(j).getItemID() == itemID){
                ItemCountInCart = cartItemData.get(j).getQuantity();


            }
        }
        request.setAttribute("ItemCountInCart",ItemCountInCart);
        System.out.println(ItemCountInCart);
        request.setAttribute("selectedItemDetails",itemDetailsList);
        request.setAttribute("itemReviewList",itemReviewList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("aboutItem.jsp");
        requestDispatcher.forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String itemID ;
        itemID = request.getParameter("itemId");
        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");



        ArrayList<ProductImplementation> itemDetailsList = new AboutItemDetailList(itemID).getSelectedItemDetailList();

        ArrayList<CustomerReviews> itemReviewList = new ReviewItemDetailsList(itemID).getItemReviewDetailList();

        //codes for navigation bar.....................
        ArrayList<ProductInCart> cartItemData = new CreateCartItemDataList(userID).getItemDetailsOfCart();
        int cartItemCount = 0;

        for(int i=0;i<cartItemData.size();i++){cartItemCount += cartItemData.get(i).getQuantity();}
        request.setAttribute("cartItemCount",cartItemCount);
        request.setAttribute("firstName",userID);

        //calculate selected item count in cart
        int ItemCountInCart = 0;

        for(int j=0;j<cartItemData.size();j++){
            if(cartItemData.get(j).getItemID() == itemID){
                ItemCountInCart = cartItemData.get(j).getQuantity();

            }
        }
        request.setAttribute("ItemCountInCart",ItemCountInCart);
        System.out.println(ItemCountInCart);
        request.setAttribute("selectedItemDetails",itemDetailsList);
        request.setAttribute("itemReviewList",itemReviewList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("aboutItem.jsp");
        requestDispatcher.forward(request,response);



    }
}
