/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_sobreescritura;

/**
 *
 * @author escritorio
 */
public class EVA2_14_SOBREESCRITURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal aAni = new Animal ();
        Mamifero mMa = new Mamifero();
        Mamifero mJIrafa = new Mamifero ("Pararse");
    }
    
}
class Mamifero extends Animal{
public Mamifero(){
// Lo primero es Llamar al constructor
//De la clase base
    super();
}

public Mamifero(String accion){
super(accion);
    System.out.println(" Y salir corriendo ");
}
}
class Animal{
    public Animal(){
        System.out.println("Respirando");
    }  
    public Animal(String accion){
        System.out.println("Respirar y " + accion );
    }
    
}