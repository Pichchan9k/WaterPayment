<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<%@ include file="style.jsp" %>
</head>
<body>
	<p class="home-h1">E-Service</p>
	<div class="box" >
		<div class="menu">
    		<a href="logged/check">
    			<img class="pic" src="http://localhost/picture/download1.png">
    			<p>ข้อมูลผู้ใช้น้ำ</p>
    		</a>
 	 	</div>
 	 	<div class="menu">
 	 		<a href="logged/overdealbalance">
 	 			<img class="pic" src="http://localhost/picture/download2.png">
 	 			<p>รายการค้างชำระ</p>
 	 		</a>	
 	 	</div>
 	 	<div class="menu">
    		<a href="logged/useaverage	">
    			<img class="pic" src="http://localhost/picture/download3.png">
    			<p>ตรวจสอบประวัติการชำระ</p>
    		</a>
 	 	</div>
 	 </div>	
	
	<%@ include file="script.jsp" %>
</body>
</html>