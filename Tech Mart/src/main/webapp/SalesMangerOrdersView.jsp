<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.

  Date: 3/7/2022
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ResultSet ordersDetails = (ResultSet) request.getAttribute("result"); %>

<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar1.jsp" %>
<div class="alert" role="alert" align="center" style="margin-bottom: 30px;margin-top: 50px;color: #4B5457;background-color: #969fa4;">
    <h2>Customer Orders Of Your Branch</h2>
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
        <th scope="col">Update</th>
        <th scope="col">Accept</th>
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
        <form action="UpdateCustomerOrderDetails" method="get">
        <td><input type="text" value="<% out.print(ordersDetails.getString("driverID")); %>" name="driverID"></td>
        <td><input type="text" value="<% out.print(ordersDetails.getString("vehicleType")); %>" name="vehicleType"></td>
        <td><input type="text" value="<% out.print(ordersDetails.getString("status")); %>" name="status"></td>
            <input type="text" value="<% out.print(ordersDetails.getString("email")); %>" name="email" hidden>
            <input type="text" value="<% out.print(ordersDetails.getDouble("totalPrice")); %>" name="price" hidden>
            <td><input type="submit" name="updateDetails" value="Update" style="background-color: #7FEACC;" ></td>

        </form>
        <form action="SalesAgentOrderAccepting" method="get">
            <input type="text" value="<% out.print(ordersDetails.getString("email")); %>" name="email" hidden>
            <input type="text" value="<% out.print(ordersDetails.getDouble("totalPrice")); %>" name="price" hidden>
            <input type="text" value="<% out.print(ordersDetails.getString("date")); %>" name="date" hidden>
            <input type="text" value="<% out.print(ordersDetails.getString("items")); %>" name="items" hidden>
            <input type="text" value="<% out.print(ordersDetails.getString("driverID")); %>" name="driverID" hidden>
            <input type="text" value="<% out.print(ordersDetails.getString("vehicleType")); %>" name="vehicleType" hidden>
           <td> <input type="submit" value="Accept" name="acceptOrder" style="background-color: #5cb85c"> </td>

        </form>
    </tr>
    <% }}catch (SQLException e){
        System.out.println(e.getStackTrace());
    }%>

    </tbody>
</table>



</body>
</html>
