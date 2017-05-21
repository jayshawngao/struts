<%@ page language="java" contentType="text/html;charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Test ActionContext Page</h4>
	applicationKey: ${applicationScope.applicationKey }
	<br>
	sessionKey: ${sessionScope.sessionKey }
	<br>
	requestKey: ${requestScope.requestKey }
	<br>
	<s:property value="#attr.list"/>
	<br>
	<s:property value="#attr.array"/>
	<br>
	<s:date name="#attr.date" format="yyyy-MM-dd hh:ss:mm" var="date2" />
	date:${date2 }
	<% Map<String, String> map = new HashMap<String, String>();
		map.put("1", "AA");
		map.put("2","BB");
		request.setAttribute("map", map);
	%>
	<br><br>
	<s:select list="#attr.map" name="select"></s:select>
	<br><br>
	<s:radio list="#attr.map" name="radio"></s:radio>
	<br><br>
	<s:checkboxlist list="#attr.map" name="checkboxlist"></s:checkboxlist>
	
</body>
</html>