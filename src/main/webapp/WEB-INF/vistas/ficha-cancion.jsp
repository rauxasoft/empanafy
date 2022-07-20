<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<meta charset="UTF-8">
		<title>Empanafy</title>
		<jsp:include page="estilosbootstrap.jsp"/>
		<link href="/css/estilos.css" rel="stylesheet">  <!-- PARA UTILIZAR PROPIOS ESTILOS -->
	</head>
	<body>
		<div class="container">
			<jsp:include page="header.jsp"/>
			<h2>Ficha de Canción</h2>
			<article>
				<header>${song.titulo}</header>
				<section>
					<table class="table">
						<tr>
							<th>Código ISMN</th>
							<td>${song.ismn}</td>
						</tr>
						<tr>
							<th>Fecha de Creación</th>
							<td>${song.fechaCreacion}</td>
						</tr>
						<tr>
							<th>Duración (segundos)</th>
							<td>
							    <fmt:formatNumber value="${song.duracion / 60 % 60}" maxFractionDigits="0"/>' 
							    <fmt:formatNumber value="${song.duracion % 60}" maxFractionDigits="0"/>'' 
							</td>
						</tr>
						<tr>
							<th>Instrumental</th>
							<td>${song.instrumental}</td>
						</tr>
						<tr>
							<th>Puntuación (de 0 a 10)</th>
							<td>${song.puntuacion}</td>
						</tr>
						<tr>
							<th>Género</th>
							<td>${song.genero.nombre}  ${song.genero.observaciones}</td>
						</tr>
						<tr>
							<th>Intérprete</th>
							<td>${song.interprete.nombre} ${song.interprete.apellidos} (${song.interprete.nacionalidad})</td>
						</tr>
						<tr>
							<th>Compositor</th>
							<td>${song.compositor.nombre} ${song.compositor.apellidos} (${song.compositor.nacionalidad})</td>
						</tr>
						<tr>
							<th>Observaciones</th>
							<td>${song.observaciones}</td>
						</tr>
					</table>
				</section>
				<footer>
					<c:if test="${song.explicita}"><span>EXPLICITA!</span></c:if>
				</footer>
			</article>
		</div>
	</body>
</html>