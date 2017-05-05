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
            <li>
                <li><a href="${pageContext.servletContext.contextPath}/mainPage">MAIN</a></li>
                <li><a href="${pageContext.servletContext.contextPath}/about">ABOUT</a></li>
                <li><a href="${pageContext.servletContext.contextPath}/jobs">JOBS</a></li>
                <li><a href="">CONTACT</a></li>
                <li>
                    <c:if test="${account_session == null}">
                        <li><a href="${pageContext.servletContext.contextPath}/employee_registration">Registration</a></li>
                        <li><a href="${pageContext.servletContext.contextPath}/authorization">Authorization</a></li>
                    </c:if>
                </li>
                <li>
                    <c:if test="${account_session != null}">
                        <li><a href="${pageContext.servletContext.contextPath}/personal_area"> ${accountLogin} </a></li>
                        <li><a href="${pageContext.servletContext.contextPath}/sign_out">Sign out</a></li>
                    </c:if>
                </li>
            </ul>
        </div>
        <br><br>Hi there! Here you can find the right vacancy for you or advertise.
        <p><img src="images/1.jpeg"></p>
        <a class="btn" href="${pageContext.servletContext.contextPath}/jobs" > Find a job!</a>
    </div>
</div>
</body>
</html>
