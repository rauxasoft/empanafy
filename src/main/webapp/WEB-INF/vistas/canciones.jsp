<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Empanafy</title>
	<jsp:include page="estilosbootstrap.jsp"/>
</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp"/>
		<h2>Listado de Canciones</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Código Ismn</th>
					<th>Título</th>
					<th>Genero</th>
					<th>Fecha de Creación</th>
					<th>Duración</th>
					<th>Explícita</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cancion" items="${canciones}">
				<tr>
					<td>${cancion.ismn}</td>
					<td>${cancion.titulo}</td>
					<td>${cancion.genero.nombre}</td>
					<td>${cancion.fechaCreacion}</td>
					<td>${cancion.duracion}</td>
					<td>${cancion.explicita}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>