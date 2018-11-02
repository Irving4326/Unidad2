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
        //Referencias: Variable que guarda una dirección en memoria
        //Apuntadores
        Prueba pObj = new Prueba();
        pObj.iValor = 100;
        
        System.out.println(" El valor es " +pObj.iValor);
        //COPIA
        int iAlgo = 70;
        int iCopia = iAlgo;
        System.out.println(" iAlgo = " +iAlgo);
        System.out.println(" iCopia = " +iCopia);
        iAlgo= 1000;
        System.out.println(" iAlgo = " +iAlgo);
        System.out.println(" iCopia = " +iCopia);
        //Copia del objeto
        Prueba pCopiaObj = pObj;
        System.out.println(" El valor es " +pObj.iValor);
        System.out.println(" El valor es " +pCopiaObj.iValor);
        pObj.iValor=9999;
        System.out.println(" El valor es " +pObj.iValor);
        System.out.println(" El valor de la copia  es " +pCopiaObj.iValor);
        
        
    }
    
}
class Prueba{
int iValor; //4 BYTES

}