/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva.pkg10;

/**
 *
 * @author Irving
 */
public class Eva10 {
    
    int iValor;
    public Eva10(){
    iValor = 10;
    
    }

    /**
     * @param args the command line arguments
     */
    static String sMensaje = "Hola ";
    public static void main(String[] args) {
        // TODO code application logic here
        Eva10 po = new Eva10();
        po.imprimir();
        po.imprimir2(10000);
        String sMensaje = "Nada de hola";
        System.out.println(sMensaje);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            
        }
    }//aqui muere todo
    public void imprimir (){
    
    
        System.out.println("Valor " + iValor);
    
    }
    public void imprimir2 (int iValor){
        System.out.println("Valor " + iValor);
        System.out.println("Valor del atributo " + this.iValor);
         //This palabra reservada, se usa oara acceder a los miembros de la clase.
        //Apuntador a la instancia actual
    }
}
