<%-- 
    Document   : consultarItems
    Created on : Apr 21, 2023, 11:32:43 PM
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
    <title>aTitUp - Consultar ítems</title>
  </head>
  <body>
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
    
     .rating {
        display: flex;
        justify-content: center;
        align-items: center;
        font-size: 40px;
        color: #ccc;
      }
      
      .rating input {
        display: none;
      }
      
      .rating label {
        cursor: pointer;
      }
      
      .rating label:before {
        content: '\2606';
      }
      
      .rating input:checked ~ label:before {
        content: '\2605';
      }  
  </style>
     <script src="/js/main.js"></script>
  <script src="https://translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script> 
  <script>
    function googleTranslateElementInit(){
        new google.translate.TranslateElement(
            {pageLanguage: 'es'},
            'google_translate_element'
    )};
  </script>
<div id="google_translate_element">

   </div> 
      
  
  
    <h1><fmt:message key="consultarItemTitulo" bundle="${msg}"/></h1>
    
    <form action="ConsultarItemsServlet" method="post">
      <label for="categoria"><fmt:message key="seleCate" bundle="${msg}"/></label>
      <select id="categoria" name="categoria">
        <option value="c1">Categoría 1</option>
        <option value="c2">Categoría 2</option>
        <option value="c3">Categoría 3</option>
        <!-- Agregar más opciones aquí -->
      </select>
      <br><br>
      
      <label for="preguntas"><fmt:message key="preguntas" bundle="${msg}"/></label>
      <select id="preguntas" name="preguntas">
        <option value="p1">Pregunta 1</option>
        <option value="p2">Pregunta 2</option>
        <option value="p3">Pregunta 3</option>
        <!-- Agregar más opciones aquí -->
      </select>
      <br><br>
      
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
            <th>Pregunta</th>
            <th>Ver</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>1. ¿Cuál es la capital de España?</td>
            <td><button onclick="verRespuesta(1)">Ver</button></td>
        </tr>
        <tr>
            <td>2. ¿Quién escribió "Cien años de soledad"?</td>
            <td><button onclick="verRespuesta(2)">Ver</button></td>
        </tr>
        <tr>
            <td>3. ¿Cuál es el río más largo del mundo?</td>
            <td><button onclick="verRespuesta(3)">Ver</button></td>
        </tr>
        <tr>
            <td>4. ¿En qué año llegó el hombre a la luna?</td>
            <td><button onclick="verRespuesta(4)">Ver</button></td>
        </tr>
    </tbody>
</table>

      <label for="respuesta"><fmt:message key="respuesta" bundle="${msg}"/></label>
      <textarea id="respuesta" name="respuesta" rows="4" cols="50" readonly>Respuesta a la pregunta seleccionada</textarea>
     
      <label for="respuesta"><fmt:message key="fuente" bundle="${msg}"/></label>
      <textarea id="respuesta" name="respuesta" rows="1" cols="5" readonly></textarea>
      <br><br>
      
      
      <fieldset class="rating">
      <legend><fmt:message key="valoracion" bundle="${msg}"/></legend>
      <input type="radio" id="star5" name="rating" value="5" /><label for="star5"></label>
      <input type="radio" id="star4" name="rating" value="4" /><label for="star4"></label>
      <input type="radio" id="star3" name="rating" value="3" /><label for="star3"></label>
      <input type="radio" id="star2" name="rating" value="2" /><label for="star2"></label>
      <input type="radio" id="star1" name="rating" value="1" /><label for="star1"></label>
    </fieldset>
    
    <p>Calificación respuesta: <span id="rating"></span></p>
    
    <script>
      const rating = document.getElementById("rating");
      const stars = document.querySelectorAll(".rating input");
      
      stars.forEach(star => {
        star.addEventListener("click", () => {
          rating.textContent = star.value;
        });
      });
    </script>
      
    
     
      <label for="respuesta"><fmt:message key="valoracion" bundle="${msg}"/></label>
      <textarea id="respuesta" name="respuesta" rows="4" cols="40" ></textarea>
      <button type="submit" name="respuestaBtn"><fmt:message key="vR" bundle="${msg}"/></button>
      <br><br>
     
      
      <label for="ejemplo"><fmt:message key="ejemplo" bundle="${msg}"/></label>
      <textarea id="ejemplo" name="ejemplo" rows="4" cols="50" readonly>Ejemplo relacionado con la respuesta</textarea>
      <label for="respuesta"><fmt:message key="fuente" bundle="${msg}"/></label>
      <textarea id="respuesta" name="respuesta" rows="1" cols="5" readonly></textarea>
      <br><br>
      
      <!--
       
      <fieldset class="rating1">
      <legend><fmt:message key="valoracion" bundle="${msg}"/></legend>
      <input type="radio" id="star5b" name="rating1" value="5" /><label for="star5b"></label>
      <input type="radio" id="star4b" name="rating1" value="4" /><label for="star4b"></label>
      <input type="radio" id="star3b" name="rating1" value="3" /><label for="star3b"></label>
      <input type="radio" id="star2b" name="rating1" value="2" /><label for="star2b"></label>
      <input type="radio" id="star1b" name="rating1" value="1" /><label for="star1b"></label>
    </fieldset>
    
    <p>Calificación ejemplos: <span id="rating1"></span></p>
    
    <script>
      const rating = document.getElementById("#rating1");
      const stars = document.querySelectorAll(".rating1 input[type='radio']");
      
      stars.forEach(star => {
        star.addEventListener("click", () => {
          rating.textContent = star.value;
        });
      });
    </script> -->
      <label for="ratingE"><fmt:message key="valoracion" bundle="${msg}"/></label>
      <select name="ratingE" id="rating">
          <option value="1">★</option>
          <option value="2">★★</option>
          <option value="3">★★★</option>
          <option value="4">★★★★</option>
          <option value="5">★★★★★</option>
      </select>
      
    
      <label for="respuesta"><fmt:message key="valoracion" bundle="${msg}"/></label>
      <textarea id="respuesta" name="respuesta" rows="4" cols="40" ></textarea>
      <button type="submit" name="ejemploBtn"><fmt:message key="vE" bundle="${msg}"/></button>
      <br><br>
      
      <button type="submit" name="pdfBtn"><fmt:message key="generarPdf" bundle="${msg}"/></button>
    </form>
    
  </body>
</html>

