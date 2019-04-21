import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    String nombre = "root";
    String password = "admin";
    String url = "jdbc:derby://localhost:1527/User";
    Connection c=null;
    
    public Connection crearConexion(){
        try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }try {
            
            c= DriverManager.getConnection(url,nombre,password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public void cerrarConexion(){
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public Connection getConnection(){
        return c;
    }
}
