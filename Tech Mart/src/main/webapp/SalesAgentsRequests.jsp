<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/10/2022
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ResultSet requestDetails = (ResultSet) request.getAttribute("result"); %>

<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar4.jsp" %>
<div class="alert" role="alert" align="center" style="margin-bottom: 30px;margin-top: 50px;color: #4B5457;background-color: #969fa4;">
    <h2>Customer Orders Of Your Branch</h2>
</div>

<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Sales Agent</th>
        <th scope="col">Branch</th>
        <th scope="col">Request</th>
        <th scope="col">Date</th>
        <th scope="col">Accept</th>
    </tr>
    </thead>
    <tbody>

    <%
        try{
            while(requestDetails.next()) { %>

    <tr>
        <th scope="row"><% out.print(requestDetails.getString("salesagentID")); %></th>
        <td><% out.print(requestDetails.getString("branch")); %></td>
        <td><% out.print(requestDetails.getString("request")); %></td>
        <td><% out.print(requestDetails.getString("date")); %></td>
        <form action="AcceptSalesAgentRequest" method="get">
            <input type="text" value="<% out.print(requestDetails.getString("salesagentID")); %>" name="email" hidden>
            <input type="text" value="<% out.print(requestDetails.getString("branch")); %>" name="branch" hidden>
            <input type="text" value="<% out.print(requestDetails.getString("request")); %>" name="request" hidden>
            <input type="text" value="<% out.print(requestDetails.getString("date")); %>" name="date" hidden>
            <td><input type="submit" name="updateDetails" value="Accept" style="background-color: #7FEACC;" ></td>
        </form>


    </tr>
    <% }}catch (SQLException e){
        System.out.println(e.getStackTrace());
    }%>

    </tbody>
</table>



</body>
</html>
