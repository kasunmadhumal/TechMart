
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.ArrayList" %>
<%@ page import="com.icbt.TechMart.model.product.ProductImplementation" %>
<% ArrayList<ProductImplementation> itemDetailsList = (ArrayList<ProductImplementation>) request.getAttribute("itemList");
   int cartItemCount = (int) request.getAttribute("cartItemCount");
%>



<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar2.jsp" %>
<%@ include file="resources/Include/SlideShow.jsp" %>

<%--<?php--%>
<%--if($_SESSION['loginStat']==0){--%>
<%--?>--%>
<%--<div class="alert alert-danger" role="alert" align="center">--%>
<%--    <b>Log in before buy products</b>--%>
<%--</div>--%>
<%--<?php--%>
<%--}--%>

<div class="alert alert-danger" role="alert" align="center" style="margin-bottom: 30px;margin-top: 50px;">
    <b>latest products</b>
</div>


<div class="container" >
    <div class="row">

<% int length = itemDetailsList.size();
   for(int i=0;i<length;i++) {

%>
        <div class="col-3">
            <table  class="table table-striped table-hover" style="
 				 box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
  				 text-align: center;" >
                <tr>
                    <td style="height:80px;" align="center">
                        <h4><strong><% out.print(itemDetailsList.get(i).getItemName());%></strong></h4>

                    </td>
                </tr>
                <tr>
                    <td style="height:300px;">
                        <img src="<% out.print(itemDetailsList.get(i).getImagePath());%>" alt="image can't load" class="img-thumbnail" width="500px" height="500px" >
                    </td>
                </tr>
                <tr>
                    <td style="height:100px;" align="center">
                        <h3 id="price">2424.00&nbsp;LKR</h3>

                        <form action="About Item.php" method="post">
                            <input type="hidden" name="itemId" value="<% out.print(itemDetailsList.get(i).getItemID());%>">
                            <input type="hidden" name="path1" value="abcd">
                            <input type="hidden" name="path2" value="qwer">
                            <input type="submit" value="Buy Now" name="submit" class="btn btn-success">
                        </form>

                    </td>
                </tr>
            </table>
        </div>
<% } %>
    </div>
</div>


<%@ include file="resources/Include/Paging/Paging 2.0.jsp" %>

<div class="container-fluid">
    <div class="row">
        <%@ include file="resources/Include/footerBar.jsp" %>
    </div>
</div>

</body>
</html>
