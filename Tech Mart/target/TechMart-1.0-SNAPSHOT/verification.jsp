
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="resources/Include/header.jsp" %>
<link rel="stylesheet" href="resources/Include/CSS/Verification.css">
<%  String OTPsend = null;
    OTPsend= (String) request.getAttribute("message2");
    String message = null;
    message = (String) request.getAttribute("message");
%>
<% if(message != null){ %>
<div class="alert alert-danger" role="alert" style="text-align: center;">
    Code did not match!
</div>
<% } if(OTPsend != null) {%>
<div class="alert alert-danger" role="alert" style="text-align: center;">
    Enter code that we sent to you!
</div>
<% }  %>

<div class="content">
    <div class="container" >
        <div class="login">
            <h4>Verify your email adress</h4>
        </div>
        <p id="signuptextb">Pleace confirm that you want to use this as your account and email adress. once it done you will be able to start buying</p>

        <%  if(OTPsend == null) {%>
        <p id="signuptextb">Click on Send button for get the code</p>
        <% }  %>


        <%  if(OTPsend != null) {%>
        <p id="signuptextb">Enter the code we sent to your email address</p>
        <p id="signuptextb"><strong>email></strong></p>
        <% }  %>

        <form autocomplete="off"  name="loginForm" class="loginform" method="POST" action="mailVerification">
            <div class="row inputrow">
                <div class="col-sm-1"></div>
                <i class="fa fa-unlock-alt col-sm-1 icn" aria-hidden="true"></i>
                <input type="text" name="otp" placeholder="Enter code here" class="col-sm-8 inputbox">
            </div>
            <div class="row inputrow">
                <div class="col-sm-4"></div>

                <input type="submit" value ="Verify" class="col-sm-4 submitbtn" name="verify">
            </div>
        </form>

        <form autocomplete="off"  name="loginForm" class="loginform" method="POST" action="SendUserVerificationMail">


            <div class="row inputrow">
                <div class="col-sm-4"></div>
                <input type="submit" value ="Send OTP" class="col-sm-4 submitbtn2" name="send">
            </div>
        </form>

    </div>
</div>

<%@ include file="resources/Include/footer.jsp" %>
