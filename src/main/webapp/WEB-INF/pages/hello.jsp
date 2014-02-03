<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<spring:message code="app.title" var="appTitle" htmlEscape="false" />
<title>${appTitle}</title>
</head>
<body>
	<h1>Message: ${message}</h1>
	Language :
	<a href="?lang=en">English</a>|
	<a href="?lang=pt">Portugues</a>
</body>
</html>