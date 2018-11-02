import Vehiculo.Vehiculo;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        
        Vehiculo vCarro = new Vehiculo("FORD", "F-150", 2017, 8);   // Aqui le ponemos valores por defecto 
        
        System.out.println("Dame la marca");  //Aqui el usuario guarda la marca del carro
        vCarro.setMarca(sc.nextLine());   //Aqui llamamos la metodo set y lo guardamos en el Scanner
        System.out.println(" Dame el año"); //Aqui el usuario guarda la marca del carro
        vCarro.setAño(sc.nextInt());//Aqui llamamos la metodo set y lo guardamos en el Scanner
        vCarro.imprimirDatos();
        
        vCarro.isEstaEncendido();
        
        // VERIFICAMOS SI EL AUTO ESTA ENCENDIDO
        if(!vCarro.isEstaEncendido()){ // SI NO ESTA ENCENDIDO
            vCarro.prender(); // LO ARRANCAMOS
        }
        
        vCarro.acelerar();
        System.out.println("Vas a fabulosos "+vCarro.getVelocidad()+" km/hr");
        
        System.out.println("¿A que velocidad desea llegar?");
        int velocidad = sc.nextInt();
        vCarro.acelerarVelo(velocidad);
        System.out.println("Frenando");
        vCarro.detener(velocidad);
        
    }
    
}