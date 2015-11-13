<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<%@ include file="style.jsp" %>
</head>
<body>
	<div class="login-form z-depth-3 ">
		<form:form method="POST" action="/WaterPayment/insert">	
			<div><h1 class="h2-login">Register</h1></div>
			<div class="row half">
				<div class="input-field col s12">
					<form:input id="username" type="text" class="validate" path="c_username"/>
					<label for="username">Username</label>
				</div>
			</div>
			<div class="row half">
				<div class="input-field col s12">
					<form:input id="password" type="password" class="validate" path="c_password"/>
					<label for="password">Password</label>
        		</div>
      		</div>
      		<div class="row half">
      			<button class="btn waves-effect waves-light light-green accent-4 z-depth-2" type="submit" name="action">Register</button>
      			<a href="/WaterPayment/"class="btn waves-effect waves-light orange accent-4 z-depth-2" >Cancel</a>
      		</div>
		</form:form>
		<%@ include file="script.jsp" %>
	</div>
</body>
</html>