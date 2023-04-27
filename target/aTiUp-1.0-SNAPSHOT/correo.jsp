<%-- 
    Document   : correo
    Created on : Apr 21, 2023, 11:49:54 PM
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
	<title>Generar PDF para ítem</title>
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
	<h1><fmt:message key="cTitle" bundle="${msg}"/></h1>
        <h4><fmt:message key="cA" bundle="${msg}"/></h4>
        <input type="submit" value=<fmt:message key="cBtn" bundle="${msg}"/>>
        <form action="generar_pdf.php" method="post">
                <h4><fmt:message key="cB" bundle="${msg}"/></h4>
		<label for="item_id"><fmt:message key="cBB" bundle="${msg}"/></label>
		<select name="item_id" id="item_id">
			<option value="1">Ítem 1</option>
			<option value="2">Ítem 2</option>
			<option value="3">Ítem 3</option>
		</select>
		<input type="submit" value=<fmt:message key="cBtn" bundle="${msg}"/>>
	</form>
        <br></br> 
        

	<form action="generar_pdf.php" method="post">
                <h4><fmt:message key="cC" bundle="${msg}"/></h4>
		<label for="item_id"><fmt:message key="cCC" bundle="${msg}"/></label>
		<select name="item_id" id="item_id">
			<option value="1">Ítem 1</option>
			<option value="2">Ítem 2</option>
			<option value="3">Ítem 3</option>
		</select>
		<input type="submit" value=<fmt:message key="cBtn" bundle="${msg}"/>>
	</form>

</body>
</html>

