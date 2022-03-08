
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar3.jsp" %>
<link rel="stylesheet" href="resources/Include/CSS/AddNewSalesAgent.css">
<div class="wrapper">
    <div class="logo"> <img src="resources/img/signup/background1.png" alt=""> </div>
    <div class="text-center mt-4 name"> TechMart </div>
    <form class="p-3 mt-3" action="AddNewSalesAgentController" method="get">
        <div class="form-field d-flex align-items-center"> <span class="far fa-user"></span> <input type="text" name="userName" id="userName" placeholder="Username" value=""> </div>
        <div class="form-field d-flex align-items-center"> <span class="fas fa-key"></span> <input type="text" name="branch" id="branch" placeholder="branch" value=""> </div>
        <div class="form-field d-flex align-items-center"> <span class="fas fa-key"></span> <input type="password" name="password" id="pwd" placeholder="Password"> </div>
        <button class="btn mt-3" type="submit" name="submit" value="Add new Sales Agent">Add new Sales Agent</button>
    </form>

</div>

</body>
</html>
