<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>University Enrollments</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
        body {
    background-color: #d0e4fe;
}

h2 {
    color:green;
    text-align: center;
    font-family: "Times New Roman"
}
table{
 align: center;
}
    </style>
 
</head>
 
 
<body>
    <h2>List of Employees</h2> 
    <img src="WEB-INF/img/allEmp2.jpg" alt="All Employees"> 
    <table>
        <tr>
            <td>FirstName</td>
            <td>LastName</td>
            <td>DOB</td>
            <td>Salary</td>
            <td>Total Experience</td>
            <td>Role</td>
            <td>Role Manager</td>
            <td>Team Members</td>
            <td>SSN</td>
            <td></td>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
            <td>${employee.fname}</td>
            <td>${employee.lname}</td>
            <td>${employee.dob}</td>
            <td>${employee.salary}</td>
            <td>${employee.totalExperiecne}</td>
            <td>${employee.role}</td>
            <td>${employee.RManager}</td> 
            <td>${employee.teamlMembers}</td>                     
            <td><a href="<c:url value='/edit-${employee.ssn}-employee' />">${employee.ssn}</a></td>
            <td><a href="<c:url value='/delete-${employee.ssn}-employee' />">delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/new' />">Add New Employee</a>
</body>
</html>
