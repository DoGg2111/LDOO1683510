package com.tutorialspoint;

public class Student {
   private Sting correo;
   private String contra;
   private Integer telefono;
   private Integer fechaNacimeinto;

   public void setCorreo(String correo) {
      this.correo = correo;
   }
   public String getCorreo() {
      return correo;
   }

   public void setContra(String contra) {
      this.contra = contra;
   }
   public String getContra() {
      return contra;
   }

   public void setTelefono(Integer telefono) {
      this.telefono = telefono;
   }
   public Integer getTelefono() {
      return telefono;
   }
   public void setFechaNacimiento(Integer fechaNacimiento) {
      this.fechaNacimiento = fechaNacimiento;
   }
   public Integer getFechaNacimiento() {
      return fechaNacimiento;
   }
}