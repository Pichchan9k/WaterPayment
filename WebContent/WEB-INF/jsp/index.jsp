<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>หน้าแรก</title>
		<%@ include file="style.jsp" %>
		<style>
		.center{
			margin:0 auto;
			margin-top:50px;
		}
		h1{
			color:#FFF;
		}
		</style>
	</head>
	<body>
			<h1 class="center">Index</h1>
		
		<div class="row center">
			<div class="col m6 ">
				<a href="login">	
        			<div class="card-panel grey lighten-5">
        				<h3>Sign In</h3>
					</div>
				</a>
			</div>
			<div class="col m6 ">
				<a href="register">
        			<div class="card-panel grey lighten-5">
        				<h3>Sign Up</h3>
					</div>
				</a>
			</div>
		</div>
		
		
		
		<%@ include file="script.jsp" %>
	</body>
</html>