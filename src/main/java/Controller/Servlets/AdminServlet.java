/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.Servlets;

import Model.AccesoDatos.CategoriaDAO;
import Model.AccesoDatos.CursoDAO;
import Model.Categoria;
import Model.Curso;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminServlet extends HttpServlet {

   

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        System.out.println("XXX"+action);
        if (action.equals("catalogo")) {
            // Acción para mostrar el catálogo
        } else if (action.equals("categorias")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                // Acción para mostrar las categorías
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AdminServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            CursoDAO miObjeto = new CursoDAO();

            // Asignar la lista de cursos recuperada a una variable de alcance de solicitud
            request.setAttribute("cursos", miObjeto.listarCursosCategoria());

            // Redirigir a la página JSP
            request.getRequestDispatcher("categorias.jsp").forward(request, response);
            /*
            CursoDAO miObjeto = new CursoDAO();
            
            // llamar al método listarCategorias() y guardar el valor de retorno en una variable
            ArrayList<Curso> cursos = miObjeto.listarCursosCategoria();
            //esto no se toca
            request.setAttribute("cursos", cursos);
            request.getRequestDispatcher("categorias.jsp").forward(request, response);*/
        } else if (action.equals("agregarItem")) {
            // Acción para agregar un nuevo item
        } else if (action.equals("home")) {
            // Acción para mostrar la página de inicio
        } else {
            // Acción por defecto si no se especifica un botón
        }
        //processRequest(request, response);
    }

   

}
