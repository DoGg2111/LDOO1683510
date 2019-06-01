package Java;


public class User extends Usuario{
    String tipoSub = "";
    String domicilio = "";

    public User() {
        tipoSub = "";
        domicilio = "";
    }
    
    public User(String tipoSub, String domicilio) {
        this.tipoSub = tipoSub;
        this.domicilio = domicilio;
    }
    
    public String getTipoSub() {
        return tipoSub;
    }

    public void setTipoSub(String tipoSub) {
        this.tipoSub = tipoSub;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
