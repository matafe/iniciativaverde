<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="currentYear" value="2014" />
<spring:message code="footer.label" var="footerLabel" arguments="${currentYear}" htmlEscape="false" />

<div class="footer">
	<p>&copy; ${footerLabel}</p>
</div>
