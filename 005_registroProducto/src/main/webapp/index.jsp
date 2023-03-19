<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Registrar Producto</title>
	</head>
	<body>
		<h1>Registrar Producto</h1>
		<form action="RegistraProducto" method="post">
			<label>Clave</label>
			<input type="text" name="clave">
			<br>
			
			<label>Nombre</label>
			<input type="text" name="nombre">
			<br>
			
			<label>Precio</label>
			<input type="number" name="precio" step="any">
			<br>
			
			<label>cantidad</label>
			<input type="number" name="cantidad">
			<br>
			
			<input type="submit" value="Registar">
			<input type="reset" value="Borrar">
			
		</form>
		
	</body>
</html>