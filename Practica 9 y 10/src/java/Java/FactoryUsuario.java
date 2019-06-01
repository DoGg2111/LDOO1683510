package Java;




import Java.Usuario;


    
public class FactoryUsuario{
    private static FactoryUsuario singleton;
  
    public  static FactoryUsuario getFactoriaUsuario(){
    if (singleton==null) {
        singleton=new FactoryUsuario();
    }
    return singleton;
 }

    public FactoryUsuario() {
    }
    
    public static Usuario getUsuario(String tipoUsuario){
        if("Admin".equalsIgnoreCase(tipoUsuario)){
            return new Admin();
        }else if("Invitado".equalsIgnoreCase(tipoUsuario)){
            return new Invitado();
        }else if("User".equalsIgnoreCase(tipoUsuario)){
            return new User();
        }
        return null;
    }
}