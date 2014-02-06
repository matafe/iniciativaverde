<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

      <div class="masthead">
        <h3 class="text-muted"><spring:message code="project.name" htmlEscape="false" /></h3>
        <ul class="nav nav-justified">
          <li><a href="#">Home</a></li>
          <li><a href="<c:url value="/howworks"/>">Como Funciona</a></li>
          <li><a href="<c:url value="/contract"/>"">Contratar</a></li>
          <li class="active"><a href="<c:url value="/about"/>"">Sobre</a></li>
          <li><a href="<c:url value="/contact"/>"">Contato</a></li>
        </ul>
      </div>