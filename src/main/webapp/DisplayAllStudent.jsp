<%@page import="com.jsp.spring_mvc.studentdb.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h1 align="center">DISPLAYING ALL DETAILS OF STUDENT!</h1>

<% List<Student> list = (List)request.getAttribute("studentList");%>
	<table border=" " >

		<tr>
			<th>StudentID</th>
			<th>StudentName</th>
			<th>StudentEmail</th>
			<th>StudentAge</th>
			<th>StudentCourse</th>
			<th>UPDATE</th>
			<th>DELETE</th> 

		</tr>
		
		<% for(Student s: list){ %>
		
 	<tr>
                <td> <%= s.getStudentID() %></td>
                 <td> <%= s.getStudentNAME() %></td>
                 <td> <%= s.getStudentEMAIL() %></td>
                 <td> <%= s.getStudentAGE() %></td>
               <td> <%= s.getStudentCOURSE() %></td>
               <td> <a href="find-student-by-ID?studentID=<%= s.getStudentID() %>">UPDATE</a></td>             
              <td> <a href="delete-student-by-ID?studentID=<%= s.getStudentID() %>">DELETE</a></td>
            </tr>

		<%}%>

	</table>

</body>
</html>