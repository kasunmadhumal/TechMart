package com.icbt.TechMart.controller;

import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.operation.AdminsOperations.Operations.RetrieveAllItemDetails;
import com.icbt.TechMart.operation.dataBindingOperations.allItems.AllItemDetails;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

@WebServlet(name = "AdminAllItemDetails", value = "/AdminAllItemDetails")
public class AdminAllItemDetails extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<ProductImplementation> result = new AllItemDetails().getItemDetails();
        request.setAttribute("result",result);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminAllItemDetails.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
