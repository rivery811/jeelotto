<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 로그인</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<div>
	<h1>로그인</h1>
	<form id="login" action="<%=request.getContextPath()%>/consumer.do">
		아이디<input type="text" />
		비밀번호<input type="text" />
		<input type="submit" value= "전송" />
	
	</form>

	</div>
<script></script>
</body>
</html>