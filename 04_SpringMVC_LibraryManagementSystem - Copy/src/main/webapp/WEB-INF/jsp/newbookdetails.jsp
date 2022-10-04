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
	<h3>Add New Book</h3>
	<hr>
	<f:form action="confirmation" modelAttribute="bookDetails">
		<table>
			<tr>
				<td>Book Title</td>
				<td><f:input path="title" /></td>
			</tr>
			<tr>
				<td>Author</td>
				<td><f:input path="author" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><f:input path="price" /></td>
			</tr>
			<tr>
				<td>Is issuable</td>
				<td><f:checkbox path="isIssuable" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>