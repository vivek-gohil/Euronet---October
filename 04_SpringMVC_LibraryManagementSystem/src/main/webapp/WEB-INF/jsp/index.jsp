<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Management System</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Book Code</th>
			<th>Title</th>
			<th>Author</th>
			<th>Price</th>
			<th>Is Issuable</th>
		</tr>
		<c:forEach var="bookDetails" items="${allBookDetails}">
			<tr>
				<td>${bookDetails.bookCode}</td>
				<td>${bookDetails.title}</td>
				<td>${bookDetails.author}</td>
				<td>${bookDetails.price}</td>
				<td>${bookDetails.isIssuable}</td>
			</tr>
		</c:forEach>
	</table>

	<a href="addnewbook">Add Book Details</a>
</body>
</html>

