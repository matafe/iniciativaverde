<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<spring:message code="menu.home" var="menuHomeLabel" htmlEscape="false" />
<spring:message code="menu.howworks" var="menuHowworksLabel" htmlEscape="false" />
<spring:message code="menu.hire" var="menuHireLabel" htmlEscape="false" />
<spring:message code="menu.about" var="menuAboutLabel" htmlEscape="false" />
<spring:message code="menu.contact" var="menuContactLabel" htmlEscape="false" />

<div class="masthead">
	<p class="text-right">
		<span>
		    <c:set var="curLocale">${pageContext.response.locale}</c:set>
		    <a href="?lang=pt"><c:choose><c:when test="${curLocale eq 'pt'}"><b>pt</b></c:when><c:otherwise>pt</c:otherwise></c:choose></a> 
		    | 
		    <a href="?lang=en"><c:choose><c:when test="${curLocale eq 'en'}"><b>en</b></c:when><c:otherwise>en</c:otherwise></c:choose></a>
		</span>
	</p>
	<h3 class="text-muted"><spring:message code="project.name" htmlEscape="false" /></h3>
	<ul class="nav nav-justified">
		<li <c:if test="${param.activeMenu eq 'home'}">class="active"</c:if>><a href="<c:url value="/"/>">${menuHomeLabel}</a></li>
		<li <c:if test="${param.activeMenu eq 'howworks'}">class="active"</c:if>><a href="<c:url value="/howworks"/>">${menuHowworksLabel}</a></li>
		<li <c:if test="${param.activeMenu eq 'hire'}">class="active"</c:if>><a href="<c:url value="/hire"/>">${menuHireLabel}</a></li>
		<li <c:if test="${param.activeMenu eq 'about'}">class="active"</c:if>><a href="<c:url value="/about"/>">${menuAboutLabel}</a></li>
		<li <c:if test="${param.activeMenu eq 'contact'}">class="active"</c:if>><a href="<c:url value="/contact"/>">${menuContactLabel}</a></li>
  </ul>
</div>
