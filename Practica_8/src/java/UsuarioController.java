
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioController {
    public static String registrarUsuario(Usuario user){
        String result = null, l=null;
        Conexion cc = new Conexion();
        Connection r = cc.getConnection();
        PreparedStatement a = null;
        String datos = "INSERT INTO USUARIO value(null,?,?,?,?)";
        try{
            a = r.prepareStatement(datos);
            a.setString(1,user.getNombre());
            a.setString(2,user.getPassword());
            a.setString(3,user.getFechaNac());
            a.setString(4,user.getTelefono());
            a.execute();
            a=r.prepareStatement("SELECT MAX(id) AS id FROM Usuarios)");
            ResultSet rs = a.executeQuery();
            if(rs.next()){
                l=rs.getString(1);
            }
            result = "Usuario registrado con exito";
        }catch(SQLException e){
            result = "Error";
        } finally{
            try{
                if(r!=null){
                    r.close();
                    a.close();
                }
            }catch(Exception e){
                result = "Error";                
            }
          }
        return result;
    }
    
    
      public static Usuario BuscarUsuario(String clave){
          Usuario user = new Usuario();
        String result = null, l=null;
        Conexion cc = new Conexion();
        Connection r;
        r = cc.getConnection();
        PreparedStatement a = null;
        String datos = "SELECT * FROM Usuarios WHERE id";
        try{
            a = r.prepareStatement(datos);
            a.setString(1,clave);
            ResultSet rs = a.executeQuery();
            
            if(rs.next()){
                user.setId(Integer.parseInt(rs.getString(1)));
                user.setNombre(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setFechaNac(rs.getString(4));
                user.setTelefono(rs.getString(5));
            }
           user.setResultado("Usuario encontrado");
        }catch(SQLException e){
           user.setResultado("Error");
        } finally{
            try{
                if(r!=null){
                    r.close();
                    a.close();
                }
            }catch(Exception e){
                user.setResultado("Error");               
            }
          }
        return user;
    }
    
}
