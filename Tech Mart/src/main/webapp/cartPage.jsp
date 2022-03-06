<%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/4/2022
  Time: 1:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar2.jsp" %>

<link rel="stylesheet" href="resources/Include/CSS/ShopingCart.css">

<div class="container" >

  <div class="row cartContainer">
    <div class="leftCol col-lg-8">
      <div class="headBar">
        <h2 class="cart">Shopping Cart</h2>
      </div>

      <ul class="itemList">

<%--        <?php--%>
<%--if($_SESSION['loginStat']==0){--%>
<%--?>--%>
        <div class="alert alert-danger" role="alert" align="center">
          <b>Log in before buy products</b>
        </div>
<%--        <?php--%>
<%--}			--%>

<%--if($Count['count']==0){ ?>--%>
        <div class="alert alert-warning" role="alert">
          Your cart is emty!
        </div>
        <div class="d-grid gap-2">
          <a class="btn btn-warning" type="button" href="">Continue Shoping</a>
        </div>
<%--        <?php --%>
<%--}				--%>
<%--											--%>
<%--$totItem=0;--%>
<%--$totPrice=0;--%>
<%--$sqlGetToCart="SELECT I.*,C.quantity FROM cart C, items I WHERE C.item_id=I.item_id AND C.user_id='$coustemerEmail'";--%>
<%--$resultGetToCart=$link->query($sqlGetToCart);--%>
<%--        while($rowGetToCart=$resultGetToCart->fetch_array()){--%>



<%--        ?>--%>

        <div class="row itemContainer">
          <img src="" class="img-fluid itemImage" alt="item1" width="100px" height="100px">

          <div class="itemContent col-md-6 col-sm-6 col-lg-6">
            <h6 class="ietemDescription" style="color: green;">
              Main category,
              sub category<br>
              name</b>
            </h6><br>
            <p class="brand col-lg-8 col-sm-4 col-mb-4"><strong>Brand :</strong>brand</p>
            <p class="inStock col-lg-6 col-sm-4 col-mb-4">In stock(42 items)</p>

          </div>
          <div class="price col-md-2 col-sm-2 col-lg-2">
            <div class="row">
              <table style="text-align: center;">
                <tr>
                  <td>
                    <a href="">-</a><!-- Minus button-->
                  </td>
                  <td>
                 34
                  </td>
                  <td>
                    <a href="">+</a><!-- Add button-->
                  </td>
                </tr>
              </table>
            </div>
            <div class="valueContainer">
              <p class="value" style="color: royalblue;">34343.99  LKR</p>
            </div>

            <div class="deleteIconcontainer" ><!-- Delete button-->
              <a class="btn" href="" title="Remove from cart">
                <i class="fa fa-trash-o fa-lg deleteIcon" aria-hidden="true"style="color: red;" ></i>
              </a>
            </div>

          </div>
        </div>
<%--        <?php } ?>--%>
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
              <h4>Items</h4>
            </th>
            <th style="text-align: right">
              <?php echo $totItem;?>
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
              <h3>total price 3434.00&nbsp;LKR</h3>
            </th>
          </tr>
        </table>
      </div>
      <form action="Checkout.php" method="post">
        <div class="checkout">
          <input type="hidden" value="" name="coustomerEmail">
          <input type="hidden" value="" name="totPrice">
          <input type="hidden" value="" name="totitem">
<%--          <?php--%>
<%--if($_SESSION['loginStat']==1 && $Count['count']!=0) { --%>
<%--					?>--%>
          <div class="d-grid gap-2">
            <input type="submit" value="Proceed to checkout" class="btn btn-success">
          </div>
<%--          <?php--%>
<%--}--%>
<%--?>--%>

        </div>
      </form>

    </div>
  </div>
</div>

<%@ include file="resources/Include/footer.html" %>
