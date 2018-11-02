/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // La clase abstracta = una que no sirbve para generar objetos
        // Solo sirve como base para herencia
        
        Ostra opal = new Ostra();
        opal.movimiento();
        
    }
}

class Almejas extends Animal{
    
}
//Final --> Ya no se puede heredar de Ostra 
final class Ostra extends Animal {
    }


abstract class Animal {
public void movimiento(){
    System.out.println("Movimiento indefinido ");
}

}

// Limitar la herencia con final