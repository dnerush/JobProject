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
        <div class="information">
            <form action="${pageContext.servletContext.contextPath}/jobs" method="POST">
                <div>
                    Keyword:<input style="margin-left: 23px" type="text" name="keyword" id="name" value= ${keyword}>
                    <input type="submit" value="Find"/>
                </div>
                <table>
                <div id="page">
                    <div id="content">
                            <tr>
                                <th>Name</th>
                                <th>Type</th>
                                <th>Description</th>
                                <th>Link</th>
                            </tr>
                            <c:forEach items="${matches}" var="vacancy" varStatus="status">
                                <tr>
                                    <td>${vacancy.getName()}</td>
                                    <td>${vacancy.getType()}</td>
                                    <td>${vacancy.getDescription()}</td>
                                    <td><a href=${vacancy.getSourceLink()}>Link</a></td>
                                </tr>
                            </c:forEach>
                        </div>
                    </div>
                </table>
            </form>
        </div>
    </div>
</div>
</body>
</html>