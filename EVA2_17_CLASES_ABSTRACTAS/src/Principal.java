/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caballo cHorse = new Caballo();
        cHorse.movimiento();
    }
    
}
class Caballo extends Animal{
@Override
public void movimiento(){
    
    super.movimiento();
    System.out.println("Galopar bien chidori");
}
}


abstract class Animal{
public void movimiento(){
    System.out.println("Algún tipo de movimineto");
}

}