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
			<th>Issue Serial Number</th>
			<th>Issue Date</th>
			<th>Return Date</th>
			<th>Book Code</th>
			<th>Title</th>
			<th>Author</th>
			<th>Price</th>
			<th>Member Code</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Member Type</th>
			<th>Book Issue Count</th>
		</tr>
		<c:forEach var="bookIssueDetails" items="${allIssueBooks}">
			<tr>
				<td>${bookIssueDetails.issueSerialNumber}</td>
				<td>${bookIssueDetails.issueDate}</td>
				<td>${bookIssueDetails.returnDate}</td>
				<td>${bookIssueDetails.bookDetails.bookCode}</td>
				<td>${bookIssueDetails.bookDetails.title}</td>
				<td>${bookIssueDetails.bookDetails.author}</td>
				<td>${bookIssueDetails.bookDetails.price}</td>
				<td>${bookIssueDetails.memberDetails.memberCode}</td>
				<td>${bookIssueDetails.memberDetails.firstName}</td>
				<td>${bookIssueDetails.memberDetails.lastName}</td>
				<td>${bookIssueDetails.memberDetails.memberType}</td>
				<td>${bookIssueDetails.memberDetails.bookIssueCount}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="issuenewbook">Issue New Book</a>
</body>
</html>

