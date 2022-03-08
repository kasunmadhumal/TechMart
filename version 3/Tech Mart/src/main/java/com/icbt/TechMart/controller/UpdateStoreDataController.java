package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.Operations.UpdateStoreItems;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdateStoreDataController", value = "/UpdateStoreDataController")
public class UpdateStoreDataController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int itemCount = Integer.parseInt(request.getParameter("inStockItems"));
        String itemID = request.getParameter("itemID");
        new UpdateStoreItems().updateItemStoreCount(itemID,itemCount);
        response.sendRedirect("BranchStoreManagement");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
