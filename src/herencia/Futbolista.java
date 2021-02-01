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
//Consutructor
public class Futbolista extends Persona{
    public Integer Numero;
    public String Posicion;
      public Futbolista (String Nombre, String Apellido, Integer Edad, Integer Numero,String Posicion){
      super(Nombre,Apellido,Edad);
      this.Numero=Numero;
      this.Posicion=Posicion;
      }
      public void mostrarInformacionFutbolista(){
          System.out.println("Este es el numero 1"+
                  "\nNombre"+getNombre()+
                  "\nApellido"+getApellido()+
                  "\nEdad"+getEdad()+
                  "\nNumero"+Numero+
                  "\nPosicion"+Posicion
          );
      }
}
