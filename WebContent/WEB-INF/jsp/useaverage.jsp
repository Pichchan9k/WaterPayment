<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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

		<div><h1 class="home-h1">History</h1></div>
        <div class="card-panel use z-depth-3">
          <table class="t-use highlight">
		 		<tr>
	              	<td data-field="id">อันดับ</td>
	              	<td data-field="name">จำนวนยูนิต</td>
	              	<td data-field="price">จำนานเงิน</td>
	              	<td data-field="time">เวลา</td>
	              	<td data-field="pay">สถานะการชำระ</td>
          		</tr>
 			
 			<% int i=1; %>
 			<c:forEach var="history" items="${historys}">
 				<tr>
 					<td><%=i%></td>
 					<td>${history.getH_unit()}</td>
 					<td>${history.getH_total()}</td>
 					<td>${history.getH_date()}</td>
 					<td><a href="#">${history.getH_status()}</a></td>
 				</tr>
 				<% i++; %>
 			</c:forEach>
		</table>
      	</div>

	
	
	

	<%@ include file="script.jsp" %>
</body>
</html>