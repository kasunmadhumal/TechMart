<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/8/2022
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ResultSet allSales= (ResultSet) request.getAttribute("result"); %>

<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar3.jsp" %>

<div class="alert" role="alert" align="center" style="margin-bottom: 30px;margin-top: 50px;color: #4B5457;background-color: #969fa4;">
    <h2>Sales</h2>
</div>

<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">order ID</th>
        <th scope="col">user ID</th>
        <th scope="col">items</th>
        <th scope="col">price</th>
        <th scope="col">sales Agent</th>
        <th scope="col">date</th>


    </tr>
    </thead>
    <tbody>

    <%
        try{ while(allSales.next()){ %>

    <tr>
        <th scope="row"><% out.print(allSales.getInt("orderID")); %></th>
        <td><% out.print(allSales.getString("userID")); %></td>
        <td><% out.print(allSales.getString("items")); %></td>
        <td><% out.print(allSales.getDouble("price")); %></td>
        <td><% out.print(allSales.getString("salesAgent")); %></td>
        <td><% out.print(allSales.getString("date")); %></td>

    </tr>
    <% } } catch (SQLException e){
        System.out.println(e.getStackTrace());
    }%>

    </tbody>
</table>



</body>
</html>