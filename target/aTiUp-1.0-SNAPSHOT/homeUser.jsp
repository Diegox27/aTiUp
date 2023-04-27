<%-- 
    Document   : homeUser
    Created on : Apr 21, 2023, 8:22:26 PM
    Author     : Usuario
--%>

<%@page import="java.util.Locale"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ResourceBundle"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="messages_${sessionScope.language}" var="msg" />


<!DOCTYPE html>
<html lang=""${sessionScope.language}>
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
        background-image: url("https://www.creaxid.com.mx/blog/wp-content/uploads/2021/08/investigacion-usuarios.jpg");
        background-size: cover;
        height: 100vh;
      }
    </style>
  </head>
  <body>
    <nav>
      <h1><fmt:message key="main.title" bundle="${msg}"/></h1>
      <ul>
        <li><a href="consultarItems.jsp"><fmt:message key="op1" bundle="${msg}"/></a></li>
        <li><a href="Rankings.jsp"><fmt:message key="op2" bundle="${msg}"/></a></li>
        <li><a href="analisisSentimientos.jsp"><fmt:message key="op3" bundle="${msg}"/></a></li>
        <li><a href="correo.jsp"><fmt:message key="op4" bundle="${msg}"/></a></li>
        <li><a href="index.jsp">HOME</a></li>
      </ul>
    </nav>
      <div id="background-image"></div>
  </body>
</html>
