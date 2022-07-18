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
		<h2>Listado de Interpretes</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Código</th>
					<th>Nombre</th>
					<th>Nacionalidad</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="interprete" items="${interpretes}">
				<tr>
					<td>${interprete.codigo}</td>
					<td>${interprete.nombre}</td>
					<td>${interprete.nacionalidad}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>