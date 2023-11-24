// write a java program to implement JSP tags.


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP TAGS</title>
</head>
<body>
<% out.print(" welcome to jsp");%>
<br>
<%!int data=50; %>
<%="value of verible is"+data %>
<br>
<%=java.util.Calendar.getInstance().getTime() %>
<br>
 the out after adding 4+4 is=<%int x=4+4; %>
</body>
</html>
