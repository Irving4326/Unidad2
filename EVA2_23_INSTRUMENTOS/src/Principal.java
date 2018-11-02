
import clase.Guitarra;
import clase.Guitarraacus;

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
        // TODO code application logic here
        Guitarra gM = new Guitarra();
        gM.setNombre("Gibson");
        gM.setNumeroCuerdas(6);
        gM.efectos("Wah");
        gM.amplificador(10000);
        gM.tocarInstrumento();
        System.out.println("");
        
        Guitarraacus go = new Guitarraacus();
        go.caja("Ovalada");
        go.setNombre("Colon");
        go.color("Rojo");
        go.clavijero("Afinador ");
        go.tocarInstrumento();
    }
    
}
