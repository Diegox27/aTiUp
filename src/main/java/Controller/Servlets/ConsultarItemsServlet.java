/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.Servlets;

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
public class ConsultarItemsServlet extends HttpServlet {


   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String botonPresionado1 = request.getParameter("respuestaBtn");
        String botonPresionado2 = request.getParameter("ejemploBtn");
        String botonPresionado3 = request.getParameter("pdfBtn");
        
        
        if (botonPresionado1 != null) {
            // El botón 1 fue presionado
            System.out.println("Se ha presionado valorar respuesta");
        } else if(botonPresionado2 != null) {
            System.out.println("Se ha presionado valorar ejemplo");
            // El botón 2 fue presionado
            
        } else{
            System.out.println("Se ha presionado pdf");
        }

       
    }

    
}
