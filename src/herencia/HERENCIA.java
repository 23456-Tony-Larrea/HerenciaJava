
package herencia;

public class HERENCIA {
    public static void main(String[] args) {
        
        Doctor doctor=new Doctor("Anthony","Larrea",21,"Doctor",15);
        doctor.mostrarInformacionDoctor();
        
        Futbolista futbolista =new Futbolista("Karen","Caisiguano",21,12,"delantera");
        futbolista.mostrarInformacionFutbolista();
    }
    
}
