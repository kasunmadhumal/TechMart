package com.icbt.TechMart.controller;

import com.icbt.TechMart.operation.AdminsOperations.AdminOperationFactory;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AdminOperations;
import com.icbt.TechMart.operation.AdminsOperations.Operations.BranchOfSalesAgent;
import com.icbt.TechMart.operation.AdminsOperations.Operations.OrdersInSalesAgentArea;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet(name = "SalesMangerOrders", value = "/SalesMangerOrders")
public class SalesMangerOrdersControlls extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String salesAgent = (String) session.getAttribute("SalesAgent");

//        find sales agent brach Area
        AdminOperations salesAgentBranch = new AdminOperationFactory("salesAgentBranch").getItemDataClass();
        String branch = salesAgentBranch.getBranchOfSalesAgent(salesAgent);
        session.setAttribute("salesAgentBranch",branch);

        //orders in Sales agent area
        AdminOperations agentAreaOrdersClass = new AdminOperationFactory("ordersInSalesAgentArea").getItemDataClass();
        ResultSet agentAreaOrders  = agentAreaOrdersClass.getSalesAgentAreaOrdersList(branch);


        request.setAttribute("result",agentAreaOrders);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("SalesMangerOrdersView.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
