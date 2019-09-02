<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	<script type="text/javascript">
		function del(id) {
			if (confirm("是否删除?")) {
				open("delete?id=" + id, "_self");
			}
		}
	</script>
	
	<form action="index">
		<input name="txt"> <input type="submit" value="查询">
	</form>
	
	<a href="add">新增</a>
	<table>
		<tr>
			<td>编号</td>
			<td>班级</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="r" varStatus="v">
			<tr>
				<td>${v.index}</td>
				<td>${r.name}</td>
				<td><a href="javascript:del(${r.id})">删除</a> <a
					href="edit?id=${r.id}">修改</a></td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>