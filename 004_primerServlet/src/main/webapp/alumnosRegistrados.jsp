<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.jacaranda.model.Alumno" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Alumnos registrados</title>
	</head>
	<body>
		<h1>Alumnos que estan registrados</h1>
		<%
			ArrayList<Alumno> alumnos = null;
			alumnos = (ArrayList<Alumno>)request.getAttribute("Alumnos");
			String numReg = (String) request.getAttribute("contador");
			int numRegistros = Integer.parseInt(numReg);
			
		%>
		
		<table border="1">
			 <tr>
			 	<th>Nombre</th>
			 	<th>Apellidos</th>
			 	<th>Promedio</th>
			 </tr>
			 <%
			 		
			 	for (Alumno alumno: alumnos)
			 		
			 	{
			 %>
			 	  <tr valign="top">
			 		<td><%=alumno.getNombre() %></td>
			 		<td><%=alumno.getApellidos() %></td>
			 		<td><%=alumno.getPromedio() %></td>
			 	  </tr>
			 <% } %>
			 <% alumnos.clear();%>
		</table>
			 
			 <p> Numero de registros : <%= numRegistros %></p>
			 
			 <br>
			 
		 <form action="index.jsp" method="post">
		 	<input type="submit" value="Regresar">
		 </form> 
		
		
	</body>
</html>