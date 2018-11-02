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
        // Las interffaces son como clases abstractas
        // No se puede crear objetos de interdaces
        // No clases 
        //Define un comportamiento estandar a una clase
        // Cuantos tipos de Herencia existen?
        // Multiple = Podemos heredad de varias clase
        // Simple = Solo podemos heredar una
        // super = LLAMA A LOS METODOS PADRE, SIRVE CUANDO OCULTAMOS OVERRIDE 
        Caballo hor = new Caballo();
        hor.comer();
        hor.movimiento();
    }
    
    
}


class Caballo implements ComportamientoAnimal{
    @Override
    public void movimiento() {
        System.out.println("Galopar");
    }

    @Override
    public void comer() {
        System.out.println("Comer pasto verde");
    }

}

interface ComportamientoAnimal{
public void movimiento();
public void comer();

}