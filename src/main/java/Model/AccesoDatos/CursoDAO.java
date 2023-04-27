package Model.AccesoDatos;
import Model.Categoria;
import Model.Curso;
//import config.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.List;
public class CursoDAO {
    Connection conexion;
    
    public CursoDAO(){
        ConexionBd con = new ConexionBd();
        conexion = con.getConexion();
    }
    public ArrayList<Curso> listarCursosCategoria(Categoria pCat){    
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<Curso> lista = new ArrayList<>();
        try{
            ps = conexion.prepareStatement("SELECT curso.codigo, curso.nombre FROM curso INNER JOIN categoriacurso ON curso.codigo = categoriacurso.idCurso WHERE categoriacurso.idCategoria = " + pCat.getCodigo());  
            rs = ps.executeQuery();
            while(rs.next()){
                String codigo = rs.getString("curso.codigo");
                String nombre = rs.getString("curso.nombre");
                Curso auxCurso = new Curso(nombre, codigo);
                lista.add(auxCurso);   
            }            
            return lista;  
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    public ArrayList<Curso> listarCursosCategoria( ){    
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<Curso> lista = new ArrayList<>();
        try{
            ps = conexion.prepareStatement("SELECT curso.codigo, curso.nombre FROM curso");  
            rs = ps.executeQuery();
            while(rs.next()){
                String codigo = rs.getString("curso.codigo");
                String nombre = rs.getString("curso.nombre");
                Curso auxCurso = new Curso(nombre, codigo);
                lista.add(auxCurso);   
            }            
            return lista;  
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    
}