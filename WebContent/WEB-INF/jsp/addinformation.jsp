<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>เพิ่มรายการทะเบียนผู้ใช้น้ำ</title>
<%@ include file="style.jsp" %>
</head>
<body>
	<div class="login-form z-depth-3 ">
    	<form:form class="col s8" method="POST" action="/WaterPayment/logged/validateWaterUser" modelAttribute="addinformation">
    		<h4>เพิ่มรายการทะเบียนผู้ใช้น้ำ</h4>
      			<div class="row half">
        			<div class="input-field col s6 ">
          				<form:input id="branchno" type="text" class="validate" length="2" path="w_branchno"/>
          				<label for="branchno">เลขสาขา</label>
        			</div>
        		<div class="input-field col s6">
          			<form:input id="w_areano" type="text" class="validate" length="2" path="w_areano"/>
          			<label for="w_areano">เลขเขต</label>
        		</div>
        	</div>
        	<div class="row half">
        		<div class="input-field col s8">
          			<form:input id="w_registrationno" type="text" class="validate" length="7" path="w_registrationno"/>
          			<label for="w_registrationno">เลขทะเบียนผู้ใช้น้ำ</label>
        		</div>
      		</div>
      		<div class="row half">
      			<button class="btn waves-effect waves-light light-green accent-4 z-depth-2" type="submit" name="action">ยืนยัน</button>
      			<a href="register"class="btn waves-effect waves-light orange accent-4 z-depth-2" >ยกเลิก</a>
      		</div>
    	</form:form>
  	</div>
		
		<%@ include file="script.jsp" %>
</body>
</html>