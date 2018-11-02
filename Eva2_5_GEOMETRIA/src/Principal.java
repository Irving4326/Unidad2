/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        System.out.println("Area de un cuadrado de lado 100 = " +Geometria.calculaAreaCuadrado(100));
        Geometria.calculaAreaCuadrado(100);
        
        
        System.out.println("Ares de un Triangulo de 100, 100 = " +Geomeria2.calculaAreaTriangulo(10, 100) );
        Geomeria2.calculaAreaTriangulo(50, 100);
        
        System.out.println("");
        System.out.println(" Area de un rectangulo de 100, 100 = " +Geometria3.CalculaAreaRectangulo(100, 100));
        System.out.println("");
        System.out.println("Area de un rombo de 20, 10 = " + Geometria4.CalculaRombo(20, 10));
        System.out.println("");
        System.out.println("Area de un romboide de 20, 30 = " +Geometria5.CalculaRomboide(20, 30));
        System.out.println("");
        System.out.println("Area de un trapecio de 20,10 y 5 = " +Geometria6.CalculaTrap(20, 10, 5));
        System.out.println("");
        System.out.println("Area de un poligono regular 20,30 = "+Geometria7.Calculapoligonore(20, 30));
        System.out.println("");
        System.out.println("Area de un circulo con radio de 10 = " +Geometria8.Calculacir(10));
        System.out.println("");
        System.out.println("Area de un cono con radio de 20 y g= 30 es =" +Geometria9.Calculacono(20, 30));
        System.out.println("");
        System.out.println("Area de una esfera con radio de 20 es = " +Geometria10.Calculaesfera(20));
        
    }
    

}
class Geometria{
    // Constante Estatica Double LLamada PI
    static final double PI= 3.141516;
    /*Los metodos estáticos existen desde que el programa inicia, y solamente se puedenn usar a tráves de la clase a la que pertenece. No son Instanciables */
    /*SON UTILES para crear librerias de constantes y funciones, para usarlas sin crear objetos*/
    public static double calculaAreaCuadrado(double dLado){
    return dLado *dLado;
            }
    }

class Geomeria2{
public static double calculaAreaTriangulo(double dLado1, double dAltura){
    return (dLado1* dAltura)/2;
    
            }
}
class Geometria3{
public static double CalculaAreaRectangulo (double DLado1, double DAltura){
return DLado1 * DAltura;

}
}


class Geometria4{
public static double CalculaRombo (double Diam1, double Diam2){
return (Diam1 * Diam2)/2;
}
}

class Geometria5{
public static double CalculaRomboide (double base, double al){
return base * al;
}
}
class Geometria6{
public static double CalculaTrap (double baseM, double BaseMe, double ha){
return ((baseM * BaseMe)*ha)/2;
}
}
class Geometria7{
public static double Calculapoligonore (double peri, double apo){
return (peri * apo)/2;
}
}
class Geometria8{
public static double Calculacir ( double radio){
return (3*14 * ((radio)*(radio)));
}
}
class Geometria9{
public static double Calculacono (double rad, double g){
return (3.14 * rad) *( g+rad);
}
}
class Geometria10{
public static double Calculaesfera (double radio){
return 4*(3.14 * (radio*radio) );

}
}