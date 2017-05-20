<%@page import="jayshawn.struts.crud.*"%>
<%@ page language="java" contentType="text/html;charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>


<body>

	
	<s:form action="crud-add">
		<s:textfield name="name" label="Name"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:submit></s:submit>
	</s:form>
	
		<table border="1" cellpadding="10" cellspacing="0" >
			<thead>
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Email</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
			</thead>
			<tbody>
			<s:iterator value="#request.list" > 
				<tr>
					<td>${id }</td>				
					<td>${name }</td>				
					<td>${email }</td>				
					<td><a href="crud-edit?id=${id }">Edit</a></td>				
					<td><a href="crud-delete?id=${id }">Delete</a></td>				
				</tr>
			</s:iterator>
			
			</tbody>
		
		</table>
	
</body>


</html>