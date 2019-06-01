package Java;


public class Invitado extends Usuario {
     String fechaRegistro = "";

    public Invitado() {
        fechaRegistro = "";
    }

    public Invitado(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
   
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
