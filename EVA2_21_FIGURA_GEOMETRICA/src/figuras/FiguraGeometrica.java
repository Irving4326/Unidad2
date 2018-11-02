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
    public abstract class FiguraGeometrica {
        //ATRIBUTOS
    private String color;
    private int anchoLinea;
    public Punto esqSupIzq;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnchoLinea() {
        return anchoLinea;
    }

    public void setAnchoLinea(int anchoLinea) {
        this.anchoLinea = anchoLinea;
    }
        
    
    public Punto getEsqSupIzq() {
        return esqSupIzq;
    }

    public void setEsqSupIzq(Punto esqSupIzq) {
        this.esqSupIzq = esqSupIzq;
    }
    //AREA DE UNA FIGURA 2D
    public abstract int calcularArea();
    
    //SIMULA DIBUJAR LA FIGURA 2D
    public abstract void dibujar();
    
    
}

