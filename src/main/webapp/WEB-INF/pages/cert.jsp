<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

  <jsp:include page="common/headTag.jsp"/>
  
	<style>
		div.background
		  {
		  width:80%;
		  height:100%;
		  background:url(<c:url value="/resources/img/gbackground.jpg"/>) repeat;
		  border:2px solid black;
		  }
		div.transbox
		  {
		  margin:15px 15px 15px 15px;
		  background-color:#ffffff;
		  border:1px solid black;
		  opacity:0.6;
		  filter:alpha(opacity=60); /* For IE8 and earlier */
		  }
		div.transbox p
		  {
		  margin:15px 15px 15px 15px;
		  color:#000000;
		  }
	</style>

  <body>
  

    <div class="container">
      <spring:message code="app.title" var="appTitle" htmlEscape="false" />
      <div class="container">
        <div class="page-header">
          <h1>${appTitle}</h1>
        </div>
        
			<div class="background center-block">
				<div class="transbox">
			        <p class="lead text-center">
			        	<strong><fmt:message key="menu.cert"/></strong>
			        </p>			
			        <p class="lead text-center">
			           <spring:message code="cert.participant" var="certParticipant" htmlEscape="false" />
						${certParticipant} ID: ${owner.id} - Website: <strong>${site.url}</strong>.
					</p>
					<p class="lead text-center">
						<spring:message code="cert.valid.until" var="certValidUntil" htmlEscape="false" />
						${certValidUntil}: <strong><fmt:formatDate value="${certificate.validDate.time}" /></strong>
					</p>			
					<p class="lead text-center">
						<spring:message code="cert.message" var="certMessage" arguments="${owner.name}" htmlEscape="false" />
						${certMessage}
					</p>
			</div>
		</div>		
		<p class="lead text-center">

        </p>
        <spring:message code="cert.read.more.at" var="certReadMoreAt" htmlEscape="false" />
        <p class="lead text-center">${certReadMoreAt} <a href="<c:url value="/"/>"><code>https://iniciativaverde-matafe.rhcloud.com</code></a></p>
        
      </div>

      <!-- Site footer -->
       <jsp:include page="common/footer.jsp"/>

    </div>
    
  </body>
  
</html>
