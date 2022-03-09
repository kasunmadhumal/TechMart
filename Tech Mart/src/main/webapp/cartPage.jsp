<%@ page import="com.icbt.TechMart.model.product.ProductInCart" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/4/2022
  Time: 1:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%  ArrayList<ProductInCart> cartItemData = (ArrayList<ProductInCart>) request.getAttribute("cartItemData");
    int cartItemCount = (int) request.getAttribute("cartItemCount");
    String loginState = (String) request.getAttribute("firstName");
    double totalPrice = 0.0;
    String itemList = "";
%>






<%@ include file="resources/Include/header.jsp" %>

<%--Navigation bar implements--%>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark" >
    <a href="" class="navbar-brand">&emsp; TechMart.com</a>
    <div class="collapse navbar-collapse">
        <ul class="navbar-nav ">
            <li class="nav-item"><a href="HomePage" class="nav-link">Home</a></li>
        </ul>
        <ul class="navbar-nav">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">Catogery</a>
                <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                    <li><a class="dropdown-item" href="CategoryController?category=phone" style="color: #191B1B">Phones</a></li>
                    <li><a class="dropdown-item" href="CategoryController?category=charger" style="color: #191B1B">Headsets</a></li>
                    <li><a class="dropdown-item" href="CategoryController?category=headset" style="color: #191B1B">Chargers</a></li>
                    <li><a class="dropdown-item" href="CategoryController?category=baterry" style="color: #191B1B">Battery</a></li>
                    <li><a class="dropdown-item" href="CategoryController?category=cables" style="color: #191B1B">Cables</a></li>
                    <li><a class="dropdown-item" href="CategoryController?category=memory Device" style="color: #191B1B">Memory devices</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <ul class="navbar-nav ">
        <%
            if(loginState == null){

        %>
        <li class="nav-item">
            <a href="login.jsp" style="text-decoration: none; color:white;">User Login </a>
            <% } else { %>
            <p style="color: white">welcome <% out.print(" "+loginState); %></p>
            <% }%>

        </li>

    </ul>
    <ul class="navbar-nav ">
        <li class="nav-item">
            <a href="CartItemViewController" class="nav-link">
                <!--Shoping Cart-->
                <button type="button" class="btn btn-dark position-relative">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart3" viewBox="0 0 16 16">
                        <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .49.598l-1 5a.5.5 0 0 1-.465.401l-9.397.472L4.415 11H13a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l.84 4.479 9.144-.459L13.89 4H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
                    </svg>

                    <span id="unrdMg" class="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger"><% out.print(cartItemCount); %>
  							<span class="visually-hidden">unread messages</span>
  						</span>

                </button>
                <!--End Shoping Cart-->

            </a>
        </li>
        <%if(loginState != null){  %>
        <li class="nav-item"><a href="Logout" class="nav-link" style="color: darkred">logout</a></li>
        <% }%>
    </ul>

</nav>





<link rel="stylesheet" href="resources/Include/CSS/ShopingCart.css">

<div class="container" >

  <div class="row cartContainer">
    <div class="leftCol col-lg-8">
      <div class="headBar">
        <h2 class="cart">Shopping Cart</h2>
      </div>

      <ul class="itemList">

<% if(loginState == null) { %>
        <div class="alert alert-danger" role="alert" align="center">
          <b>Log in before buy products</b>
        </div>
          <%} %>

          <% if(cartItemCount <= 0) {  %>
        <div class="alert alert-warning" role="alert">
          Your cart is emty!
        </div>
          <% }%>

        <div class="d-grid gap-2">
          <a class="btn btn-warning" type="button" href="">Continue Shoping</a>
        </div>


