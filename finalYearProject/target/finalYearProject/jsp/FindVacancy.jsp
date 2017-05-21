<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Find job</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">

    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <!--        <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">-->


    <!--For Plugins external css-->
    <link rel="stylesheet" href="assets/css/plugins.css" />
    <link rel="stylesheet" href="assets/css/opensans-web-font.css" />
    <link rel="stylesheet" href="assets/css/montserrat-web-font.css" />

    <!--For font-awesome css-->
    <link rel="stylesheet" href="assets/css/font-awesome.min.css" />

    <!--Theme custom css -->
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/modal_style.css">

    <!--Theme Responsive css-->
    <link rel="stylesheet" href="assets/css/responsive.css" />

    <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>

    <script src="assets/js/vendor/jquery-1.11.2.min.js"></script>
    <script src="assets/js/vendor/bootstrap.min.js"></script>

    <script src="assets/js/plugins.js"></script>
    <script src="assets/js/main.js"></script>

    <script src="http://bootstraptema.ru/plugins/jquery/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="http://bootstraptema.ru/plugins/2015/b-v3-3-6/bootstrap.min.js"></script>
    <script src="http://bootstraptema.ru/_sf/3/394.js" type="text/javascript"></script>
</head>



<body>
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->

<div class='preloader'><div class='loaded'>&nbsp;</div></div>
<nav class="mainmenu navbar navbar-default navbar-fixed-top">
    <div class="container">

        <div class="row">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>

                <div class="brand-bg">
                    <a class="navbar-brand" href="${pageContext.servletContext.contextPath}/mainPage"><img src="assets/images/logo2.png" alt="Freelancer Logo" /></a>
                </div>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">


                    <li><a href="${pageContext.servletContext.contextPath}/mainPage">Main</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="${pageContext.servletContext.contextPath}/jobs">Work</a></li>
                    <li><a href="#">Contact</a></li>

                </ul>
                <ul class="pull-right ">

                    <c:if test="${account_session == null}">
                        <!--<li><a class="button" href="${pageContext.servletContext.contextPath}/authorization">authorization</a></li>-->
                        <li><a class="button" data-toggle="modal" href="javascript:void(0)" onclick="openLoginModal();">authorization</a></li>
                        <%--<li><a class="button" href="${pageContext.servletContext.contextPath}/employee_registration">registration</a></li>--%>
                        <li><a class="button" data-toggle="modal" href="javascript:void(0)" onclick="openRegisterModal();">registration</a></li>
                    </c:if>

                    <c:if test="${account_session != null}">
                        <li><a class="button" href="${pageContext.servletContext.contextPath}/personal_area"> ${accountLogin} </a></li>
                        <li><a class="button" href="${pageContext.servletContext.contextPath}/sign_out">sign out</a></li>
                    </c:if>

                </ul>

            </div><!-- /.navbar-collapse -->
        </div>

    </div><!-- /.container-fluid -->
</nav>

<!--Home page style-->
<header class="home-bg">
    <div class="overlay-img">
        <div class="container">
            <div class="header-details">
                <h1>Find your place<i class="fa fa-circle"></i></h1></div>
            <section class="form">



                <form action="${pageContext.servletContext.contextPath}/jobs" method="POST">
                    <div class="row">
                        <div class="col-md-12"><form>
                            <div class="form-group">
                                <input type="text" name="keyword" id="Keyword" value= "${keyword}" class="form-control find-form" placeholder="Request">
                            </div>
                            <div class="form-group">
                                <select name = "select" class="form-control sel-form">
                                    <option <c:if test="${isGlobal == false}"> selected </c:if> value="local" >Local</option>
                                    <option <c:if test="${isGlobal == true}"> selected </c:if>  value="global" >Global</option>
                                </select>
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form></div>
                    </div>
                </form>

                <c:if test="${matches != null && matches.size() != 0}">
                    <table>
                        <div id="page">
                            <div id="content">
                                <tr>
                                    <th>Logo</th>
                                    <th>Name</th>
                                    <th>
                                        <c:if test="${isGlobal == true}"> Company name </c:if>
                                        <c:if test="${isGlobal == false}"> Type </c:if>
                                    </th>
                                    <th>Description</th>
                                </tr>
                                <c:forEach items="${matches}" var="vacancy" varStatus="status">
                                    <tr onClick="location.href='${vacancy.getSourceLink()}'">
                                        <c:if test="${isGlobal == true}">
                                            <td>
                                                <c:if test="${vacancy.getLogoPath() != '' }">
                                                    <img class="vacancyPhoto" src="${vacancy.getLogoPath()}">
                                                </c:if>
                                                <c:if test="${vacancy.getLogoPath() == '' }">
                                                    <img class="vacancyPhoto" src="assets/images/nophoto.png">
                                                </c:if>
                                            </td>
                                        </c:if>
                                        <td>${vacancy.getName()}</td>
                                        <td>
                                            <c:if test="${isGlobal == true}"> ${vacancy.getCompanyName()} </c:if>
                                            <c:if test="${isGlobal == false}"> ${vacancy.getType()} </c:if>
                                        </td>
                                        <td>${vacancy.getDescription()}</td>
                                    </tr>
                                </c:forEach>
                            </div>
                        </div>
                    </table>
                    <nav aria-label="...">
                        <ul class="pager">
                            <c:if test="${isGlobal == true && matches.size() != 0}">
                                <li><a href="${pageContext.servletContext.contextPath}/jobs?act=previous&keyword=${keyword}&isGlobal=${isGlobal}">Previous</a></li>
                                <li><a href="${pageContext.servletContext.contextPath}/jobs?act=next&keyword=${keyword}&isGlobal=${isGlobal}">Next</a></li>
                            </c:if>
                            <span class="glyphicon glyphicon-apple" aria-hidden="true"></span>
                        </ul>
                    </nav>
                </c:if>

                <c:if test="${matches.size() == 0}">
                    <h5>Your search for ${keyword} jobs not found.</h5>
                </c:if>
            </section>
        </div>
    </div>
