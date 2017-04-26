<%--
  Created by IntelliJ IDEA.
  User: Sky_el
  Date: 22.03.2017
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/authorization" method="POST">
    <fieldset>
        <label>Login:</label>
        <input type='login' name='login' placeholder='Login' required><span></span>
        <br>
    </fieldset>
    <fieldset>
        <label>Password:</label>
        <input type='password' name='password' placeholder='Password' required><span></span>
        <br>
    </fieldset>
    <div class="sum">
        <input type="submit" value="Sign In">
        <br><a href="#">Sign in</a>
    </div>
</form>
</body>
</html>
