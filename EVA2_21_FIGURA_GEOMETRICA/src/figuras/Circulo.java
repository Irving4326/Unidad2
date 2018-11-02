/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Circulo extends FiguraGeometrica {
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public int calcularArea() {
        return (int) (Math.PI*(Math.pow(radio, 2)));
    }

    @Override
    public void dibujar() {
        
    }
    
    

    
 
}
