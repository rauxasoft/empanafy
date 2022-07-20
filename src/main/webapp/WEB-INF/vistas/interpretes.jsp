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
		<h2>Listado de Interpretes</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Código</th>
					<th>Nombre Completo</th>
					<th>Nacionalidad</th>
					<th>Fecha de Nacimiento</th>
					<th>Fecha de Defunción</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="interprete" items="${gugu}">
				<tr>
					<td>${interprete.codigo}</td>
					<td>${interprete.nombre} ${interprete.apellidos}</td>
					<td>${interprete.nacionalidad}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${interprete.fechaNacimiento}"/></td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${interprete.fechaDefuncion}"/></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>