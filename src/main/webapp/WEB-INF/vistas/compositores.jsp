<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
		<h2>Listado de Compositores</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Código</th>
					<th>Nombre</th>
					<th>Nacionalidad</th>
					<th>Fecha de Nacimiento</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="compositor" items="${compositores}">
				<tr>
					<td>${compositor.codigo}</td>
					<td>${compositor.nombre}</td>
					<td>${compositor.nacionalidad}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${compositor.fechaNacimiento}"/></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>