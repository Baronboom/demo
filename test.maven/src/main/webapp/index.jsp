<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
登陆成功
<a href="User/outlogin">注销</a>

<style>
.left{
	width: 15%;height: 500px;
}
.right{
	width: 85%;height: 500px;position: absolute;left: 15%;top:0;
}
</style>

<script type="text/javascript">
function ok(o){
	if(o.contentWindow.location.href.indexOf("login")>0){
		open("login.html","_self");
	}
}
</script>
<div class="left">
<s:hasPermission name="add">
<a href="student/add" target="cc">student/add</a> <br>
</s:hasPermission>
<s:hasPermission name="test"><!-- 如果没有test权限，这里肯定不显示 -->
<a href="student/add" target="cc">student/add</a> <br>
</s:hasPermission>
<a href="student/index" target="cc">学生</a> <br>
<a href="grades/index" target="cc">班级</a>
</div>

<div class="right">
<iframe name="cc" width="300" height="300" src="student/index" onload="ok(this);"></iframe>
</div>
</body>
</html>