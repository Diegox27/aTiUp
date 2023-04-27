<%-- 
    Document   : Rankings
    Created on : Apr 21, 2023, 11:40:25 PM
    Author     : Usuario
--%>

<%@page import="java.util.Locale"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ResourceBundle"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="messages_${sessionScope.language}" var="msg" />

<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <title>Búsqueda de ítems con valoraciones iguales o superiores a cuatro estrellas</title>
  </head>
  <body>
        <style>
    body {
      background-color: white;
      font-family: Arial, sans-serif;
    }
css
Copy code
h1 {
  color: #4FC3F7;
  text-align: center;
  margin-top: 100px;
}

form {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 50px;
}

label {
  font-size: 20px;
  margin-bottom: 10px;
}

input[type="text"], input[type="submit"], select {
  width: 300px;
  padding: 10px;
  font-size: 16px;
  margin-bottom: 20px;
  border-radius: 5px;
  border: none;
  background-color: #4FC3F7;
  color: white;
}

input[type="submit"]:hover {
  background-color: #3B9AC2;
}

textarea {
  width: 600px;
  height: 200px;
  padding: 10px;
  font-size: 18px;
  margin-bottom: 20px;
  border-radius: 5px;
  border: none;
}

form select {
  width: 300px;
  padding: 10px;
  font-size: 16px;
  margin-bottom: 20px;
  border-radius: 5px;
  border: none;
}

label[for="respuesta"], label[for="ejemplo"] {
  display: inline-block;
  width: 200px;
  margin-right: 20px;
  margin-bottom: 10px;
}

#respuesta, #ejemplo {
  display: inline-block;
  vertical-align: top;
}
 </style>
    <h1><fmt:message key="rankingTitle" bundle="${msg}"/></h1>
    <form action="buscar.php" method="post">
      
      <br>
      <label for="tipo_valoracion"><fmt:message key="tVa" bundle="${msg}"/></label>
      <select name="tipo_valoracion" id="tipo_valoracion">
        <option value="respuestas"><fmt:message key="rRes" bundle="${msg}"/></option>
        <option value="ejemplos"><fmt:message key="rEje" bundle="${msg}"/></option>
        <option value="ambos" selected><fmt:message key="rBoth" bundle="${msg}"/></option>
      </select>
      <br>
      
      <br>
      <label for="fuente_ejemplos"><fmt:message key="rFuentesEj" bundle="${msg}"/></label>
      <select name="fuente_ejemplos" id="fuente_ejemplos">
        <option value="admin"><fmt:message key="rAdm" bundle="${msg}"/></option>
        <option value="chatGPT"><fmt:message key="rChat" bundle="${msg}"/></option>
        <option value="ambos" selected><fmt:message key="rBoth" bundle="${msg}"/></option>
      </select>
      <br>
      <label for="cantidad"><fmt:message key="rCant" bundle="${msg}"/></label>
      <input type="number" name="cantidad" id="cantidad" min="1" required>
      <br>
      <input type="submit" value=<fmt:message key="rBtn" bundle="${msg}"/>>
    </form>
  </body>
</html>
