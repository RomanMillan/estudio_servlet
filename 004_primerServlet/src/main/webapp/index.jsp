<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.jacaranda.controller.ProcesarRegistro" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Inicio</title>
	</head>
	<body>
			<h1>Proporciona tus datos:</h1>
			<form action="ProcesarRegistro" method="post">
				<table cellspacing="3" cellpadding="3" border="1" >
					<tr>
						<td align="right"> Nombre: </td>
						<td><input type="text" name="nombre"></td>
					</tr>
					<tr>
						<td align="right"> Apellidos: </td>
						<td> <input type="text" name="apellidos"> </td>
					</tr>
					<tr>
						<td align="right"> Promedio: </td>
						<td> <input type="number" name="promedio"> </td>
					</tr>
				</table>
				
				<input type="submit" value="Registrar">
				
				<input type="reset" value="Borrar">
				
			</form>
			
			<form action="MuestraRegistro" method="post">
				<input type="submit" value="Ver Alumnos">
			</form>
			
	</body>
</html>