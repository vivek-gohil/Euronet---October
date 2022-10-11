<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Management System</title>
</head>
<body>
	<h3>Get Member Details By Member Code</h3>
	<hr>
	<f:form action="showmemberdetails" modelAttribute="memberDetails">
		<table>
			<tr>
				<td>Member Code</td>
				<td><f:input path="memberCode" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Show"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>