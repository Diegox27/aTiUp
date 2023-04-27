<%-- 
    Document   : index
    Created on : Apr 19, 2023, 1:14:43 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Bienvenidos a aTiUp</title>
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
    
    #language-select {
      display: flex;
      justify-content: center;
      margin-top: 50px;
    }
    
   
    #mode-select {
      display: flex;
      justify-content: center;
      margin-top: 50px;
    }
    
    #mode-select input[type="radio"] {
      margin: 0 10px;
      transform: scale(1.5);
    }
    
    #confirm-button {
      display: block;
      margin: 50px auto;
      padding: 10px 20px;
      font-size: 18px;
      border-radius: 5px;
      border: none;
      background-color: #4FC3F7;
      color: white;
    }
    
    #confirm-button:hover {
      cursor: pointer;
      background-color: #2895c7;
    }
  </style>
</head>
<body>
  <h1>Bienvenidos a aTiUp</h1>
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
  </style>
  
  <form action="WelcomeServlet" method="POST">
  <div id="mode-select">
    <p>Seleccione el modo:</p>
    <label for="admin-mode">
      <input type="radio" name="mode" id="admin-mode" value="admin"> Modo administrador
    </label>
    <label for="user-mode">
      <input type="radio" name="mode" id="user-mode" value="user" checked> Modo usuario
    </label>
  </div>
  <button type="submit">Ingresar</button>
  
</form>
</form>
</body>
</html>

