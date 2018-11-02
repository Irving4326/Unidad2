/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hijo hi = new Hijo();
        hi.algo();
        hi.mensaje();
        hi.otromensaje();
    }  
}
class Hijo extends Padre implements Accesorio, Algomas{

    @Override
    public void mensaje() {
        System.out.println("Yolo");
    }

    @Override
    public void otromensaje() {
        System.out.println("Hola mundo");
    }
}
class Padre{
public void algo(){
            System.out.println("Mensaje de la clase base");
}
}
interface Accesorio{
public void mensaje();
}
interface Algomas{
public void otromensaje();
}