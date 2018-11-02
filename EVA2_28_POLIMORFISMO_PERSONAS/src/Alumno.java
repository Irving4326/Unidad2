/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Alumno extends Persona {
private String noControl;
    @Override
    public void imprimirNombre() {
        System.out.println("Alumno: " + getNombre() + " " + getApellido() + " " +getNoControl() );
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
}
