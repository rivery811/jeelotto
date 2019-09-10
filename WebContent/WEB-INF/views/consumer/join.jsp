<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOTTO</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h1>회원가입</h1>
<form id = "consumer" action="<%=request.getContextPath()%>/consumer.do">
	ID : <input type="text" name = "cid"/>
	PASS : <input type="password" name = "pw"/>
	<input type="hidden" name = "action" value = "join" />
	<input type="hidden" name = "dest" value = "login" />
	<input type="submit"  value = "전송"/>

</form>
<script>
	$('#consumer').submit(function(){
	alert('테스트');
	});
</script>

</body>

</html>