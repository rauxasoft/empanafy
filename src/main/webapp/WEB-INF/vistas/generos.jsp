<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Empanafy</title>
</head>
<body>
	<div>
		<jsp:include page="header.jsp"/>
		<h2>Listado de Géneros</h2>
		<table>
			<thead>
				<tr>
					<th>Código</th>
					<th>Nombre</th>
					<th>Observaciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="genero" items="${generos}">
				<tr>
					<td>${genero.codigo}</td>
					<td>${genero.nombre}</td>
					<td>${genero.observaciones}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>