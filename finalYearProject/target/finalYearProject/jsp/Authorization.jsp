<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="css/style.css">

<html>
<head>
    <title>Authorization</title>
</head>
<body>

    <div class="menu">
        <ul>
            <li><a href="${pageContext.servletContext.contextPath}/mainPage">MAIN</a></li>
            <li><a href="${pageContext.servletContext.contextPath}/about">ABOUT</a></li>
            <li><a href="${pageContext.servletContext.contextPath}/jobs">JOBS</a></li>
            <li><a href="">EMPLOYEE</a></li>
            <li><a href="">CONTACT</a></li>
        </ul>
        <li><a href="${pageContext.servletContext.contextPath}/employee_registration">Employee_Registration</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/company_registration">Company_Registration</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/authorization">Autorization</a></li>
    </div>

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
