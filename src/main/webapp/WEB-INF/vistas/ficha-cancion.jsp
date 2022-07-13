<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Empanafy</title>
</head>
<body>
	<h2>Ficha de Canción</h2>
	<table>
		<tr>
			<th>Código ISMN</th>
			<td>${cancion.ismn}</td>
		</tr>
		<tr>
			<th>Título</th>
			<td>${cancion.titulo}</td>
		</tr>
		<tr>
			<th>Fecha de Creación</th>
			<td>${cancion.fechaCreacion}</td>
		</tr>
		<tr>
			<th>Duración</th>
			<td>${cancion.duracion}</td>
		</tr>
		<tr>
			<th>Explícita</th>
			<td>${cancion.explicita}</td>
		</tr>
		<tr>
			<th>Género</th>
			<td>${cancion.genero.nombre}</td>
		</tr>
	</table>
</body>
</html>