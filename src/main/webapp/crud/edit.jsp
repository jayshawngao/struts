<%@ page language="java" contentType="text/html;charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<s:form action="crud-update">
		<s:hidden name="id"></s:hidden>
		<s:textfield name="name" label="Name"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:submit></s:submit>
		</s:form>
</body>
</html>