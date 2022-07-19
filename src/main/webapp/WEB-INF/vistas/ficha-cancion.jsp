<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Empanafy</title>
		<jsp:include page="estilosbootstrap.jsp"/>
		<link href="/css/estilos.css" rel="stylesheet">  <!-- PARA UTILIZAR PROPIOS ESTILOS -->
	</head>
	<body>
		<div class="container">
			<jsp:include page="header.jsp"/>
			<h2 class="bonito">Ficha de Canción</h2>
			
			<p>ISMN: ${song.ismn}</p>
			<p>${song.titulo}</p>
			<p>${song.explicita}</p>
			<p>INTERPRETE: ${song.interprete.nombre}</p>
			<p>GENERO: ${song.genero.nombre}</p>
			
		</div>
	</body>
</html>