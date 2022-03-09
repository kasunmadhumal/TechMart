<%@ page import="com.icbt.TechMart.model.orders.Orders" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/7/2022
  Time: 12:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArrayList<Orders> itemDetailsList = (ArrayList<Orders>) request.getAttribute("myOrders");

%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
        #signuptextb {

            color: whitesmoke;
            background-color: #50514F;
            margin-top: 10px;
            text-align: center;
        }
    </style>
</head>
<body>

<h3 id="signuptextb">My Order List</h3>
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
    </tr>
    </thead>
    <tbody>

    <%for(int i=0;i<itemDetailsList.size();i++) { %>
    <tr>
        <th scope="row"><% out.print(itemDetailsList.get(i).getEmail()); %></th>
        <td><% out.print(itemDetailsList.get(i).getBranch()); %></td>
        <td><% out.print(itemDetailsList.get(i).getItems()); %></td>
        <td><% out.print(itemDetailsList.get(i).getTotalPrice()); %></td>
        <td><% out.print(itemDetailsList.get(i).getDate()); %></td>
        <td><% out.print(itemDetailsList.get(i).getDriverID()); %></td>
        <td><% out.print(itemDetailsList.get(i).getVehicleType()); %></td>
        <td><% out.print(itemDetailsList.get(i).getStatus()); %></td>
    </tr>
    <% }%>
    <tr><form action="HomePage" method="get">
        <input type="submit" value="Back to home" name="home" style="color: dimgray">
    </form>
    </tr>
    </tbody>
</table>



</body>
</html>
