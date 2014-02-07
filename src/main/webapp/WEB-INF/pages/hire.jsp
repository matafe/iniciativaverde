<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

  <jsp:include page="common/headTag.jsp"/>

  <body>

    <div class="container">
    
		<jsp:include page="common/menu.jsp" >
		   <jsp:param name="activeMenu" value="hire" />
		</jsp:include>   
		
      <div class="container">
        <div class="page-header">
          <h1><fmt:message key="menu.hire"/></h1>
        </div>
        <spring:message code="hire.calc.pageview.number" var="hireCalcPageviewNumber" htmlEscape="false" />
        <spring:message code="hire.input.pageview.number" var="hireInputPageviewNumber" htmlEscape="false" />
        <spring:message code="hire.calculate" var="hireCalculate" htmlEscape="false" />
        <spring:message code="hire.tree.number" var="hireTreeNumber" htmlEscape="false" />
        
        <p class="lead">${hireCalcPageviewNumber}</p>
        <p class="lead">${hireInputPageviewNumber}:</p>
        <form:form modelAttribute="pageView">
        <p class="lead"><form:input path="pageViews" id="pageViewsInput"/></p>
        <button class="btn btn-lg btn-primary" type="submit">${hireCalculate}</button>
        </form:form>
        <p class="lead"></p>
        <p class="lead">${hireTreeNumber}: ${treesCount} <img alt="" src="<c:url value="/resources/img/tree-small.png"/>"></p>
        
      </div>

       <jsp:include page="common/footer.jsp"/>

    </div> <!-- /container -->

  </body>
</html>
