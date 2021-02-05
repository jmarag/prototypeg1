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
	<jsp:include page="navegation.jsp"/>
	<h1>Gestión de Usuarios</h1>
	<hr>
	<h2>Listado de Usuarios</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>DNI Usuario</th>
			<th>Hora del Registro</th>
			<th>Longitud</th>
			<th>Latitud</th>
			<th>Peso</th>
			<th>Presion Maxima</th>
			<th>Presion Minima</th>
			<th>Numero de Pasos</th>
		</tr>
		<c:forEach var="registro" items="${registros}">
		<tr>
			<td>${registro.id}</td>
			<td>${registro.usuario.dni}</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd" value="${registro.horaRegistro}" /></td>
			<td>${registro.longitud}</td>
			<td>${registro.latitud}</td>
			<td><fmt:formatNumber value="${registro.peso}"
								  type="currency"
								  currencySymbol="kg"
								  maxFractionDigits="2"/>
			</td>
			<td><fmt:formatNumber value="${registro.presionMaxima}"
								  type="currency"
								  currencySymbol="mmHg"
								  maxFractionDigits="0"/>
			</td>
			<td><fmt:formatNumber value="${registro.presionMinima}"
								  type="currency"
								  currencySymbol="mmHg"
								  maxFractionDigits="0"/>
			</td>
			<td>${registro.pasos}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>