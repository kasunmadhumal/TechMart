<%--
  Created by IntelliJ IDEA.
  User: Kasun Madhumal
  Date: 3/10/2022
  Time: 12:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar1.jsp" %>
<div class="alert" role="alert" align="center" style="margin-bottom: 30px;margin-top: 50px;color: #4B5457;background-color: #969fa4;">
  <h2>Request To Sales Agent</h2>
</div>

<form action="RequestToSupplier" method="get">

  <div class="form-outline mb-4">
    <label class="form-label" for="form4Example1">Agent ID</label>
    <input type="text" id="form4Example1" class="form-control" name="agent"/>

  </div>

  <div class="form-outline mb-4">
    <label class="form-label" for="form4Example1">Branch</label>
    <input type="text" id="form4Example5" class="form-control" name="branch"/>

  </div>



  <!-- Message input -->
  <div class="form-outline mb-4">
    <label class="form-label" for="form4Example3">Request</label>
    <textarea class="form-control" id="form4Example3" rows="4" name="request"></textarea>

  </div>


  </div>

  <!-- Submit button -->
  <button type="submit" class="btn btn-primary btn-block mb-4">Send</button>
</form>



</body>
</html>
