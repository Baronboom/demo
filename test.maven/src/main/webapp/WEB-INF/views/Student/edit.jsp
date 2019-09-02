<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page import="java.util.List" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${info.id==null}">
		<form action="insert" method="post">   
			<input name="name">
			
			<select name = "sex">
			<option value = "0">不限</option>
			<option value = "1">男</option>
			<option value = "2">女</option>
			</select>
			
			<select name = "gradesid">
				<c:forEach items="${sublist}"  var="row">
					<option value ="${row.id}">${row.name}</option>
				</c:forEach>
			</select>
			
			<input type="submit">
		</form>
</c:if>
<c:if test="${info.id!=null}">
		<form action="update" method="post"> 
		<input type="hidden" name="id" value="${info.id}">
		<input name="name" value="${info.name}">
		
		<select name = "sex">
		<option value = "0" >不限</option>
		<option value = "1" <c:if test="${info.sex == 1 }">" selected='selected' "</c:if> >男</option>
		<option value = "2" <c:if test="${info.sex == 2 }">" selected='selected' "</c:if>  >女</option>
		</select>
		
		<select name = "gradesid">
		<c:forEach items="${sublist}"  var="row2">
			<option value = "${row2.id}" <c:if test="${row2.id == info.gradesid}">" selected='selected' "</c:if> >${row2.name}</option>
		</c:forEach>
		</select>
		<input type="submit">
	</form>	
</c:if>

</body>
</html>