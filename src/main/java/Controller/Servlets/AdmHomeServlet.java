
package Controller.Servlets;

import Model.AccesoDatos.CategoriaDAO;
import Model.Categoria;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdmHomeServlet extends HttpServlet {
   

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String correo= request.getParameter("email");
        System.out.println("Este es el correo del admin X  "+ correo);
        System.out.println("PLACEHOLDER0");
     /*   try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmHomeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Crear una instancia de CategoriaDAO
        CategoriaDAO categoriaDAO = CategoriaDAO.getInstance();
        // Llamar al método listarCategorias
        ArrayList<Categoria> categorias = categoriaDAO.listarCategorias();
        // Imprimir los resultados en la consola
        for (Categoria categoria : categorias) {
            System.out.println("Código: " + categoria.getCodigo());
            System.out.println("Nombre: " + categoria.getNombre());
            System.out.println("Descripción: " + categoria.getDescripcion());
        }*/
        response.sendRedirect("homeAdmin.jsp");
        
    }

    

}
