/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Missclase;

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Persona {
 private String nombre;
 private String apellido;
 private int edad;
 private int estadoCivil;
 /*
 0= Soltero
 1= Xasado
 2= Divorciado
 3= Viudo
 */
 
 private String direccion;

    public Persona() {
        nombre = "YOLO";
        apellido = "POLO";
        edad = 19;
        estadoCivil= EstadoCivil.SOLTERO;
        direccion = "Tec 2";        
                estadoCivil = EstadoCivil.DIVORCIADO;
    }

 
 
 
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil(int CASADO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 
 
    
}
