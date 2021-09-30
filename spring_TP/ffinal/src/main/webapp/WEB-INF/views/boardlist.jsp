<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table class="table-wrapper">
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성날짜</th>
				<th>작성자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td><c:if test="${dto.idx ne '0'}">${dto.idx}</c:if></td>
					<td>${dto.title}</td>
					<td>${dto.wdate}</td>
					<td>${dto.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>