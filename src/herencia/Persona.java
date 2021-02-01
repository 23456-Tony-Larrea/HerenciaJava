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
public class Persona {
  public String Nombre;
     public String Apellido;
      public Integer Edad;       

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public Integer getEdad() {
        return Edad;
    }

    public Persona(String Nombre, String Apellido, Integer Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }
}
