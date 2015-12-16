<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<h2>Spring... ${message}</h2>

DEBUG: <br>
$ export MAVEN_OPTS="-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=4000,server=y,suspend=n" <br>
$ mvn tomcat:run

<br/>1
<br/>

<a href="<c:url value='/pages/teacher/spring.jsp' />">${pageContext.request.userPrincipal.name}</a>
<br/><br/>

<sec:authorize access="hasRole('STUDENT')">
	STUDENT_ROLE
</sec:authorize>
<sec:authorize access="hasRole('TEACHER_ROLE')">
	TEACHER_ROLE
</sec:authorize>
 
 <sec:authorize ifGranted="TEACHER_ROLE">
	<p>Must have ROLE_ADMIN or ROLE_USER</p>
</sec:authorize>
 
<br/><br/> 
User: ${pageContext.request.userPrincipal} 


</body>
</html>
