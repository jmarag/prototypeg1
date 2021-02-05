<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/css/estilo.css">
	<title>Gestión de Usuarios</title>
</head>
<body>
	<jsp:include page="Navegation.jsp"/>
	<h1>Gestión de Usuarios</h1>
	<hr>
	<h2>Listado de Usuarios</h2>
	<table>
		<tr>
			<th>DNI</th>
			<th>Nombre</th>
			<th>Email</th>
			<th>Primer Apellido</th>
			<th>Segundo Apellido</th>
			<th>Sexo</th>
			<th>Fecha Nacimiento</th>
			<th>Altura</th>
			<th>Observaciones</th>
		</tr>
		<c:forEach var="usuario" items="${usuario}">
		<tr>
			<td>${usuario.dni}</td>
			<td>${usuario.nombre}</td>
			<td>${usuario.apellido1}</td>
			<td>${usuario.apellido2}</td>
			<td>${usuario.sexo}</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd" value="${usuario.fechaNacimiento}" /></td>
			<td>${usuario.altura}</td>
			<td>${usuario.observaciones}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>