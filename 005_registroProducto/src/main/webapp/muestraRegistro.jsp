<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.jacaranda.model.Producto" %> 
  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Muestra registro</title>
	</head>
	<body>
		<h1>Datos del registro</h1>
		<h3>Datos del registro guardado</h3>
		
		<%
			Producto producto = (Producto) request.getAttribute("atributeProducto");
		%>
		
		<p>Clave: <%=producto.getClave() %></p>
		
		<p>Nombre: <%=producto.getNombre() %></p>
		
		<p>Precio: <%=producto.getPrecio() %></p>
		
		<p>Cantidad: <%=producto.getCantidad()  %></p>
		
		<form action="index.jsp" method="post">
			<input type="submit" value="Regresar">
		</form>
		
	</body>
</html>