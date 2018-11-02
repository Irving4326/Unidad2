/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal an = new Animal();
        an.movimiento();
        Caballo ca = new Caballo();
        ca.movimiento();
        Ostra os = new Ostra();
        os.movimiento();
    }
    
}

class Caballo extends Animal{
    @Override
    public void movimiento(){
System.out.println("Galopar");   //Sobreescritura
    }
    
   public void movimiento (String smovi){
       System.out.println(smovi);   //Sobrecarga
   
   } 
    
}







class Ostra extends Animal {
}


class Animal{
    public void movimiento(){
        System.out.println("Movimiento indefinido");
    }
}
