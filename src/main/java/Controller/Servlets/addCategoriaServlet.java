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
public class addCategoriaServlet extends HttpServlet {  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String nombre= request.getParameter("nombre");
        String descripcion= request.getParameter("descripcion");
        System.out.println("Esta funcando");
        // Obtener los valores de los cursos seleccionados
        String[] cursosSeleccionados = request.getParameterValues("cursos");

// Comprobar si se seleccionó al menos un curso
        if (cursosSeleccionados != null && cursosSeleccionados.length > 0) {
            // Iterar a través de los cursos seleccionados
            for (String curso : cursosSeleccionados) {
                // Realizar alguna acción con cada curso seleccionado
                System.out.println("Curso seleccionado: " + curso);
            }
        } else {
            // No se seleccionó ningún curso
            System.out.println("No se seleccionó ningún curso.");
        }
        System.out.println("Nombre"+nombre);
        System.out.println("Descripcion"+descripcion);
       
    }
}
