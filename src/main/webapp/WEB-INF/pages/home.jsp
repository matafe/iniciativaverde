<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="<c:url value="/resources/img/favicon.ico"/>">
	<spring:message code="app.title" var="appTitle" htmlEscape="false" />
	<title>${appTitle}</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">

	<style type="text/css">
	
		body {
		  padding-top: 20px;
		}
		
		.footer {
		  border-top: 1px solid #eee;
		  margin-top: 40px;
		  padding-top: 40px;
		  padding-bottom: 40px;
		}
		
		/* Main marketing message and sign up button */
		.jumbotron {
		  text-align: center;
		  background-color: transparent;
		}
		.jumbotron .btn {
		  font-size: 21px;
		  padding: 14px 24px;
		}
		
		/* Customize the nav-justified links to be fill the entire space of the .navbar */
		
		.nav-justified {
		  background-color: #eee;
		  border-radius: 5px;
		  border: 1px solid #ccc;
		}
		.nav-justified > li > a {
		  margin-bottom: 0;
		  padding-top: 15px;
		  padding-bottom: 15px;
		  color: #777;
		  font-weight: bold;
		  text-align: center;
		  border-bottom: 1px solid #d5d5d5;
		  background-color: #e5e5e5; /* Old browsers */
		  background-repeat: repeat-x; /* Repeat the gradient */
		  background-image: -moz-linear-gradient(top, #f5f5f5 0%, #e5e5e5 100%); /* FF3.6+ */
		  background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#f5f5f5), color-stop(100%,#e5e5e5)); /* Chrome,Safari4+ */
		  background-image: -webkit-linear-gradient(top, #f5f5f5 0%,#e5e5e5 100%); /* Chrome 10+,Safari 5.1+ */
		  background-image: -o-linear-gradient(top, #f5f5f5 0%,#e5e5e5 100%); /* Opera 11.10+ */
		  filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f5f5f5', endColorstr='#e5e5e5',GradientType=0 ); /* IE6-9 */
		  background-image: linear-gradient(top, #f5f5f5 0%,#e5e5e5 100%); /* W3C */
		}
		.nav-justified > .active > a,
		.nav-justified > .active > a:hover,
		.nav-justified > .active > a:focus {
		  background-color: #ddd;
		  background-image: none;
		  box-shadow: inset 0 3px 7px rgba(0,0,0,.15);
		}
		.nav-justified > li:first-child > a {
		  border-radius: 5px 5px 0 0;
		}
		.nav-justified > li:last-child > a {
		  border-bottom: 0;
		  border-radius: 0 0 5px 5px;
		}
		
		@media (min-width: 768px) {
		  .nav-justified {
		    max-height: 52px;
		  }
		  .nav-justified > li > a {
		    border-left: 1px solid #fff;
		    border-right: 1px solid #d5d5d5;
		  }
		  .nav-justified > li:first-child > a {
		    border-left: 0;
		    border-radius: 5px 0 0 5px;
		  }
		  .nav-justified > li:last-child > a {
		    border-radius: 0 5px 5px 0;
		    border-right: 0;
		  }
		}
		
		/* Responsive: Portrait tablets and up */
		@media screen and (min-width: 768px) {
		  /* Remove the padding we set earlier */
		  .masthead,
		  .marketing,
		  .footer {
		    padding-left: 0;
		    padding-right: 0;
		  }
		}
		   
	</style> 
  </head>

  <body>

    <div class="container">

      <div class="masthead">
        <h3 class="text-muted"><spring:message code="project.name" htmlEscape="false" /></h3>
        <ul class="nav nav-justified">
          <li class="active"><a href=""<c:url value="/"/>"">Inicio</a></li>
          <li><a href="<c:url value="/howworks"/>">Como Funciona</a></li>
          <li><a href="<c:url value="/contract"/>"">Contratar</a></li>
          <li><a href="<c:url value="/about"/>"">Sobre</a></li>
          <li><a href="<c:url value="/contact"/>"">Contato</a></li>
        </ul>
      </div>

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h1>Neutralização para websites</h1>
        <p class="lead">Os sites hospedados na web consomem energia.</p>
        <p class="lead">A nossa missão é neutralizar o consumo de energia dos sites plantando árvores</p>
        <p><a class="btn btn-lg btn-success" href="<c:url value="/howworks"/>" role="button">Veja como</a></p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="col-lg-4">
        </div>
        <div class="col-lg-4">
        <img alt="" src="<c:url value="/resources/img/tree.jpg"/>">
       </div>
        <div class="col-lg-4">
        </div>
      </div>

      <!-- Site footer -->
      <div class="footer">
        <p>&copy; Iniciativa Verde 2014</p>
      </div>

    </div> <!-- /container -->

  </body>
</html>
