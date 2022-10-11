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
	<f:form action="issuenewbookpagetwo" modelAttribute="bookIssueDetails">
		<table>
			<tr>
				<td>Member Code</td>
				<td><f:input path="memberDetails.memberCode" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>