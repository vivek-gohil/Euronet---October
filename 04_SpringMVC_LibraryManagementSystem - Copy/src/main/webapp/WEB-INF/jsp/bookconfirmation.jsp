<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Management System</title>
</head>
<body>
	<h3>Book Details Confirmation</h3>
	<hr>
	<form action="finish">
		<table>
			<tr>
				<td>Book Title</td>
				<td>${bookDetails.title}</td>
			</tr>
			<tr>
				<td>Author</td>
				<td>${bookDetails.author}</td>
			</tr>
			<tr>
				<td>Price</td>
				<td>${bookDetails.price}</td>
			</tr>
			<tr>
				<td>Is issuable</td>
				<td>${bookDetails.isIssuable}</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add Book"></td>
			</tr>
		</table>
	</form>
</body>
</html>