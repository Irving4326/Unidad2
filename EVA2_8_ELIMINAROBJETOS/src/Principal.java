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
          // TODO code application logic here
        //Hay que desconectarlos    c y c++ --> malloc
        Test tObj = new Test();
        Test tCopia = tObj;
        tObj.iVal =100;
        System.out.println(tObj.iVal);
        System.out.println(tObj);
        System.out.println(tCopia);
        tObj = new Test();
        System.out.println("Señor Slim, usted tiene " +tObj.iVal);
        System.out.println(tObj);
        tObj = null;
        System.out.println(tObj);
        System.out.println("Pereme Sr Slim, tiene " +tCopia.iVal);
    }
    
}
class Test{

int iVal;
}