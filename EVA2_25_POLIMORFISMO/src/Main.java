
import Paquete.Automovil;
import Paquete.Avion;
import Paquete.Motocicleta;
import Paquete.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programación orientada a objetos 
        ///Es cuando un objeto de una clase se comporta como objeto de otra clase.
        //Clases esten relacionadas por herencia
        //Herencia -->
        //Vehiculo{}  avion{}  automovil{} Motocicleta{}
        
        Automovil aTsuru = new Automovil();
        Motocicleta mHarley = new Motocicleta();
        Avion aBoeing = new Avion();
        
        aTsuru.seguridad();
        aTsuru.setRuedas(4);
        imprimirRuedas(aTsuru);
        mHarley.chopper();
        mHarley.setRuedas(2);
        imprimirRuedas(mHarley);
        aBoeing.movimiento();
        aBoeing.setRuedas(24);
        imprimirRuedas(aBoeing);
    }
    
    public static void imprimirRuedas(Vehiculo arg){
        String sTipoVehi = "";
        if( arg instanceof Automovil)
            sTipoVehi = "Automovil";
        else if( arg instanceof Motocicleta)
            sTipoVehi = "Motocicleta";
        else 
            sTipoVehi = "Avion";
        System.out.println("Ruedas del Vehiculo: " + sTipoVehi + ": ");
        arg.getRuedas();
//Si es un automovil, imprime la seguridad
if (arg instanceof Automovil ){
// Convertir el vehiculo a automovil
Automovil aAuto = (Automovil)arg;
aAuto.seguridad();
}

}
    
    
}


