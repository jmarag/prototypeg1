<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/estilo.css">
<title>Gestión de Usuarios</title>
</head>
<body>
	<jsp:include page="navegation.jsp" />
	<h1>Gestión de Usuarios</h1>
	<hr>
	<h2>Listado de Usuarios</h2>
	<table>
		<tr>
			<th>DNI</th>
			<th>Nombre</th>
			<th>Primer Apellido</th>
			<th>Segundo Apellido</th>
			<th>Sexo</th>
			<th>Fecha Nacimiento</th>
			<th>Altura</th>
			<th>Observaciones</th>
		</tr>
		<c:forEach var="usuario" items="${usuarios}">
			<tr>
				<td>${usuario.dni}</td>
				<td>${usuario.nombre}</td>
				<td>${usuario.apellido1}</td>
				<td>${usuario.apellido2}</td>
				<td><c:if test="${usuario.sexo == 'H'}">
						Hombre
					</c:if> <c:if test="${usuario.sexo == 'M'}">
						Mujer
					</c:if></td>
				<td><fmt:formatDate pattern="dd-MM-yyyy"
						value="${usuario.fechaNacimiento}" /></td>
				<td><fmt:formatNumber value="${usuario.altura}" type="currency"
						currencySymbol="cm" maxFractionDigits="0" /></td>
				<td>${usuario.observaciones}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>