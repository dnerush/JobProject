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
                <li><a href="">CONTACT</a></li>
                    <c:if test="${account_session == null}">
                        <li><a href="${pageContext.servletContext.contextPath}/employee_registration">Registration</a></li>
                        <li><a href="${pageContext.servletContext.contextPath}/authorization">Authorization</a></li>
                    </c:if>
                    <c:if test="${account_session != null}">
                        <li><a href="${pageContext.servletContext.contextPath}/personal_area"> ${accountLogin} </a></li>
                        <li><a href="${pageContext.servletContext.contextPath}/sign_out">Sign out</a></li>
                    </c:if>
            </ul>
        </div>
        <br>Personal Area
        <br>${requestScope.get("account").getLogin()}
        <br>${requestScope.get("account").getPassword()}
        <br>${requestScope.get("account").getEmail()}
        <br> Hello, dear ${requestScope.get("employee").getName()} !
    </div>
</div>
</body>
</html>