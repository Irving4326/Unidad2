/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones obj = new Operaciones(){
            @Override
            public int suma(int val1, int val2) {
                return val1+val2;
            }

            @Override
            public String suma(String cade1, String cade2) {
                return cade1 + cade2;
            }

            @Override
            public boolean suma(boolean bool1, boolean bool2) {
                return bool1 && bool2;
            }
        
        };
        System.out.println("");
        System.out.println(obj.suma("Mundo ", "Cruel"));
        System.out.println(obj.suma(10, 10));
        System.out.println(obj.suma(true, false));
    }
    
}
interface Operaciones{
public int suma(int val1, int val2);
public String suma(String cade1, String cade2);
public boolean suma ( boolean bool1, boolean bool2);
}