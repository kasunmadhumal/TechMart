<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/8/2022
  Time: 9:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ResultSet ordersDetails = (ResultSet) request.getAttribute("result"); %>

<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar3.jsp" %>

<div class="alert" role="alert" align="center" style="margin-bottom: 30px;margin-top: 50px;color: #4B5457;background-color: #969fa4;">
    <h2>Customer Orders</h2>
</div>

<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">email</th>
        <th scope="col">branch</th>
        <th scope="col">items</th>
        <th scope="col">total Price</th>
        <th scope="col">date</th>
        <th scope="col">driver ID</th>
        <th scope="col">vehicle Type</th>
        <th scope="col">Status</th>
        <th scope="col">Person In Charge</th>
    </tr>
    </thead>
    <tbody>

    <%
        try{
            while(ordersDetails.next()) { %>

    <tr>
        <th scope="row"><% out.print(ordersDetails.getString("email")); %></th>
        <td><% out.print(ordersDetails.getString("branch")); %></td>
        <td><% out.print("<html>"+ordersDetails.getString("items")+"</html>"); %></td>
        <td><% out.print(ordersDetails.getDouble("totalPrice")); %></td>
        <td><% out.print(ordersDetails.getString("date")); %></td>
        <td><% out.print(ordersDetails.getString("driverID")); %></td>
        <td><% out.print(ordersDetails.getString("vehicleType")); %></td>
        <td><% out.print(ordersDetails.getString("status")); %></td>
        <td><% out.print(ordersDetails.getString("userID")); %></td>

    </tr>
    <% }}catch (SQLException e){
        System.out.println(e.getStackTrace());
    }%>

    </tbody>
</table>



</body>
</html>
