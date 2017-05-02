<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="css/style.css">

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
        </div>
    </form>
</body>
</html>
