<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/style1.css">
<link rel="stylesheet" href="css/style.css">


<html>
<head>
    <title>Registration</title>
</head>
<body>
    <form action="${pageContext.servletContext.contextPath}/company_registration" method="POST">
        <fieldset>
            Company registration
            <br>
            <label>Name</label>
            <input type='text' name='name' placeholder='Name' required><span></span>
            <br>
            <label>Type</label>
            <input type='text' name='type' placeholder='Type' required><span></span>
            <br>
            <br>
            <label>Description</label>
            <input type='text' name='description' placeholder='Description' required><span></span>
            <br>
            <label>Country</label>
            <input type='text' name='country' placeholder='Country' required><span></span>
            <br>
            <label>City</label>
            <input type='text' name='city' placeholder='City' required><span></span>
            <br>
        </fieldset>

        <fieldset>
            <label>Phone</label>
            <input type='text' name='phone' placeholder='Phone' required><span></span>
            <br>
            <label>Email</label>
            <input type='email' name='email' placeholder='Email' required><span></span>
            <br>
            <label>Login</label>
            <input type='text' name='login' placeholder='Login' required><span></span>
            <br>
            <label>Password</label>
            <input type='password' name='pass1' placeholder='Password' required><span></span>
            <br>
            <label>Confirm</label>
            <input type='password' name='pass2' placeholder='Confirm' required><span></span>
            <br>
        </fieldset>

        <fieldset>
            <p>Enter the number from the picture</p>
            <img src="https://c22blog.files.wordpress.com/2010/10/input-black.gif">
            <input type='text' name='capcha' placeholder='number' required><span></span>
        </fieldset>
        <div class="sum">
            <input type="submit" value="Sign Up">
            <br><a href="#">Registration</a>
        </div>
    </form>
</body>
</html>
