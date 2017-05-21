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
    <title>Addition CV</title>
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
    <div class="cv">
    <div class="content cfx">
        <div class="container summary">
            <div class="main-content no-sidebasr">
                <h1 class="summary-letter">Резюме</h1>
            </div>
            <div class="fields-wrapper">
                <h2 class="contact-inf">Личные данные</h2>
                <div class="row row-pad">
                    <div class="col-md-9">
                        <div class="row row-pad">
                            <!--               Имя Фамия Отчество-->
                            <div class="col-md-12">
                                <div class="row row-pad ">
                                    <div class="col-md-4">
                                        <label for="cv-last_name">Фамилия</label>
                                        <span class='span-required'>*</span>
                                        <input  class='cv_name' id="cv-last_name" type="text" name="last_name" required="required" maxlength="64" minlength="0">
                                    </div>



                                    <div class="col-md-4">
                                        <label for="cv-first_name">Имя</label>
                                        <span class='span-required'>*          </span>
                                        <input class='cv_name' id="cv-first_name" type="text" name="first_name" required="required" maxlength="64" minlength="0">
                                    </div>


                                    <div class="col-md-4">
                                        <label for="cv-patronymic">Отчество</label>
                                        <span class='span-required'>*</span>
                                        <input class='cv_name' id="cv-patronymic" type="text" name="patronymic" required="required" maxlength="64" minlength="0">
                                    </div>
                                </div>
                            </div>



                            <div class="col-md-12">
                                <div class="row row-pad">
                                    <div class="col-md-3 input-row-block">
                                        <label for="cv-birthday_date">
                                            Дата рождения
                                            <span class='span-required'>*</span>
                                        </label>
                                        <input id="cv-birthday_date_select" class="disable-keyinput" placeholder="ДД.ММ.ГГГГ" type="text" name="birthday_date" value required="required" data-type="datepicker_select " data-format="dd.mm.yy" data-year-range="1950:2017" data-default aria-required="true">


                                    </div>
                                    <div class="col-md-3 input-row-block">
                                        <label for="cv-sex">
                                            Пол
                                            <span class='span-required'>*</span>
                                        </label>
                                        <select class="form-control">
                                            <option>Мужской</option>
                                            <option>Женский</option>
                                        </select>

                                    </div>

                                    <div class="col-md-6 input-row-block">
                                        <label for="cv-registration_address">Адрес регистрации
                                            <span class='span-required'>*</span>
                                        </label><input class="cv_adress" id="cv-registration_address" class="fieldError" type="text" name="registration_address" value="" required="required" maxlength="64" minlength="0" placeholder="Город, улица, дом, квартира" aria-required="true" aria-invalid="true">

                                    </div>


                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="row row-pad ">

                                    <div class="col-md-6 input-row-block">
                                        <label for="cv-citizenship">Гражданство
                                            <span class='span-required'>*</span>
                                            <select class="form-control cv_adress marg">
                                                <option>Украина</option>
                                                <option>Гражданство другой страны</option>
                                            </select>
                                        </label>


                                    </div>
                                    <div class="col-md-6 input-row-block">
                                        <label for="">Адрес проживания
                                            <span class='span-required'>*</span>
                                        </label>
                                        <input class="cv_adress" id="cv-residential_address" class="fieldError" type="text" name="residential_address" value="" required="required" maxlength="64" minlength="0" placeholder="Город, улица, дом, квартира" aria-required="true" aria-invalid="true" aria-describedby="cv-residential_address-error cv-residential_address-error cv-residential_address-error cv-residential_address-error cv-residential_address-error">
                                    </div>
                                </div>


                            </div>

                            <div class="row row-pad row-space-two">
                                <div class="col-sm-8">
                                    <h2 class="contact-inf">Контактная информация</h2>
                                    <div class="row row-pad">
                                        <div class="col-md-6 input-row-block">
                                            <label for="cv-email">E-mail
                                                <span class='span-required'>*</span>
                                            </label>
                                            <input class="cont-size" id="cv-email" class="emailinput  fieldError" type="email" name="email" maxlength="255" value="" required="required" aria-required="true" aria-invalid="true" aria-describedby="cv-email-error cv-email-error cv-email-error cv-email-error cv-email-error">
                                        </div>
                                        <div class="col-md-6 input-row-block">
                                            <label for="cv-mobile_phone">Мобильный телефон
                                                <span class='span-required'>*</span>
                                            </label>
                                            <input class="cont-size" id="cv-mobile_phone" class="mobile_phone fieldError" type="text" name="mobile_phone" value="+380" required="required" maxlength="15" minlength="5" placeholder="" aria-required="true">
                                        </div>

                                    </div>
                                    <div class="row row-pad">
                                        <div class="col-md-6 input-row-block">
                                            <label for="cv-dop-mob">Доп. телефон
                                                <span class='span-required'>*</span>
                                            </label>
                                            <input class="cont-size" id="cv-dop-mob" class="fieldError" type="text" name="dop-mo" maxlength="255" value="" required="required" aria-required="true" aria-invalid="true">
                                        </div>
                                        <div class="col-md-6 input-row-block">
                                            <label for="cv-skype">Skype
                                                <span class='span-required'>*</span>
                                            </label>
                                            <input class="cont-size" id="cv-skypee" class="skype fieldError" type="text" name="skype"  required="required" maxlength="15" minlength="5" placeholder="" >
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 photo-wrapper">
                        <img src="https://vk.com/images/camera_200.png" alt="..." class="img-thumbnail" s>
                        <a href="" class="span-center" >добавить фото</a>
                    </div>
                </div>
                <h2 class="contact-inf">Образование</h2>
                <div class="row row-pad">
                    <div class="col-sm-6">
                        <label for="educational">Учебное заведение	</label>
                        <span class='span-required'>*</span>
                        <select id="educational" class="form-control">
                            <option>1</option>
                            <option>2</option>
                        </select>

                    </div>
                    <div class="col-sm-6">
                        <label for="speciality">Cпециальность	</label>
                        <span class='span-required'>*</span>
                        <input id="speciality" type="text" name="speciality" required="required" maxlength="200" minlength="0">
                    </div>




                </div>
                <div class="row row-pad">
                    <div class="col-sm-3">
                        <label for="">Уровень подготовки</label>
                        <span class='span-required'>*</span>
                        <select id="levelOfTraining" class="form-control">
                            <option>Не достигнут</option>
                            <option>Бакалавр</option>
                            <option>Специалист</option>
                            <option>Магистр</option>
                        </select>
                    </div>
                    <div class="col-sm-3">
                        <label for="">Вид обучения</label>
                        <span class='span-required'>*</span>
                        <select id="typeOfStudeing" class="form-control">
                            <option>Вечернее</option>
                            <option>Дневное</option>
                            <option>Заочное</option>
                            <option>Дистанционное</option>
                        </select>
                    </div>
                    <div class="col-sm-3">
                        <label for="">Год окончания</label>
                        <span class='span-required'>*</span>
                        <select id="yearOfEnding" class="form-control">
                            <option>1</option>
                            <option>2</option>
                        </select>
                    </div>

                </div>
            </div>

        </div>
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
