package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.AdminOperationFactory;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AddNewItems;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AdminOperations;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;

@WebServlet(name = "AddNewItemController", value = "/AddNewItemController")
public class AddNewItemController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mainCategory = request.getParameter("mainCategory");
        String subCategory = request.getParameter("subCategory");
        String brandOfProduct = request.getParameter("brandOfProduct");
        double priceOfProduct = Double.parseDouble(request.getParameter("priceOfProduct"));
        String color = request.getParameter("color");
        int instock = Integer.parseInt(request.getParameter("instock"));
        String warranty = request.getParameter("warranty");
        String description = request.getParameter("discription");
        int rating = Integer.parseInt(request.getParameter("rating"));
        String uploadfile = request.getParameter("uploadfile");
        String type = request.getParameter("type");
        String branch = request.getParameter("branch");
        String itemID = mainCategory.substring(0,3) + subCategory.substring(0,3) + brandOfProduct.substring(0,3)+color.substring(0,3);
        String itemName = brandOfProduct + " "+subCategory;
        String newBranch = branch.substring(0,2);


        String filePath = "resources/img/items/" + uploadfile;
        String imagePath = filePath;



        new AddNewItems().addNewItem(itemID,itemName,mainCategory,subCategory,priceOfProduct,color,instock,
        warranty,description,rating,brandOfProduct,imagePath,newBranch);
        response.sendRedirect("AddNewItem.jsp");




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
