<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16BE" />
<title>Insert title here</title>
</head>
<body>

Error: ${param.error} <br/><br/>

	<form name='loginForm' action="<c:url value='/login' />" method='POST'>
	 user:teacher - pass:teacher  <br/> 
	 <br/> 
	 <b>${error} </b> 
		<table>
		
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username' value=''> </td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' /> </td>
			</tr>
			<tr>
				<td><input name="commit" type="submit" value="Sign In" /> </td>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
			</tr>
		</table>
	</form>
<br><br>
$ export MAVEN_OPTS="-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=4000,server=y,suspend=n" <br>
$ mvn tomcat:run
</body>
</html>