<%--          Item showing--%>


          <% for(int i=0;i<cartItemData.size();i++) { %>

        <div class="row itemContainer">
          <img src="<% out.print(cartItemData.get(i).getImagePath()); %>" class="img-fluid itemImage" alt="item1" width="100px" height="100px">

          <div class="itemContent col-md-6 col-sm-6 col-lg-6">
            <h6 class="ietemDescription" style="color: green;">
              <% out.print(cartItemData.get(i).getItemName()); %>
            </h6><br>
            <p class="brand col-lg-8 col-sm-4 col-mb-4"><strong>Brand :</strong><% out.print(cartItemData.get(i).getBrand()); %></p>
            <p class="inStock col-lg-6 col-sm-4 col-mb-4">In stock(<% out.print(cartItemData.get(i).getInStockItems()); %> items)</p>

          </div>
          <div class="price col-md-2 col-sm-2 col-lg-2">
            <div class="row">
              <table style="text-align: center;">
                <tr>
                  <td>
                    <a href="DecreaseItemBuyingCount?itemID=<%=(cartItemData.get(i).getItemID())%>">-</a><!-- Minus button-->
                  </td>
                  <td>
                      <% out.print(cartItemData.get(i).getQuantity()); %>
                  </td>
                  <td>
                    <a href="IncreaseItemBuyingCount?itemID=<%=(cartItemData.get(i).getItemID())%>">+</a><!-- Add button-->
                  </td>
                </tr>
              </table>
            </div>
            <div class="valueContainer">
                <% double value = (cartItemData.get(i).getPrize()) * (cartItemData.get(i).getQuantity());
                    totalPrice += value; %>
              <p class="value" style="color: royalblue;"><% out.print(value); %>  LKR</p>
            </div>

            <div class="deleteIconcontainer" ><!-- Delete button-->
              <a class="btn" href="CartItemDeleteController?itemID=<%=(cartItemData.get(i).getItemID())%>" title="Remove from cart">
                <i class="fa fa-trash-o fa-lg deleteIcon" aria-hidden="true"style="color: red;" ></i>
              </a>
            </div>

          </div>
        </div>
<%  } %>


      </ul>
    </div>
    <div class="rightCol col-lg-3">
      <div class="summery">
        <h4 class="orderSummeryText"style="text-align: center"><strong>Order Summery</strong></h4>
      </div>

      <div class="totalContainer row">
        <table cellpadding="5px">
          <tr>
            <th style="text-align: left">
              <h3>Items</h3>
            </th>
            <th style="text-align: right">
               <% for(int i =0;i<cartItemData.size();i++){
                   itemList = itemList + " "+ cartItemData.get(i).getItemName() + " "+cartItemData.get(i).getQuantity()+", ";
                   out.print(cartItemData.get(i).getItemName() + "| ");}
                  %>
            </th>
          </tr>
        </table>
      </div>
      <br><br>
      <div class="totalContainer row">
        <table cellpadding="5px">
          <tr>
            <th style="text-align: left">
              <h3>Total</h3>
            </th>
            <th style="text-align: right">
              <h3><% out.print(totalPrice); %>&nbsp;LKR</h3>
            </th>
          </tr>
        </table>

      </div>
      <form action="OrderCreateController" method="get">
        <div class="checkout">
            <table cellpadding="5px">
                <tr>
                    <th style="text-align: left">
                        <p>Branch</p>
                    </th>
                    <th style="text-align: right">
                        <input type="text" name="branch" value="">
                    </th>
                </tr>
                <tr>
                    <ul>
                        <li>

                        </li>
                        <li>
                            Colombo
                        </li>
                        <li>
                            Galle | Kandy | Nugegoda
                        </li>
                        <li>
                                Gampaha | Kurunegala |Jaffna
                        </li>
                    </ul>
                </tr>
            </table>

            <input type="hidden" value="<% out.print(loginState); %>" name="customerEmail">
          <input type="hidden" value="<% out.print(totalPrice); %>" name="totPrice">
          <input type="hidden" value="<% out.print(itemList);%>" name="itemList">
          <div class="d-grid gap-2">
            <input type="submit" value="Proceed to checkout" class="btn btn-success">
          </div>
        </div>
      </form>

    </div>
  </div>
</div>

<%@ include file="resources/Include/footer.jsp" %>
