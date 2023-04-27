
package Model.AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBd {
   

    public Connection getConexion() {
        System.out.println("PLACEHOLDERCONEXIO DB1");

        try {
            System.out.println("PLACEHOLDERCONEXIO DB2");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_proyecto_diseno", "root", "1234");
            System.out.println("PLACEHOLDERCONEXIO DB3");
            return conexion;

        } catch (SQLException e) {
            System.out.println("PLACEHOLDERCONEXIO DB4");
            System.out.println(e.toString());
            System.out.println("PLACEHOLDERCONEXIO DB5");
            return null;
        }

    }
}
