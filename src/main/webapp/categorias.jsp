<%-- 
    Document   : categorias
    Created on : Apr 21, 2023, 10:47:35 PM
    Author     : Usuario
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Categorías Conceptuales</title>
</head>
<body>
  <h1>Categorías Conceptuales</h1>
  
   <style>
    body {
      background-color: white;
      font-family: Arial, sans-serif;
    }
    
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
    
    input {
      width: 300px;
      padding: 10px;
      font-size: 16px;
      margin-bottom: 20px;
    }
    
    button {
      background-color: #4FC3F7;
      color: white;
      padding: 10px 20px;
      border: none;
      border-radius: 5px;
      font-size: 18px;
      cursor: pointer;
    }
    
    button:hover {
      background-color: #3B9AC2;
    }
    form select {
  width: 300px;
  padding: 10px;
  font-size: 16px;
  margin-bottom: 20px;
}

.chips-container {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
  margin-bottom: 20px;
}

.chip {
  background-color: #4FC3F7;
  color: white;
  display: flex;
  align-items: center;
  padding: 5px 10px;
  border-radius: 20px;
  font-size: 16px;
}

.chip input[type="checkbox"] {
  display: none;
}

.chip input[type="checkbox"]:checked + label {
  background-color: #3B9AC2;
}

.chip label {
  cursor: pointer;
  margin: 0;
  padding: 0;
  margin-left: 5px;
}
  </style>
  
  
  <form action="addCategoriaServlet" method="post">
      <label for="cursos">Cursos:</label>
    
    
    <label for="codigo-categoria">Código de Categoría:</label>
    <input type="text" id="codigo-categoria" name="codigo-categoria" readonly><br><br>
    
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre"><br><br>
    
    <label for="descripcion">Descripción:</label>
    <input type="text" id="descripcion" name="descripcion"><br><br>
    
    
    
    <label for="items">Ítems(este inicialmente es vacio):</label>
    <textarea id="items" name="items" readonly></textarea><br><br>
    
    <button type="submit">Agregar Categoría</button>
  </form>
  <button onclick="window.open('addCurso.jsp')">Agregar cursos</button>
  
  
</body>
</html>

