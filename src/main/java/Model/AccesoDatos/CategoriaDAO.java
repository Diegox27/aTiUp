
package Model.AccesoDatos;

import Model.Categoria;
import Model.AccesoDatos.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    
    private static CategoriaDAO instancia;
    private Connection conexion;
     //Connection conexion;
    
    public CategoriaDAO(){
        System.out.println("PLACEHOLDERDAO1");
        ConexionBd con = new ConexionBd();
        System.out.println("PLACEHOLDERDAO2");
        conexion = con.getConexion();
        if (conexion != null) {
            System.out.println("Conexión establecida correctamente en el constructor de CategoriaDAO");
        } else {
            System.out.println("Error al establecer la conexión en el constructor de CategoriaDAO");
        }
        System.out.println("PLACEHOLDERDAO3");
    }
    
    public static synchronized CategoriaDAO getInstance(){
        if(instancia == null){
            instancia = new CategoriaDAO();
        }
        return instancia;
    }
    
    
    public ArrayList<Categoria> listarCategorias(){    
        PreparedStatement ps;
        ResultSet rs;
        
        ArrayList<Categoria> lista = new ArrayList<>();
        
        try{
            ps = conexion.prepareStatement("SELECT categoria.codigo ,categoria.nombre, categoria.descripcion FROM categoria");  
            rs = ps.executeQuery();
            
            while(rs.next()){
                int codigo = rs.getInt("categoria.codigo");
                String nombre = rs.getString("categoria.nombre");
                String descripcion = rs.getString("categoria.descripcion");
                
                Categoria auxCategoria = new Categoria(codigo ,nombre, descripcion);
                
                lista.add(auxCategoria);   
            }            
            return lista;  
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean insertarCategoria(Categoria categoria) {
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("INSERT INTO categoria (codigo, nombre, descripcion) VALUES (?, ?, ?)");
            ps.setInt(1, categoria.getCodigo());
            ps.setString(2, categoria.getNombre());
            ps.setString(3, categoria.getDescripcion());

            int resultado = ps.executeUpdate();

            return resultado > 0;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    }
      
}
