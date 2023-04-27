/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.Servlets;

import static Model.ConexionChatGPT.conexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class addItemServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //place holder
        System.out.println("Este es el del boton de consultar a chatGPT");
        //recolecto data
        String prompt = request.getParameter("pregunta");
        String pregunta = "Escribe una respuesta rapida de la pregunta: ";
        String ejemplo = "Escribe un ejemplo rapido relacionado con la pregunta a continuacion: ";
        String cat= request.getParameter("fuente-cat");
        String reply= request.getParameter("respuesta");
        String example= request.getParameter("ejemplo");
        String replyF= request.getParameter("fuente-respuesta");
        String exampleF= request.getParameter("fuente-ejemplo");
        //frontEnd
        String preguntaC = pregunta + prompt;
        String ejemploC = ejemplo + prompt;
         
        
        String botonPresionado1 = request.getParameter("btnChatGPT");
        String botonPresionado2 = request.getParameter("btnAgregar");
       // String botonPresionado3 = request.getParameter("pdfBtn");
        
       if(botonPresionado1 != null){
           String finalEjemplo = (conexion(ejemploC));
            String finalPregunta = (conexion(preguntaC));
            String a = finalEjemplo;
            String b = finalPregunta;
            request.setAttribute("preguntaC", b);
            request.setAttribute("ejemploC", a);
            request.setAttribute("promptt", prompt);
            request.getRequestDispatcher("agregarItem.jsp").forward(request, response);
           
       } else if(botonPresionado2 != null){
            System.out.println("Valor de la variable prompt: " + prompt);
            System.out.println("Valor de la variable cat: " + cat);
            System.out.println("Valor de la variable reply: " + reply);
            System.out.println("Valor de la variable example: " + example);
            System.out.println("Valor de la variable replyF: " + replyF);
            System.out.println("Valor de la variable exampleF: " + exampleF);
            request.setAttribute("preguntaC", reply);
            request.setAttribute("ejemploC", example);
            request.setAttribute("promptt", prompt);
            request.getRequestDispatcher("agregarItem.jsp").forward(request, response);
            
       }
       
       /* if( botonPresionado1 != null)){
            System.out.println("este deberia aparecer una vez");
            //Asigno valores
            String finalEjemplo = (conexion(ejemploC));
            String finalPregunta = (conexion(preguntaC));
            String a = finalEjemplo;
            String b = finalPregunta;
            request.setAttribute("preguntaC", b);
            request.setAttribute("ejemploC", a);
            request.setAttribute("promptt", prompt);
            request.getRequestDispatcher("agregarItem.jsp").forward(request, response);
           
        }else if(botonPresionado2 !null=){
            //muestro en consola
            System.out.println("Valor de la variable prompt: " + prompt);
            System.out.println("Valor de la variable cat: " + cat);
            System.out.println("Valor de la variable reply: " + reply);
            System.out.println("Valor de la variable example: " + example);
            System.out.println("Valor de la variable replyF: " + replyF);
            System.out.println("Valor de la variable exampleF: " + exampleF);
            request.setAttribute("preguntaC", reply);
            request.setAttribute("ejemploC", example);
            request.setAttribute("promptt", prompt);
            request.getRequestDispatcher("agregarItem.jsp").forward(request, response);
        }*/
        
    }

  

}
