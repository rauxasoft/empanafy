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
		<h2>Listado de Canciones</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Código ISMN</th>
					<th>Título</th>
					<th>Genero</th>
					<th>Fecha de Creación</th>
					<th>Duración</th>
					<th>Explícita</th>
					<th>Ver ficha</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cancion" items="${canciones}">
				<tr>
					<td>${cancion.ismn}</td>
					<td >${cancion.titulo}</td>
					<td>${cancion.genero.nombre}</td>
					<td>${cancion.fechaCreacion}</td>
					<td>
					   <fmt:formatNumber value="${cancion.duracion / 60 % 60}" maxFractionDigits="0"/>' 
				       <fmt:formatNumber value="${cancion.duracion % 60}" maxFractionDigits="0"/>''
					<td>${cancion.explicita}</td>
					<td><a href="/empanafy/canciones/${cancion.ismn}">ver</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>