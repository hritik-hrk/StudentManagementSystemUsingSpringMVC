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


<h1>delete the Student details </h1>

<% Student student = (Student)request.getAttribute("studentObjectdelete");%>



<form action="save-deleted-student" method="post">

<input type="number" value= "<%= student.getStudentID()  %>" name="studentID" readonly="readonly"> <br>

<input type="text" value= "<%= student.getStudentNAME()  %>" name="studentNAME" readonly="readonly"> <br>

<input type="text" value= "<%= student.getStudentEMAIL() %>" name="studentEMAIL" readonly="readonly"> <br>

<input type="number" value= "<%= student.getStudentAGE()  %>" name="studentAGE" readonly="readonly"> <br>

<input type="text" value="<%= student.getStudentCOURSE() %>" name="studentCOURSE" readonly="readonly"> <br>


<input type="submit" value="DELETE STUDENT">


</form>


</body>
</html>