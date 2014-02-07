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
		   <jsp:param name="activeMenu" value="howworks" />
		</jsp:include>    

      <div class="container">
        <div class="page-header">
          <h1><fmt:message key="menu.howworks"/></h1>
        </div>
        <p class="lead"><fmt:message key="menu.howworks"/>...</p>
      </div>

      <!-- Site footer -->
       <jsp:include page="common/footer.jsp"/>

    </div> <!-- /container -->

  </body>
</html>
