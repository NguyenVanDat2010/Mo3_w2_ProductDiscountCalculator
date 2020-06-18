<%--
  Created by IntelliJ IDEA.
  User: VCOM
  Date: 18/06/2020
  Time: 4:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
  </head>
  <body>
  <h2>Product</h2>
  <form class="product" action="product" method="post">
    <label>Product Description</label>
    <input type="text" name="description">
    <label>List Price</label>
    <input type="text" name="price">
    <label>Discount percent</label>
    <input type="text" name="percent">
    <input type="submit" value="Calculate Discount">
  </form>

  </body>
</html>
