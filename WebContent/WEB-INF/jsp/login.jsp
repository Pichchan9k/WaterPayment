<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.2/css/materialize.min.css"> -->
	<link type="text/css" rel="stylesheet" href="../css/materialize.min.css"  media="screen,projection"/>
	<style>
	.login-form {
		width: 50%;
		margin:0 auto;
		margin-top: 130px;
		text-align: center;
		color:#26a69a;
		border: 1px solid #FFF;
		background-color: #FFF;
		border-radius: 3px;
	}
	
	.half {
		width: 70%;
	}
	.h1-login{
		color:#26a69a;
	}
	body {
		background-color: #26a69a;
	}
	
	</style>

</head>
<body>
	
	<div class="login-form z-depth-3">
    	<form class="col s8" method="POST" action="">
    		<div><h1 class="h2-login">Log In</h1></div>
      		<div class="row half">
        		<div class="input-field col s12">
          			<input id="username" type="text" class="validate">
          			<label for="username">Username</label>
        		</div>
        	</div>
        	<div class="row half">
        		<div class="input-field col s12">
          			<input id="password" type="password" class="validate">
          			<label for="password">Password</label>
        		</div>
      		</div>
      		<div class="row half">
      			<button class="btn waves-effect waves-light light-green accent-4 z-depth-2" type="submit" name="action">Login</button>
      			<a href="register"class="btn waves-effect waves-light orange accent-4 z-depth-2" >Register</a>
      		</div>
    	</form>
  	</div>
	<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
      <script type="text/javascript" src="../js/materialize.min.js"></script>
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.2/js/materialize.min.js"></script> -->
</body>
</html>