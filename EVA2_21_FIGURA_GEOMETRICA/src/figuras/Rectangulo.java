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
public class Rectangulo extends FiguraGeometrica{
    
    private int base, altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return base*altura;
    }

    @Override
    public void dibujar() {
        Punto esqInfIzq, esqSupDer, esqInfDer;
        
        esqInfIzq = new Punto();
        esqSupDer = new Punto();
        esqInfDer = new Punto();
        
        esqInfIzq.setX(getEsqSupIzq().getX());
        esqInfIzq.setY(getEsqSupIzq().getY() - altura);
        
        esqInfDer.setX(getEsqSupIzq().getX() + base);
        esqInfDer.setY(getEsqSupIzq().getY() - altura);
        
        esqSupDer.setX(getEsqSupIzq().getX() + base);
        esqSupDer.setY(getEsqSupIzq().getY());
        
        System.out.println("(" + getEsqSupIzq().getX() + "," + getEsqSupIzq().getY() + ")");
        System.out.println("(" + esqInfIzq.getX() + "," + esqInfIzq.getY() + ")");
        System.out.println("(" + esqSupDer.getX() + "," + esqSupDer.getY() + ")");
        System.out.println("(" + esqInfDer.getX() + "," + esqInfDer.getY() + ")");
    }
    
    
}
