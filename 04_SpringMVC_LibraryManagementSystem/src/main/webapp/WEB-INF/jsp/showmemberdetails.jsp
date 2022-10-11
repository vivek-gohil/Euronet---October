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
	<h3>Member Details By Member Code</h3>
	<hr>

	<table>
		<tr>
			<td>Member Code</td>
			<td>${memberDetails.memberCode }</td>
		</tr>
		<tr>
			<td>First Name</td>
			<td>${memberDetails.firstName }</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${memberDetails.lastName }</td>
		</tr>
		<tr>
			<td>Member Type</td>
			<td>${memberDetails.memberType }</td>
		</tr>
		<tr>
			<td>Book Issue Count</td>
			<td>${memberDetails.bookIssueCount }</td>
		</tr>
	</table>
</body>
</html>