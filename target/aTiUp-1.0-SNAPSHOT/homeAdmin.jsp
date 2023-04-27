<%-- 
    Document   : homeAdmin
    Created on : Apr 21, 2023, 8:22:11 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Home - Modo Usuario</title>
    <style>
      nav {
        background-color: #4FC3F7;
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 10px;
      }

      ul {
        list-style: none;
        display: flex;
      }

      li {
        display: inline-block;
        margin-right: 20px;
      }

      a {
        display: inline-block;
        color: white;
        font-size: 18px;
        text-decoration: none;
        padding: 10px;
      }
      #background-image {
        background-image: url("https://smallbusiness-staging.s3.amazonaws.com/uploads/2017/09/Admin-14917-1568x989.jpeg");
        background-size: cover;
        height: 100vh;
      }
    </style>
  </head>
  <body>
    <nav>
  <h1>PAGINA PRINCIPAL DEL MODO ADMINISTRADOR</h1>
  <form name="myform" action="AdminServlet" method="POST">
    <ul>
      <li><input type="submit" name="action" value="catalogo"></li>
      <li><input type="submit" name="action" value="categorias"></li>
      <li><input type="submit" name="action" value="agregarItem"></li>
      <li><input type="submit" name="action" value="home"></li>
    </ul>
  </form>
</nav>
      <div id="background-image"></div>
  </body>
</html>
