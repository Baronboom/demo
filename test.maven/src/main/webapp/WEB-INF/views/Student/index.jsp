<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del(id) {
		if (confirm("是否删除？")) {
			open("delete?id=" + id, "_self")
		}
	}
</script>

</head>
<body>

	<form action="index" method="post">
		<input name="txt"> <input type="submit" value="查询">
	</form>

	<a href="add">新增</a>
	<table>
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>性别</td>
			<td>班级</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="row" varStatus="v">
			<tr>
				<td>${v.index}</td>
				<td>${row.name}</td>
				<td>${row.sexname}</td>
				<td>${row.gradesname}</td>
				<td><a href="javascript:del(${row.id})">删除</a>
					<a href="edit?id=${row.id}">修改</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>