/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Doctor dSimi = new Doctor();
        dSimi.tratarPaciente();
        Cirujano cStrange = new Cirujano();
        cStrange.tratarPaciente();
        cStrange.cobrar();
        Doctor dChapatin = new Cirujano();
        dChapatin.tratarPaciente();
        Cirujano cHouse = (Cirujano)dChapatin;
        cHouse.cobrar();
        
    }
    
}

class Cirujano extends Doctor{
public void cobrar(){
    System.out.println("Harta Lana!!");
}
    @Override
    public void tratarPaciente() {
        System.out.println(" Cirugía a corazón abierto ");
    }

}

class Doctor{
public void tratarPaciente(){
    System.out.println("Paracetamol");
}

}
