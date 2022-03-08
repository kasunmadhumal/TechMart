<%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/7/2022
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<div class="col-md-4 col-md-offset-4" id="wrapper" style="margin-top:0px;width:1510px;height: 736px; margin-left:0;" >
  <div id="page-content-wrapper">
    <form class="form loginform" method="get" action="SalesAgentLogin" style="margin-top:150px;width:500px;height:500px;margin-left:500px;" >
      <div class="login-panel panel panel-default">
        <div class="panel-heading">Please Sign in(Sales Agent)</div>
        <div class="panel-body">
          <div class="form-group">
            <label class="control-label">username</label>
            <input type="text" name="username" class="form-control" required="required">
          </div>
          <div class="form-group">
            <label class="control-label">password</label>
            <input type="password" name="passwd" class="form-control" required="required">
          </div>
          <div class="checkbox">
            <label>
              <input name="remember" type="checkbox" value="1">Remember Me
            </label>
          </div>
          <input type="submit" class="btn btn-success loginField" value="Login" name="submitLogin">
        </div>
      </div>
    </form>

    <%@ include file="resources/Include/footerBar.jsp" %>
  </div>
</div>



</body>
</html>
