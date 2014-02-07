<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

  <jsp:include page="common/headTag.jsp"/>

  <body>

    <div class="container">
    
		<jsp:include page="common/menu.jsp" >
		   <jsp:param name="activeMenu" value="home" />
		</jsp:include>    	

		<spring:message code="home.website.neutralization" var="homeWebsiteNeutralization" htmlEscape="false" />
		<spring:message code="home.website.neutralization.msg1" var="homeWebsiteNeutralizationMsg1" htmlEscape="false" />
		<spring:message code="home.website.neutralization.msg2" var="homeWebsiteNeutralizationMsg2" htmlEscape="false" />
		<spring:message code="home.btn.how" var="homeBtnHow" htmlEscape="false" />

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h1>${homeWebsiteNeutralization}</h1>
        <p class="lead">${homeWebsiteNeutralizationMsg1}</p>
        <p class="lead">${homeWebsiteNeutralizationMsg2}</p>
        <p><a class="btn btn-lg btn-success" href="<c:url value="/howworks"/>" role="button">${homeBtnHow}</a></p>
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
