<%-- 
    Document   : addCurso
    Created on : Apr 23, 2023, 5:19:59 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Formulario para agregar nombre y código</title>
</head>
<body>
	<form>
		<label for="nombre">Nombre del curso:</label>
		<input type="text" name="nombre" id="nombre">
		<br>
		<label for="codigo">Código curso:</label>
		<input type="text" name="codigo" id="codigo">
		<br>
		<button type="submit">Agregar</button>
	</form>
</body>
</html>
