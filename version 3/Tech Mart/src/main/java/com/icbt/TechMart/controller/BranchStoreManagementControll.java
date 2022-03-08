package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.operation.dataBindingOperations.salesAgentStoreManage.SalesAgentBranchItemStore;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "BranchStoreManagement", value = "/BranchStoreManagement")
public class BranchStoreManagementControll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String branch = (String) session.getAttribute("salesAgentBranch");
        String branchName = "";
        if (branch.length() > 2)
        {
            branchName = branch.substring(0, 2);
        }
        ArrayList<ProductImplementation>  salesAgentBranchItemDetails = new SalesAgentBranchItemStore(branchName).getItemDetailsSelectedCategory();
        request.setAttribute("result",salesAgentBranchItemDetails);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("salesAgentBrachStoreManagment.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
