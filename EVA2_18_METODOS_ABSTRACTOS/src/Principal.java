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
        Caballo ca = new Caballo();
        ca.movimiento();
        ca.comer();
        ca.respirar();
    }
    
}

class Aveztrus extends Animal{
    @Override
    public void movimiento() {
        System.out.println(" Corren a madre");
    }
    @Override
    public void comer() {
        System.out.println("Turistas en el serengueti  ");
    }
}


class Caballo extends Animal{
    @Override
    public void movimiento() {
        System.out.println("Galopar");
    }
    @Override
    public void comer() {
        System.out.println("Comer");
    }
}

class AnimalTrabajo{

}

abstract class Animal{
abstract public void movimiento();
abstract public void comer();
public void respirar(){
            System.out.println("Esta respirando");
}
}