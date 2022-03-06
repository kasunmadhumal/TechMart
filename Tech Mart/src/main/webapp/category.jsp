<%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/4/2022
  Time: 12:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar2.jsp" %>



<%--$sqlSubCat="SELECT DISTINCT sub_category FROM items WHERE main_category='$catogery'";--%>
<%--$resultSubCat=$link->query($sqlSubCat);--%>
<%--?>--%>
<h1 style="text-align: center;">category</h1>
<div class="container">
    <div class="row">

<%--        <?php--%>
<%--while($rowSubCat=$resultSubCat->fetch_array()){--%>
<%--        ?>--%>
        <div class="col-6">
            <div class="list-group">

                <a type="button" class="list-group-item list-group-item-action " href="">
                    subcategory
                </a>
            </div>
        </div>

<%--        <?php--%>
<%--}--%>
<%--?>--%>

    </div>
</div>
<br>



<%--<?php--%>
<%--if($_SESSION['loginStat']==0){--%>
<%--?>--%>
<div class="alert alert-danger" role="alert" align="center">
    <b>Log in before buy products</b>
</div>
<%--<?php--%>
<%--}--%>

<%--$sqlGetToHome="SELECT * FROM items WHERE main_category='$catogery' LIMIT $start,12";--%>
<%--$resultGetToHome=$link->query($sqlGetToHome);--%>
<%--?>--%>
<div class="container" >
    <div class="row">
<%--        <?php--%>
<%--		while($rowGetToGome=$resultGetToHome->fetch_array()){--%>
<%--        ?>--%>
        <div class="col-3">
            <table  class="table table-striped table-hover" style="
 				 box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
  				 text-align: center;" >
                <tr>
                    <td style="height:80px;" align="center">
                        <h4><strong>name</strong></h4>

                    </td>
                </tr>
                <tr>
                    <td style="height:300px;">
                        <img src="" alt="image can't load" class="img-thumbnail" width="500px" height="500px" >
                    </td>
                </tr>
                <tr>
                    <td style="height:100px;" align="center">
                        <h3 id="price">32323.44&nbsp;LKR</h3>

                        <form action="About Item.php" method="post">
                            <input type="hidden" name="itemId" value="itemid">
                            <input type="hidden" name="path1" value="getgome2">
                            <input type="hidden" name="path2" value="getgome3">
                            <input type="submit" value="Buy Now" name="submit" class="btn btn-success">
                        </form>

                    </td>
                </tr>
            </table>
        </div>
<%--        <?php--%>
<%--		}--%>

<%--		?>--%>
    </div>
</div>

<%@ include file="resources/Include/footer.html" %>
