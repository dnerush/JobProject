<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/style.css">



<html>
<head>
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>Job search</title>
    <link href="http://fonts.googleapis.com/css?family=Oswald" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="css/style.css">
</head>



<body>
<div class="intro">
    <div class="conteiner clearfix">
        <div id="logo">
            <h1><a href="${pageContext.servletContext.contextPath}/mainPage">Job search</a></h1>
            <h2>Online service</h2>
        </div>

        <div class="menu">
            <ul>
                <li><a href="${pageContext.servletContext.contextPath}/mainPage">MAIN</a></li>
                <li><a href="${pageContext.servletContext.contextPath}/about">ABOUT</a></li>
                <li><a href="${pageContext.servletContext.contextPath}/jobs">JOBS</a></li>
                <li><a href="">EMPLOYEE</a></li>
                <li><a href="">CONTACT</a></li>
            </ul>
        </div>
        <h1>Andrew and Dmitry welcome you!
            Ukraine, Kharkov</h1>
        <a class="btn" href="${pageContext.servletContext.contextPath}/mainPage" > Come back </a>
    </div>
</div>
</body>
</html>
