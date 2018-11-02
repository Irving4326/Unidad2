/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import figuras.*;
import java.util.Scanner;
/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punto p = new Punto();
        Scanner s = new Scanner(System.in);
        Circulo circ = new Circulo();
        Rectangulo rec = new Rectangulo();
        
        System.out.println("Dame el color de la fiigura rectangular ");
                rec.setColor(s.nextLine());
              System.out.println("Dame el color de la fiigura circular ");
                circ.setColor(s.nextLine());  
        System.out.println("Elige una opción: "
        + "\n1) Rectangulo"
        + "\n2) Círculo"
        + "\n3) Salir");
        int op = s.nextInt();
        
        switch(op){
            case 1:
                
                
                System.out.println("Ingrese la base del Rectangulo");
                int iBase = s.nextInt();
                
                System.out.println("Ingrese la altura del Rectangulo");
                int iAltura = s.nextInt();
                
                
                p.setX(0);
                
                p.setY(0);
                
                rec.setEsqSupIzq(p);
                rec.setBase(iBase);
                rec.setAltura(iAltura);
                rec.dibujar();
                
                System.out.println("\nArea = " + rec.calcularArea());
                System.out.println("El color es = " +rec.getColor());
            case 2:
                System.out.println("Ingrese el radio del circulo ");
                int iradio = s.nextInt();
                p.setX(0);
                circ.setRadio(iradio);
                System.out.println("El area del circulo es " +circ.calcularArea());
                System.out.println("El color es = " +circ.getColor());
                
                
                
                
        }
        
    }
     
}
