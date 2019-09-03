<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
登陆成功
<a href="outlogin">注销</a>

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
<a href="../student/index" target="right">学生</a> <br>
<a href="../grades/index" target="right">班级</a>
</div>

<div class="right">
<iframe name="right" width="300" height="300" src="../student/index" onload="ok(this);"></iframe>
</div>
</body>
</html>