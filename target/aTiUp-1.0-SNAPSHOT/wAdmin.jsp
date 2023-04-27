<%-- 
    Document   : wAdmin
    Created on : Apr 19, 2023, 1:20:16 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Bienvenido al modo administrador</title>
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
</head>
<body>
  <h1>Bienvenido al modo administrador</h1>
  
  <form action="AdmHomeServlet" method="post">
    <label for="email">Proporcione su correo electrónico:</label>
    <input type="email" id="email" name="email" required>
    <button type="submit">Ingresar</button>
  </form>
</body>
</html>

