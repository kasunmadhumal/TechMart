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

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <!--icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <link rel="stylesheet" href="Include/aboutItem.css">

<style>
    @import url(http://fonts.googleapis.com/css?family=Calibri:400,300,700);

    body {
        background-color: #D32F2F;
        font-family: 'Calibri', sans-serif !important
    }

    .mt-100 {
        margin-top: 100px
    }

    .mb-100 {
        margin-bottom: 100px
    }

    .card {
        position: relative;
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        -webkit-box-orient: vertical;
        -webkit-box-direction: normal;
        -ms-flex-direction: column;
        flex-direction: column;
        min-width: 0;
        word-wrap: break-word;
        background-color: #fff;
        background-clip: border-box;
        border: 0px solid transparent;
        border-radius: 0px
    }

    .card-body {
        -webkit-box-flex: 1;
        -ms-flex: 1 1 auto;
        flex: 1 1 auto;
        padding: 1.25rem
    }

    .card .card-title {
        position: relative;
        font-weight: 600;
        margin-bottom: 10px
    }

    .comment-widgets {
        position: relative;
        margin-bottom: 10px
    }

    .comment-widgets .comment-row {
        border-bottom: 1px solid transparent;
        padding: 14px;
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        margin: 10px 0
    }

    .p-2 {
        padding: 0.5rem !important
    }

    .comment-text {
        padding-left: 15px
    }

    .w-100 {
        width: 100% !important
    }

    .m-b-15 {
        margin-bottom: 15px
    }

    .btn-sm {
        padding: 0.25rem 0.5rem;
        font-size: 0.76563rem;
        line-height: 1.5;
        border-radius: 1px
    }

    .btn-cyan {
        color: #fff;
        background-color: #27a9e3;
        border-color: #27a9e3
    }

    .btn-cyan:hover {
        color: #fff;
        background-color: #1a93ca;
        border-color: #198bbe
    }

    .comment-widgets .comment-row:hover {
        background: rgba(0, 0, 0, 0.05)
    }
</style>

</head>
<body >
<div>



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
<%--    <div class="content">--%>
<%--        <div class= "buyContainer col-12">--%>
<%--            <p><% out.print(itemDetailsList.get(0).getShortDescription());%></p>--%>
<%--        </div>--%>
<%--    </div>--%>
    <div class="row d-flex justify-content-center mt-100 mb-100">
        <div class="col-lg-6">
            <div class="card">
                <div class="card-body text-center">
                    <h4 class="card-title">Latest Comments</h4>
                </div>



  <%  for(int i=0;i<itemReviewList.size();i++){%>


                <div class="comment-widgets">
                    <!-- Comment Row -->
                    <div class="d-flex flex-row comment-row m-t-0"><div class="p-2"><img src="resources/img/aboutITem/user.jpg" alt="user" width="50" class="rounded-circle"></div>
                        <div class="comment-text w-100">
                            <h6 class="font-medium"><%out.print(loginState);%></h6> <span class="m-b-15 d-block"><%out.print(itemReviewList.get(i).getDescription());%> </span>
                            <div class="comment-footer"> <span class="text-muted float-right">April 14, 2019</span> <button type="button" class="btn btn-cyan btn-sm">Edit</button> <button type="button" class="btn btn-success btn-sm">Publish</button> <button type="button" class="btn btn-danger btn-sm">Delete</button> </div>
                        </div>
                    </div>
                </div> <!-- Comment Row -->

<% } %>


                <form action="CustomerCommentController" method="get">
                <input type="text" placeholder="Your comment" name="comment" style="width: 600px;height: 50px;">
                    <input type="text" value="<% out.print(itemDetailsList.get(0).getItemID());%>" name="itemID" hidden>
                   <br> <input type="submit" name="submit" value="submit comment" style="color: #D32F2F">

                </form>
                </div> <!-- Card -->
            </div>
        </div>
    </div>








</div>







<%@ include file="resources/Include/footer.jsp" %>