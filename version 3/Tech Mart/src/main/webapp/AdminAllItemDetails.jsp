<%@ page import="com.icbt.TechMart.model.product.ProductImplementation" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/8/2022
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArrayList<ProductImplementation> allItemDetails= (ArrayList<ProductImplementation>) request.getAttribute("result"); %>

<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar3.jsp" %>

<div class="alert" role="alert" align="center" style="margin-bottom: 30px;margin-top: 50px;color: #4B5457;background-color: #969fa4;">
    <h2>All Item Details</h2>
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

    </tr>
    </thead>
    <tbody>

    <%
        for(int i=0;i<allItemDetails.size();i++){ %>

    <tr>
        <th scope="row"><% out.print(allItemDetails.get(i).getItemName()); %></th>
        <td><% out.print(allItemDetails.get(i).getMainCategory()); %></td>
        <td><% out.print(allItemDetails.get(i).getPrize()); %></td>
        <td><% out.print(allItemDetails.get(i).getColor()); %></td>
        <td><% out.print(allItemDetails.get(i).getInStockItems()); %></td>
        <td><% out.print(allItemDetails.get(i).getWarrantyTime()); %></td>
        <td><% out.print(allItemDetails.get(i).getRating()); %></td>
        <td><% out.print(allItemDetails.get(i).getBrand()); %></td>



    </tr>
    <% }%>

    </tbody>
</table>



</body>
</html>
