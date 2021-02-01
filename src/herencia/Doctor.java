/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author avsla
 */
public class Doctor extends Persona{
    public String Titulacion;
     public Integer AñosExperencia;
      public Doctor (String Nombre, String Apellido, Integer Edad,String Titulacion,Integer AñosExperencia){
      super(Nombre,Apellido,Edad);
      this.Titulacion=Titulacion;
      this.AñosExperencia=this.AñosExperencia;     
      }   
 public void mostrarInformacionDoctor(){
          System.out.println("Este es el numero 3"+
                  "\nNombre:"+ getNombre() +
                  "\nApellido:"+ getApellido() +
                  "\nEdad:"+ getEdad() +
                  "\nTitulacion:"+ Titulacion +
                   "\nAños de experencia:"+ AñosExperencia);
                  } 
}
