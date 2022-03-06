<%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/4/2022
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="resources/Include/header.jsp" %>
<link rel="stylesheet" href="resources/Include/CSS/Verification.css">
<%--<?php--%>

<%--if(isset($_REQUEST['send'])){--%>
<%--$btnval="Resend code";--%>
<%--$btndisable=0;--%>
<%--include("include/sendmail.php");--%>

<%--}--%>
<%--else{--%>
<%--$btnval="Send code";--%>
<%--$btndisable=1;--%>
<%--}--%>
<%--if(isset($_REQUEST['verify'])){--%>
<%--$btnval="Resend code";--%>
<%--$btndisable=0;--%>

<%--if(!empty($_REQUEST['otp'])){--%>
<%--if(strval($_SESSION['otp'])==$_REQUEST['otp']){--%>
<%--echo "Vefification success";--%>

<%--$eMailN=$_SESSION['eMail'];--%>
<%--$fNameN=$_SESSION['fname'];--%>
<%--$lNameN=$_SESSION['lname'];--%>
<%--$phoneN=$_SESSION['phone'];--%>
<%--$passwordEn=$_SESSION['password'];--%>

<%--$sqlInsert="INSERT INTO user VALUES('$eMailN','$fNameN','$lNameN','$passwordEn','$phoneN')";--%>
<%--$resultInsert=$link->query($sqlInsert);--%>

<%--if($resultInsert){--%>
<%--echo("Successfully aded");--%>
<%--header("Location: LoginPage.php");--%>

<%--}--%>
<%--else{--%>
<%--echo("Fail add data");--%>
<%--}--%>


<%--}--%>
<%--else{ ?>--%>
<div class="alert alert-danger" role="alert" style="text-align: center;">
    Code did not match!
</div>
<%--<?php--%>
<%--}--%>
<%--}--%>
<%--else{ ?>--%>
<div class="alert alert-danger" role="alert" style="text-align: center;">
    Enter code that we sent to you!
</div>
<%--<?php--%>
<%--}--%>

<%--}--%>


<%--?>--%>
<div class="content">
    <div class="container" >
        <div class="login">
            <h4>Verify your email adress</h4>
        </div>
        <p id="signuptextb">Pleace confirm that you want to use this as your account and email adress. once it done you will be able to start buying</p>
<%--        <?php--%>
<%--if($btndisable==1){ ?>--%>
        <p id="signuptextb">Click on Send button for get the code</p>
<%--        <?php--%>
<%--}--%>
<%--else{ --%>
<%--?>--%>
        <p id="signuptextb">Enter the code we sent to your email address</p>
        <p id="signuptextb"><strong>email></strong></p>
<%--        <?php --%>
<%--} --%>
<%--?>--%>
        <form autocomplete="off"  name="loginForm" class="loginform" method="POST" action="php it self">
            <div class="row inputrow">
                <div class="col-sm-1"></div>
                <i class="fa fa-unlock-alt col-sm-1 icn" aria-hidden="true"></i>
                <input type="text" name="otp" placeholder="Enter code here" class="col-sm-8 inputbox">
            </div>
            <div class="row inputrow">
                <div class="col-sm-4"></div>
<%--                <?php--%>
<%--if($btndisable==1){ ?>--%>
                <input type="submit" value ="Verify" class="col-sm-4 submitbtn" name="verify" disabled>
<%--                <?php--%>
<%--}--%>
<%--else{--%>
<%--?>--%>
                <input type="submit" value ="Verify" class="col-sm-4 submitbtn" name="verify">
<%--                <?php --%>
<%--}--%>
<%--?>			</div>--%>
            <div class="row inputrow">
                <div class="col-sm-4"></div>
                <input type="submit" value ="button value" class="col-sm-4 submitbtn2" name="send">
            </div>
        </form>
        <div class="toSignup">
<%--            <?php--%>
<%--if($btndisable==0){ ?>--%>
            <p id="signuptext">Don't received a code? Resend it</p>
<%--            <?php--%>
<%--}--%>
<%--?>--%>
        </div>
    </div>
</div>

<%@ include file="resources/Include/footer.html" %>
