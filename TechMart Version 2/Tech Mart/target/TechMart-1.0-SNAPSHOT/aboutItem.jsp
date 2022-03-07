<%@ page import="com.icbt.TechMart.model.product.ProductImplementation" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.icbt.TechMart.model.Review.CustomerReviews" %>
<%@ page import="sun.font.CreatedFontTracker" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% ArrayList<ProductImplementation> itemDetailsList = (ArrayList<ProductImplementation>) request.getAttribute("selectedItemDetails");
    ArrayList<CustomerReviews> itemReviewList = (ArrayList<CustomerReviews>) request.getAttribute("itemReviewList");
    int reviewCount = 0;
    reviewCount= itemReviewList.size();
    int ratingCount = 0;
    for(int j=0;j<itemReviewList.size();j++){ratingCount += itemReviewList.get(j).getRating();}

    //for navigation bar
    int cartItemCount = (int) request.getAttribute("cartItemCount");
    String loginState = (String) request.getAttribute("firstName");
    int ItemCountInCart = (int) request.getAttribute("ItemCountInCart");

%>

<%@ include file="resources/Include/header.jsp" %>

<%--navigation bar--%>
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
                    <li><a class="dropdown-item" href="CategoryController?category=phone">Phones</a></li>
                    <li><a class="dropdown-item" href="CategoryController?category=charger">Headsets</a></li>
                    <li><a class="dropdown-item" href="CategoryController?category=headset">Chargers</a></li>
                    <li><a class="dropdown-item" href="CategoryController?category=baterry">Battery</a></li>
                    <li><a class="dropdown-item" href="CategoryController?category=cables">Cables</a></li>
                    <li><a class="dropdown-item" href="CategoryController?category=memory Device">Memory devices</a></li>
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






<link rel="stylesheet" href="resources/Include/About%20item/About%20item.css">
<br>


<br>
<div class="container-fluid">
    <div class="row imageContainer">
        <%@ include file="resources/Include/About item/About item slide.jsp" %>
        <div class= "buyContainer col-6">
            <div class="content">
                <div class="row">

                </div>
                <div class="title">
                    <h1><% out.print(itemDetailsList.get(0).getItemName());   %></h1>
                    <h4><% out.print(itemDetailsList.get(0).getMainCategory() +" "+itemDetailsList.get(0).getSubCategory());   %></h4>
                </div>
                <div class="row">

                </div>
                <div class="row">
                    <p class="col-2"><strong>Availability:&nbsp</strong> </p>

                    <% if(itemDetailsList.get(0).getInStockItems() != 0) {%>
                    <p class="col-10" style="color:#49BF16;">&nbspIn stock(in stock <% out.print(" " +itemDetailsList.get(0).getInStockItems()+" "); %> items) </p>
                    <% }else{%>
                    <p class="col-10" style="color:#FF0004;">&nbspOut of stock </p>

                     <% } %>
                </div>
                <div class="price row">
                    <h6 class="col-4" style="color: #E8AE03"><% out.print(reviewCount); %> &nbsp;Reveiw</h6>
                    <h6 class="col-4" style="color: #E8AE03"><% out.print(ratingCount); %> &nbsp;Rating</h6>
                </div>
                <div class="price row">
                    <h6 class="col-2"><strong>Price:</strong>&nbsp&nbsp: </h6>
                        <h3 class="col-2"><% out.print(itemDetailsList.get(0).getPrize()); %> &nbsp;LKR</h3>
                </div>
                <div class="row quantityRow">
                    <div class="qty">
                        <strong>Quantity:</strong>
                        <a href="DecreaseSelectedItemBuyingCountController?itemID=<%=(itemDetailsList.get(0).getItemID())%>" class="btn btn-info">-</a>
                        <a><%out.print("<>");%></a>
                        <a href="IncreaseSelectedItemBuyingCountController?itemID=<%=(itemDetailsList.get(0).getItemID())%>" class="btn btn-info">+</a>

                    </div>
                </div>

                <div >
                    <form method="get" action="CartItemViewController">
                        <div class="d-grid gap-2">
                            <input type="hidden" name="itemId" value="<% out.print(itemDetailsList.get(0).getItemID());%>">
                            <input class="btn btn-primary" type="submit" value="Buy it Now" name="buy" <%if(loginState==null){out.print("disabled");}%> >
                        </div>
                    </form>

                </div>
                <div >
                    <form method="get" action="HomePage">
                        <div class="d-grid gap-2">
                            <input type="hidden" name="itemId" value="<% out.print(itemDetailsList.get(0).getItemID());%>">
                            <input type="hidden" name="path1" value="">
                            <input type="hidden" name="path2" value="">
                            <input class="btn btn-success" type="submit" value="Continue Shopping" name="add" <%if(loginState==null){out.print("disabled");}%> >
                        </div>
                    </form>
                </div>
<% if(loginState== null){  %>
                <div class="alert alert-danger" role="alert" align="center">
                    <b>Log in before buy products</b>
                </div>
<% }%>
                <br>
                <div class="extraText">
                    <ul>
                        <li>Free delivery only branches located areas</li>
                        <li>Colombo|Galle|Kandy|Nugegoda|Gampaha|Kurunegala|Jaffna</li>

                        <li> Delivered within two weeks</li>
                        <li> 7 days return</li>
                    </ul>
                    <div class="paymentPartners">
                        <p style="padding-left:20px;">Our payment partners</p>
                        <div class="row paymentRow">
                            <img src="resources/img/aboutITem/img7.jpg" alt="Visa" class="col-2 payImage" >
                            <img src="resources/img/aboutITem/img8.png" alt="Master" class="col-2 payImage">
                            <img src="resources/img/aboutITem/img9.png" alt="payeer" class="col-2 payImage">
                            <img src="resources/img/aboutITem/img10.png" alt="paypal" class="col-2 payImage">
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </div>
    <div class="desciptionContainer">
        <h3>Descrption</h3>
        <div class="description">
            <table class="table table-striped table-borderless">
                <tr>
                    <td class="descriptionRow">Condition</td>
                    <td>Brand new</td>
                </tr>
                <tr>
                    <td>Brand</td>
                    <td><% out.print(itemDetailsList.get(0).getBrand());%></td>
                </tr>
                <tr>
                    <td>Compatible Brands</td>
                    <td>All Phones</td>
                </tr>
                <tr>
                    <td>Warrenty</td>
                    <td><% out.print(itemDetailsList.get(0).getWarrantyTime());%></td>
                </tr>
            </table>
        </div>
    </div>
    <div class="content">
        <div class= "buyContainer col-12">
            <p><% out.print(itemDetailsList.get(0).getShortDescription());%></p>
        </div>
    </div>
</div>







<%@ include file="resources/Include/footer.html" %>