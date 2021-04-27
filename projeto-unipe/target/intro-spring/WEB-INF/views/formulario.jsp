<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cotação</title>
</head>
<body>
	
	<form:form method="POST" modelAttribute="conversor">
		<p>Valor em Euro: <input type="text" name="real"/></p>
		<p><input type="submit" name="enviar"/></p>
		<p> ${mensagem}</p>
	</form:form>

	<form:form method="POST" modelAttribute="conversor">
		<p>Valor em Iene: <input type="text" name="euro"/></p>
		<p><input type="submit" name="enviar"/></p>
		<p> ${mensagem2}</p>
	</form:form>	
</body>
</html>