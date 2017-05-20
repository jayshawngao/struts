<%@ page language="java" contentType="text/html;charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if(application.getAttribute("date")==null)
			application.setAttribute("date", new Date());
		request.setAttribute("date2", new Date());
	%>
	<a href="product-input.action">product-input</a>
	<br><br>
	<a href="TestActionContext.action?name=jayshawn">TestActionContext</a>
	<br><br>
	<a href="TestAwareAction.action?name=jayshawn">TestActionContext</a>
	<br><br>

</body>
</html>