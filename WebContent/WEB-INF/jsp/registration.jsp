<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Form</title>

<style>
.error {
	color: #ff0000;
}
</style>

</head>

<body>

	<h2>Registration Form</h2>

	<form:form method="POST" modelAttribute="employee">
		<form:input type="hidden" path="id" id="id" />
		<table>
			<tr>
				<td><label for="fname">First Name: </label></td>
				<td><form:input path="fname" id="fname" /></td>
				<td><form:errors path="fname" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="lname">Last Name: </label></td>
				<td><form:input path="lname" id="lname" /></td>
				<td><form:errors path="lname" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="dob">Date of Birth: </label></td>
				<td><form:input path="dob" id="dob" /></td>
				<td><form:errors path="dob" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="salary">Salary: </label></td>
				<td><form:input path="salary" id="salary" /></td>
				<td><form:errors path="salary" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="totalExperience">Total Experience </label></td>
				<td><form:input path="totalExperiecne" id="totalExperiecne" /></td>
				<td><form:errors path="totalExperiecne" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="role">Role: </label></td>
				<td><form:input path="role" id="role" /></td>
				<td><form:errors path="role" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="RManager">Role Manager: </label></td>
				<td><form:input path="RManager" id="RManager" /></td>
				<td><form:errors path="RManager" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="teamlMembers">Team Members: </label></td>
				<td><form:input path="teamlMembers" id="teamlMembers" /></td>
				<td><form:errors path="teamlMembers" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="ssn">SSN: </label></td>
				<td><form:input path="ssn" id="ssn" /></td>
				<td><form:errors path="ssn" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update" />
						</c:when>
						<c:otherwise>
							<input type="submit" value="Register" />
						</c:otherwise>
					</c:choose></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/list' />">List of All Employees</a>
</body>
</html>