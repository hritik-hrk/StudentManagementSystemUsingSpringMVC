<%@page import="com.jsp.spring_mvc.studentdb.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h1>Update the Student details </h1>

<% Student student = (Student)request.getAttribute("studentObject");%>



<form action="save-updated-student" method="post">

<input type="number" value= "<%= student.getStudentID()  %>" name="studentID" readonly="readonly"> <br>

<input type="text" value= "<%= student.getStudentNAME()  %>" name="studentNAME"> <br>

<input type="text" value= "<%= student.getStudentEMAIL() %>" name="studentEMAIL"> <br>

<input type="number" value= "<%= student.getStudentAGE()  %>" name="studentAGE"> <br>

<input type="text" value="<%= student.getStudentCOURSE() %>" name="studentCOURSE"> <br>


<input type="submit" value="Update STUDENT">


</form>

</body>
</html>