</header>



<!-- /container -->


<div class="scroll-top">

    <div class="scrollup back-top">
        <i class="fa fa-angle-double-up"></i>
    </div>

</div>

<!--Footer-->
<footer>
    <div class="container">
        <hr>
        <div class="row">

            <div class="col-md-6 col-sm-6 col-xs-12">
                <div class="social-network">
                    <a href="#"><i class="fa fa-twitter"></i></a>
                    <a href="#"><i class="fa fa-instagram"></i></a>
                    <a href="#"><i class="fa fa-facebook"></i></a>
                    <a href="#"><i class="fa fa-google-plus"></i></a>
                </div>
            </div>

            <div class="col-md-6 col-sm-6 col-xs-12">
                <div class="copyright">
                    <p> Kharkov 2017. All rights reserved.</p>
                </div>
            </div>

        </div>
    </div>
</footer>



<script>
    //            scroll top
    $('.back-top').on('click', function(event){
        event.preventDefault();
        $('body,html').animate({
                scrollTop: 0 ,
            }, 500
        );
    });
</script>
</body>

<div class="modal fade login" id="loginModal">
    <div class="modal-dialog login animated">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">Login with</h4>
            </div>
            <div class="modal-body">
                <div class="box">
                    <div class="content">
                        <div class="error"></div>
                        <div class="form loginBox">
                            <form method="POST" action="${pageContext.servletContext.contextPath}/authorization?whence=jsp/FindVacancy.jsp&map=/jobs" accept-charset="UTF-8">
                                <input id="login" class="form-control" type="text" placeholder="Login" name="login" required >
                                <input id="password" class="form-control" type="password" placeholder="Password" name="password" required>
                                <input class="btn btn-default btn-login" type="submit" value="Login">
                            </form>
                        </div>
                    </div>
                </div>
                <div class="box">
                    <div class="content registerBox" style="display:none;">
                        <div class="form">
                            <form method="POST" action="${pageContext.servletContext.contextPath}/employee_registration" accept-charset="UTF-8">
                                <input id="name" class="form-control" type="text" placeholder="Name" name="name">
                                <input id="secondName" class="form-control" type="text" placeholder="Second name" name="secondName">
                                <input id="age" class="form-control" type="text" placeholder="Age" name="age">
                                <input id="sex" class="form-control" type="text" placeholder="Sex" name="sex">
                                <input id="country" class="form-control" type="text" placeholder="Country" name="country">
                                <input id="city" class="form-control" type="text" placeholder="City" name="city">
                                <input id="phone" class="form-control" type="text" placeholder="Phone" name="phone">
                                <input id="email" class="form-control" type="text" placeholder="Email" name="email">
                                <input id="_login" class="form-control" type="text" placeholder="Login" name="login">
                                <input id="password1" class="form-control" type="password" placeholder="Password" name="pass1">
                                <input id="password2" class="form-control" type="password" placeholder="Confirm" name="pass2">
                                <input class="btn btn-default btn-register" type="submit" value="Create account" name="commit">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <div class="forgot login-footer">
 <span>Looking to
 <a href="javascript: showRegisterForm();">create an account</a>
 ?</span>
                </div>
                <div class="forgot register-footer" style="display:none">
                    <span>Already have an account?</span>
                    <a href="javascript: showLoginForm();">Login</a>
                </div>
            </div>
        </div>
    </div>
</div>
</html>

<script>
    $(document).ready(function(){

        if (${error}) {
            openLoginModal();
            alert( 'Incorrect login or password.' );
        }

    });
</script>

<script>
    $(document).ready(function(){/*Если пользователь использует парсер - кидает на авторизацию и аллерт*/
        if(${notLog}) {
            openLoginModal();
            alert( 'To use this function, you need to log in.' );
        }
    });
</script>
