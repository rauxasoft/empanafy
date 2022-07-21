<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Empanafy</title>
	<jsp:include page="estilosbootstrap.jsp"/>
</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp"/>
		<h2>Alta de Género</h2>
		
		<form action="./crear-genero" method="POST">
			<table>
				<tr>
					<th>Código</th>
					<td><input type="number" name="codigo"/></td>
				</tr>
				<tr>
					<th>Nombre</th>
					<td><input type="text" name="nombre"/></td>
				</tr>
				<tr>
					<th>Observaciones</th>
					<td><input type="text" name="observaciones"/></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="CREAR GENERO"/></td>
				</tr>
			</table>
		</form>	
	</div>
</body>
</html>