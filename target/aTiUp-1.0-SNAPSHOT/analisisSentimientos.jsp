<%-- 
    Document   : analisisSentimientos
    Created on : Apr 21, 2023, 11:45:05 PM
    Author     : Usuario
--%>
<%@page import="java.util.Locale"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ResourceBundle"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="messages_${sessionScope.language}" var="msg" />
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Resultado del análisis de sentimientos</title>
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
    <h1><fmt:message key="aTitle" bundle="${msg}"/></h1>
    
    <h2><fmt:message key="aA" bundle="${msg}"/></h2>
    <p><fmt:message key="aAA" bundle="${msg}"/></p>
    <select>
      <option value="categoria1">Categoría 1</option>
      <option value="categoria2">Categoría 2</option>
      <option value="categoria3">Categoría 3</option>
      <!-- Otras opciones de categorías -->
    </select>
    <button><fmt:message key="aBtn" bundle="${msg}"/></button>
    
    <h2><fmt:message key="aB" bundle="${msg}"/></h2>
    <p><fmt:message key="aBB" bundle="${msg}"/></p>
    <select>
      <option value="item1">Ítem 1</option>
      <option value="item2">Ítem 2</option>
      <option value="item3">Ítem 3</option>
      <!-- Otras opciones de ítems -->
    </select>
    <button><fmt:message key="aBtn" bundle="${msg}"/></button>
    
    <h2><fmt:message key="aC" bundle="${msg}"/></h2>
    <p><fmt:message key="aAA" bundle="${msg}"/></p>
    <select>
      <option value="categoria1">Categoría 1</option>
      <option value="categoria2">Categoría 2</option>
      <option value="categoria3">Categoría 3</option>
      <!-- Otras opciones de categorías -->
    </select>
    <p><fmt:message key="aBB" bundle="${msg}"/></p>
    <select>
      <option value="item1">Ítem 1</option>
      <option value="item2">Ítem 2</option>
      <option value="item3">Ítem 3</option>
      <!-- Otras opciones de ítems -->
    </select>
    <p><fmt:message key="aCC" bundle="${msg}"/> </p>
    <select>
      <option value="item1">Ítem 1</option>
      <option value="item2">Ítem 2</option>
      <option value="item3">Ítem 3</option>
      <!-- Otras opciones de ítems -->
    </select>
    <button><fmt:message key="aBtn" bundle="${msg}"/></button>
     <style>
table {
  border-collapse: collapse;
  width: 100%;
  max-width: 600px;
  margin: 20px auto;
}

th, td {
  text-align: left;
  padding: 8px;
}

th {
  background-color: #4CAF50;
  color: white;
}

tr:nth-child(even) {
  background-color: #f2f2f2;
}

button {
  background-color: #0099cc;
  color: white;
  border: none;
  padding: 8px 16px;
  border-radius: 4px;
  cursor: pointer;
}

button:hover {
  background-color: #006699;
}

</style>

<table>
    <thead>
        <tr>
            <th>Comentario</th>
            <th>Analisis</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>1. Estuvo feo</td>
            <td><button onclick="verRespuesta(1)">Ver</button></td>
        </tr>
        <tr>
            <td>2. me encantó</td>
            <td><button onclick="verRespuesta(2)">Ver</button></td>
        </tr>
        <tr>
            <td>3. ¿que pereza?</td>
            <td><button onclick="verRespuesta(3)">Ver</button></td>
        </tr>
        <tr>
            <td>4. ¿lo amé es lo mejor?</td>
            <td><button onclick="verRespuesta(4)">Ver</button></td>
        </tr>
    </tbody>
</table>
    
   
  </body>
</html>

