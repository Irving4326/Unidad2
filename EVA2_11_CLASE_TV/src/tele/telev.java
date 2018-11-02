/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tele;

import java.util.Scanner;

/**
 *
 * @author escritorio
 */
public class telev {
    //Creamos las variables
    private boolean encendido;
    private int volumen;
    private int canal;
  
    //
    
    public telev(boolean encendido, int volumen, int canal) {
        this.encendido = encendido;
        this.volumen = volumen;
        this.canal = canal;
    }
    
    public telev(){
    encendido= false;
    volumen=0;
    canal = 1;
    }
    
    
    public void prendido (){   //Creamos el metodo para prenderlo
    encendido = true;
    }
    public void apagado(){
    encendido=false;
    }

    public void canal(){
    canal=canal;
    }
    public void volumen(){
    
    if(volumen>=0){
    volumen=volumen+1;
    }if(volumen>999){
        System.out.println("Ya estas al maximo ");
    }
    }
    
    public void dismivolumen(){
    if(volumen>0){
    volumen=volumen-1;
    }
    if(volumen<=0){
        System.out.println("MUTE");
        System.out.println("No se puede disminuir mas");
        
    }
    
    
    }
    
    public void avanzarcanal(){
                  if(encendido=true){
                  }if(canal>=1 ||canal<=999 ){  
                  canal=canal +1;             
                                             }
                  if(canal>999){
                  canal=1;
                  }
    }

    public void tele(){
        int x,y,z,r;
        Scanner sc = new Scanner( System.in );
        telev te = new telev();
    System.out.println("Quieres prender la tele 1= si  otro numero: no");
        x=sc.nextInt();
        
        if(x==1){
        do{
            
            
           
        //Verificamos si esta encendido
        if(!te.isEncendido()){   //Si no esta encendido
            te.prendido();       //Lo prendemos
            System.out.println("La tele esta prendida");
        }
        System.out.println("Estan en el canal "  +te.getCanal());
        System.out.println("El volumen es " +te.getVolumen());
        
        
            System.out.println("");
            System.out.println("Quieres avanzar de canal uno en uno?   1:si 2:no ");
            y=sc.nextInt();
            if(y==1){
                do{
                    te.avanzarcanal();
                    System.out.println("el canal es " +te.getCanal());
                    System.out.println("Seguimos?  1: si  otro numero: nel");
                    y=sc.nextInt();
            }while(y==1);
                }
            
            System.out.println("Pon un canal en especifico");
            te.setCanal(sc.nextInt());
            System.out.println("Estaen en el canal " +te.getCanal());
            
            
            
            System.out.println("Quieres aumentar el volumen del canal: 1:si 2:no ");
            z=sc.nextInt();
            if(z==1){
            do{
            te.volumen();
                System.out.println("El volumen es: "  +te.getVolumen());
                System.out.println("Seguimos incrementando el volumen? 1:si  otro numero: nel "  );
            z=sc.nextInt();
            }while(z==1);
          
            
            }
            System.out.println("Quieres disminuir el volumen del canal: 1:si 2:no ");
            r=sc.nextInt();
            if(r==1){
            do{
            
            te.dismivolumen();
                System.out.println("El volumen es: "  +te.getVolumen());
                System.out.println("Seguimos disminuyendo el volumen 1:si otro numero: nel xd ");
            r=sc.nextInt();
            
            
            }while(r==1);
            }
            
            
            
            System.out.println("Estas en el canal: "  +te.getCanal()  + "  El volumen es: " +te.getVolumen());
            
        System.out.println("Quieres apagar la tele  1: no  otro numero: si");
        x=sc.nextInt();
        }while(x==1);
        
        
        
        }
        System.out.println("");
        System.out.println("Genial, ahora lee un libro");
    
    }
    
    
    
    
    
    
    
    
    
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    

    
    
    // Imprimimos datos
    public void impri(){
        System.out.println("Tu es");
    
        System.out.println(" Canal " +canal);
    }
}
