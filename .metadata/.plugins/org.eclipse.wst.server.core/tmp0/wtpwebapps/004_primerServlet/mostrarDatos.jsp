<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.jacaranda.model.Alumno" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			Alumno alumno = (Alumno) request.getAttribute("atribAlumn");
		%>
	
		<p>Estos son los datos insertados: </p>
		<p>Nombre: <%= alumno.getNombre() %> </p>
		<p>Apellido: <%= alumno.getApellidos() %> </p>
		<p>Promedio: <%= alumno.getPromedio() %> </p> 
	</body>
</html>