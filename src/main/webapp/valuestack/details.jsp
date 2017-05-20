<%@ page language="java" contentType="text/html;charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	productID: ${productId}
	<br><br>
	productName: ${productName}
	<br><br>
	productPrice: ${productPrice}
	<br><br>
	productPrice: ^^<s:property value="productPrice"/>--<s:property value="#session.product.productName"/>
	<br><br>
	<s:property value="@java.lang.Math@cos(0)"/>
	<br><br>
	
	
	
	
</body>
</html>