<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Issue Book</h3>
	<hr>
	<f:form action="issuebook" modelAttribute="bookIssueDetails">
		<table>
			<tr>
				<td>Member Code</td>
				<%-- 				<td>${bookIssueDetails.memberDetails.memberCode }</td> --%>
				<td><f:input path="memberDetails.memberCode" disabled="true" /></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><f:input path="memberDetails.firstName" disabled="true" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>${bookIssueDetails.memberDetails.lastName }</td>
			</tr>
			<tr>
				<td>Book Code</td>
				<td>${bookIssueDetails.bookDetails.bookCode }</td>
			</tr>
			<tr>
				<td>Title</td>
				<td>${bookIssueDetails.bookDetails.title }</td>
			</tr>
			<tr>
				<td>Author</td>
				<td>${bookIssueDetails.bookDetails.author }</td>
			</tr>
			<tr>
				<td>Issue Date</td>
				<td>${bookIssueDetails.issueDate }</td>
			</tr>
			<tr>
				<td>Return Date</td>
				<td>${bookIssueDetails.returnDate }</td>
			</tr>
			<tr hidden="true">
				<td><f:input path="memberDetails.memberCode" /></td>
				<td><f:input path="bookDetails.bookCode" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>