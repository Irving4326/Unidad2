/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //POLIMORFISMO 
        // Esto esta bien Padre = new Hijo
        // ESTO NO ESTA BIEN > Hijo = new Padre
        // Alumno al = new Persona();
        Persona pe = new Alumno ();
        pe.setNombre("Irving");
        pe.setApellido("Mancera");
        //CASTING
        Alumno al = (Alumno)pe;
        System.out.println(al.getNombre());
        System.out.println(al.getApellido());
        System.out.println(al.getNumcont());
        
        
    }
    
    
    
    
}



class Persona{
private String nombre;
private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
class Empleado extends Persona {
private String RFC; 

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

}
class Alumno extends Persona{
private int Numcont;


public Alumno(){
Numcont= 1234;
}

    public int getNumcont() {
        return Numcont;
    }

    public void setNumcont(int Numcont) {
        this.Numcont = Numcont;
    }

}