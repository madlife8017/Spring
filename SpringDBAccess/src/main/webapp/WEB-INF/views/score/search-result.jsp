<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>${stu.stuName}학생의 성적 정보 조회</h2>
	<p>
	
		#국어 : ${stu.kor}<br>
		#국어 : ${stu.eng}<br>
		#국어 : ${stu.math}<br>
		#국어 : ${stu.total}<br>
		#국어 : ${stu.average}<br>
		
		
	
	</p>
	
	<a href="${pageContext.request.contextPath}/score/search">점수 개별조회</a>
	
	

</body>
</html>