/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
 import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;

public class Autenticacion extends Conexion{
    public boolean RegistroAdmin(String username, String password, String email, String fechaNac, String numEmpleado){
       PreparedStatement pst = null; 
       try {
           String consulta = "INSERT INTO User (Username, Password, Email, FechaNacimiento, Num_Empleado) VALUES (?,?,?,?,?,?)";             
           pst = crearConexion().prepareStatement(consulta);
           pst.setString(1, username);
           pst.setString(2, password);
           pst.setString(3, email);
           pst.setString(4, fechaNac);
           pst.setString(5, numEmpleado);
                      
           if(pst.executeUpdate() == 1){
               return true;
           }
           
        } catch (SQLException e) {
            System.err.println("Error" + e);
        } finally{
            try {
                if(crearConexion() != null){
                    crearConexion().close();
                }
                
                if(pst != null){
                    pst.close();
                }
            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        }
       return false;
    } 
      public boolean RegistroInvitado(String username, String password, String email, String fechaNac, String FechaRegistro){
       PreparedStatement pst = null; 
       try {
           String consulta = "INSERT INTO User (Username, Password, Email, FechaNacimiento, FechaRegistro) VALUES (?,?,?,?,?,?)";             
           pst = crearConexion().prepareStatement(consulta);
           pst.setString(1, username);
           pst.setString(2, password);
           pst.setString(3, email);
           pst.setString(4, fechaNac);
           pst.setString(5, FechaRegistro);
                      
           if(pst.executeUpdate() == 1){
               return true;
           }
           
        } catch (SQLException e) {
            System.err.println("Error" + e);
        } finally{
            try {
                if(crearConexion() != null){
                    crearConexion().close();
                }
                
                if(pst != null){
                    pst.close();
                }
            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        }
       return false;
    } 
    public boolean registroUser(String username, String password, String email, String fechaNac,String tipoSubs, String domicilio){
       PreparedStatement pst = null;
        
       try {
           String consulta = "INSERT INTO User (Username, Password, Email, FechaNacimiento,tipo_subs, domicilio) values (?,?,?,?,?,?)";
           pst = crearConexion().prepareStatement(consulta);
           
           pst.setString(1, username);
           pst.setString(2, password);
           pst.setString(3, email);
           pst.setString(4, fechaNac);
           pst.setString(5, tipoSubs);
           pst.setString(6, domicilio);
           
           if(pst.executeUpdate() == 1){
               return true;
           }
        } catch (SQLException e) {
            System.err.println("Error" + e);
        } finally{
            try {
                if(crearConexion() != null){
                    crearConexion().close();
                }
                
                if(pst != null){
                    pst.close();
                }
            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        }
       return false;
    }
      


    public boolean autenticacion(String user, String pass, String tipo_Usuario){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String consulta = "SELECT * FROM usuario_general WHERE nombre = ? and contraseña = ? and tipoUsuario = ?";
            pst = crearConexion().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, pass);
            pst.setString(3, tipo_Usuario);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
        }catch(SQLException e){
            System.err.println("Error" + e);
        }finally{
            try {
                if(crearConexion() != null){
                    crearConexion().close();
                }
                
                if(pst != null){
                    pst.close();
                }
                
                if(rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        }
        return false;
    }           
}

