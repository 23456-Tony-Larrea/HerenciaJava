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
public class Entrenador extends Persona{
    public String Estrategia;
      public Entrenador (String Nombre, String Apellido, Integer Edad,String Estrategia){
      super(Nombre,Apellido,Edad);
      this.Estrategia=Estrategia;
      }   
 public void mostrarInformacionEntrenador(){
          System.out.println("Este es el numero 2"+
                  "\nNombre"+getNombre()+
                  "\nApellido"+getApellido()+
                  "\nEdad"+getEdad()+
                  "\nEstrategia"+Estrategia
          );
      }    
}
