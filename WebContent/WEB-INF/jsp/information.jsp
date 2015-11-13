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
<div><h1 class="home-h1">Information</h1></div>
	<div class="login-form z-depth-3 ">
	<div class="row">
		<p>ข้อมุลผู้ใช้น้ำ</p>	
	</div>
	<div class="row">
    	<div class="input-field col s12">
      		<input value="${wif.getW_name()}" id="name" type="text" class="validate">
      		<label class="active" for="name">ชื่อ - นามสกุล</label>
    	</div>
    </div>
	<div class="row">
    	<div class="input-field col s12">
      		<input value="${wif.getW_branchno()}" id="branchno" type="text" class="validate">
      		<label class="active" for="branchno">เลขสาขา</label>
    	</div>
    </div>
    <div class="row">
    	<div class="input-field col s12">
      		<input value="${wif.getW_areano()}" id="areano" type="text" class="validate">
      		<label class="active" for="areano">เลขเขต</label>
    	</div>
    </div>
    <div class="row">
    	<div class="input-field col s12">
      		<input value="${wif.getW_registrationno()}" id="registrationno" type="text" class="validate">
      		<label class="active" for="registrationno">ทะเบียนผู้ใช้น้ำ</label>
    	</div>
    </div>
    	<div class="row">
			<p>ข้อมูลที่อยู่</p>
		</div>
		<div class="row">
    	<div class="input-field col s12">
      		<input value="${wif.getW_address()}" id="address" type="text" class="validate">
      		<label class="active" for="address">ที่อยู่</label>
    	</div>
 		</div>
 	</div>
        
	
	<%@ include file="script.jsp" %>
</body>
</html>