/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Vehiculo {
    //AGREGAR ATRIBUTOS, DE ACCESO PRIVADO
    private String marca;
    private String modelo;
    private int año;
    private int cilindros;
    private boolean estaEncendido;
    private int velocidad;
    
    //AGREGAR CONSTRUCTOR DEFAULT, PONER VALORES A SU GUSTO
    public Vehiculo(){
        marca = "Volkswagen";
        modelo = "Bochito";
        año = 1998;
        cilindros = 4;
        estaEncendido = false;
        velocidad = 0;
    }
    
    //AGREGAR CONSTRUCTOR QUE ACEPTE LOS 4 ATRIBUTOS
    public Vehiculo(String sMarca, String sModelo, int iAño, int iCilin){
        this.marca = sMarca;
        this.modelo = sModelo;
        this.año = iAño;
        this.cilindros = iCilin;
        estaEncendido = false;
        velocidad = 0;
    }
    
    //EL CONSTRUCTOR DEFAULT ES CASI CASI A FUERZA
    //METODOS GET Y SET PARA CADA ATRIBUTO
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAño() {
        return año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
    
    //IMPRIMIR LOS DATOS DEL VEHICULO
    public void imprimirDatos(){
        System.out.println("TU VEHICULO ES:");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
        System.out.println("Tiene "+cilindros+" cilindros");
    }
    
    public void prender(){
        estaEncendido = true;
    }
    
    public void apagar(){
        estaEncendido = false;
    }
    
    public void acelerar(){
        if(estaEncendido){
            velocidad = velocidad + 10;
        }
    }
    
    public void frenar(){
        if(estaEncendido){
            if(velocidad >=10)
                velocidad = velocidad-10;
        }
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }
    
    public int acelerarVelo(int velocidad){
        do{
            acelerar();
            System.out.println("Vas a "+getVelocidad());
        }
        while(getVelocidad()<velocidad);
        return velocidad;
    }
    
    public int detener(int velocidad){
        do{
            frenar();
            System.out.println("Vas a "+getVelocidad());
            
        }
        while(getVelocidad()>0);
        return velocidad;
    }
}
