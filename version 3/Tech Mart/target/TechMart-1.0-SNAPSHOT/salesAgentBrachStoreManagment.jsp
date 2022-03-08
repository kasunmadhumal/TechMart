<%@ page import="com.icbt.TechMart.model.product.ProductImplementation" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/8/2022
  Time: 7:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArrayList<ProductImplementation> salesAgentBranchItemDetails= (ArrayList<ProductImplementation>) request.getAttribute("result"); %>

<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar1.jsp" %>
<div class="alert" role="alert" align="center" style="margin-bottom: 30px;margin-top: 50px;color: #4B5457;background-color: #969fa4;">
    <h2>Branch Store Details</h2>
</div>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">item name</th>
        <th scope="col">main category</th>
        <th scope="col">price</th>
        <th scope="col">color</th>
        <th scope="col">stock items count</th>
        <th scope="col">warranty time</th>
        <th scope="col">rating</th>
        <th scope="col">brand</th>
        <th scope="col">update</th>
    </tr>
    </thead>
    <tbody>

    <%
       for(int i=0;i<salesAgentBranchItemDetails.size();i++){ %>

    <tr>
        <th scope="row"><% out.print(salesAgentBranchItemDetails.get(i).getItemName()); %></th>
        <td><% out.print(salesAgentBranchItemDetails.get(i).getMainCategory()); %></td>
        <td><% out.print(salesAgentBranchItemDetails.get(i).getPrize()); %></td>
        <td><% out.print(salesAgentBranchItemDetails.get(i).getColor()); %></td>
        <form action="UpdateStoreDataController" method="get">
        <td><input type="text" value="<% out.print(salesAgentBranchItemDetails.get(i).getInStockItems()); %>" name="inStockItems"></td>

            <td><% out.print(salesAgentBranchItemDetails.get(i).getWarrantyTime()); %></td>
            <td><% out.print(salesAgentBranchItemDetails.get(i).getRating()); %></td>
            <td><% out.print(salesAgentBranchItemDetails.get(i).getBrand()); %></td>
        <input type="text" value="<% out.print(salesAgentBranchItemDetails.get(i).getItemID()); %>" name="itemID" hidden>
       <td><input type="submit" name="updateDetails" value="Update" style="background-color: #7FEACC;" ></td>

        </form>

    </tr>
    <% }%>

    </tbody>
</table>



</body>
</html>
