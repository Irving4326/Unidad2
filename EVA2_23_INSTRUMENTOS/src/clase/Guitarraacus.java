/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Irving Gerardo Mancera Mejia
 */
public class Guitarraacus extends InstrumentoMusical
implements Guitarraacustica{
private int numeroCuerdas;
private String color,caja,clavijero;
    @Override
    public void tocarInstrumento() {
         System.out.println("Ráscale!!, Guitarra con " + numeroCuerdas);
        System.out.println("La guitarra es de tipo " + getNombre());
        System.out.println("Su color es " + color);
        System.out.println("Tipo de clavijero " +clavijero);
        System.out.println(" Tipo de caja " + caja);
    }

    @Override
    public void clavijero(String tipoclavijero) {
        clavijero = tipoclavijero;
    }

    @Override
    public void caja(String tipodecaja) {
        caja=tipodecaja;
    }

    @Override
    public void color(String tipocolor) {
        color=tipocolor;
    }
    
}
