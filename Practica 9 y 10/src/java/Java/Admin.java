package Java;


public class Admin extends Usuario{
     String numEmpleado = "";
    

    public Admin(){
        numEmpleado = "";
    }
    
    public Admin(String numEmpleado){
        this.numEmpleado = numEmpleado;
    }
     
    public String getNum_empleado() {
        return numEmpleado;
    }
     
    public void setNum_empleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
}
