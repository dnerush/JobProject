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
    <title>Main page</title>
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

    <!--Theme Responsive css-->
    <link rel="stylesheet" href="assets/css/responsive.css" />

    <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
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
                        <li><a class="button" href="${pageContext.servletContext.contextPath}/authorization">authorization</a></li>
                        <li><a class="button" href="${pageContext.servletContext.contextPath}/employee_registration">registration</a></li>
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
            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                    <div class="header-details">
                        <h1>Want to find a job quickly?<br> This service is for you<i class="fa fa-circle"></i></h1>
                        <p>Intelligence is nothing without ambitions.</p>
                        <button class="btn btn-default">Read More</button>
                    </div>
                </div>


            </div>
        </div>
    </div>
</header>

<!-- Sections -->
<section id="promotion-area" class="sections">
    <div class="container">
        <!-- Example row of columns -->
        <div class="row">
            <div class="col-sm-4 col-sm-12 col-xs-12">
                <div class="promotion">

                    <h1>Peace<br> of Mind<i class="fa fa-circle"></i></h1>
                    <p>You’re safe with us. The privacy and security of your financial information is our top priority.</p>
                    <a href="#"><h4>more<span><i class="fa fa-long-arrow-right"></i></span></h4></a>   <!-- !!!!!!! MORE-->

                </div>
            </div>

            <div class="col-sm-4 col-sm-12 col-xs-12">
                <div class="promotion">

                    <h1>Free<br>Actually free<i class="fa fa-circle"></i></h1>
                    <p>You’re safe with us. The privacy and security of your financial information is our top priority.</p>
                    <a href="#"><h4>more<span><i class="fa fa-long-arrow-right"></i></span></h4></a>

                </div>
            </div>

            <div class="col-sm-4 col-sm-12 col-xs-12">
                <div class="promotion">

                    <h1>Simple<br> payments<i class="fa fa-circle"></i></h1>
                    <p>You’re safe with us. The privacy and security of your financial information is our top priority.</p>
                    <a href="#"><h4>more<span><i class="fa fa-long-arrow-right"></i></span></h4></a>

                </div>
            </div>

        </div>
    </div> <!-- /container -->
</section>


<section id="our-team" class="sections">
    <div class="container">
        <!-- Example row of columns -->
        <div class="row">
            <div class="team-heading">
                <h1>Our Team<i class="fa fa-circle"></i></h1>
                <p>They are big but still friendly.</p>
            </div>

            <div class="team-member">

                <div class="col-sm-4 col-sm-12 col-xs-12">
                    <div class="team">
                        <img src="assets/images/man1.jpg" alt="" />
                        <div class="team-info img-thumbnail">
                            <h2>Dmitriy Nerush</h2>
                            <h5>Web Developer</h5>
                            <p>Student of KhAI</p>
                        </div>
                    </div>
                </div>

                <div class="col-sm-4 col-sm-12 col-xs-12">
                    <div class="team">
                        <img src="assets/images/man2.jpg" alt="" />
                        <div class="team-info img-thumbnail">
                            <h2>Danil Baranov</h2>
                            <h5>Web Designer</h5>
                            <p>Student of KhAI</p>
                        </div>
                    </div>
                </div>


                <div class="team-more">
                    <a href="#"><h4>more<span><i class="fa fa-long-arrow-right"></i></span></h4></a>
                </div>

            </div>

        </div>

    </div> <!-- /container -->
</section>

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


<script src="assets/js/vendor/jquery-1.11.2.min.js"></script>
<script src="assets/js/vendor/bootstrap.min.js"></script>

<script src="assets/js/plugins.js"></script>
<script src="assets/js/main.js"></script>

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
</html>
