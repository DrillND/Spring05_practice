<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="loginchk" method="post">
		<div>
			<div>
				<h3>로그인</h3>
			</div>
			<div>
				<h5>ID</h5>
			</div>
			<div>
				<input type="text" name="id">
			</div>
			<div>
				<h5>비밀번호</h5>
			</div>
			<div>
				<input type="text" name="pw">
			</div>
			<br>
			<div>
				<input type="submit" value="로그인">
				<input type="submit" value="취소" formaction="/finalfinaltp">
			</div>
			<div>${text}</div>
		</div>
	</form>

</body>
</html>