<%-- 
    Document   : agregarItem
    Created on : Apr 21, 2023, 10:57:34 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <title>Ingresar ítem de título</title>
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
 <h1>Ingresar ítem</h1>
    <form action="addItemServlet" method="post">
        <label for="fuente-cat">Categoria del item:</label><br>
      <select id="fuente-respuesta" name="fuente-cat">
        <option value="cat1">cat1</option>
          <option value="cat2">cat2</option>
         
      </select><br>
        
        
      <label for="pregunta" name="prompt">Pregunta generadora:</label><br>
      
      <input type="text" id="pregunta" name="pregunta" value="${promptt}"><br>

      <input  type="submit" name="btnChatGPT" value="CONSULTAR CHATGPT"><br>
      <label for="respuesta">Respuesta:</label><br>
      <textarea id="respuesta" name="respuesta" >${preguntaC}</textarea
      <br>
      

      <label for="fuente-respuesta">Fuente de la respuesta:</label><br>
      <select id="fuente-respuesta" name="fuente-respuesta">
        <option value="chatgpt">ChatGPT</option>
          <option value="admin">Admin</option>
         
      </select><br>

      <label for="ejemplo">Ejemplo relacionado con la respuesta:</label><br>
      <textarea id="ejemplo" name="ejemplo" >${ejemploC}</textarea><br>

      <label for="fuente-ejemplo">Fuente del ejemplo:</label><br>
      <select id="fuente-ejemplo" name="fuente-ejemplo">
        <option value="chatgpt">ChatGPT</option>
          <option value="admin">Admin</option>
        
      </select><br>
      <input  type="submit" name="btnAgregar" value="Agregar ítem">
      
    </form>
      <form action="aggItemServlet" method="post">
          
      </form>
      
  </body>
</html>
