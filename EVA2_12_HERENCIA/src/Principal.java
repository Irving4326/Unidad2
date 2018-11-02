
import Missclase.Clientes;
import Missclase.Empleados;
import Missclase.EstadoCivil;
import Missclase.Persona;
import java.util.Scanner;

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
        Scanner yolo = new Scanner (System.in);
        // TODO code application logic here
        /*
        po.setNombre("IRVING");
        po.setApellido("MANCERA");
        po.setEstadoCivil(EstadoCivil.VIUDO);
        */
        Persona po = new Persona();
        System.out.println("");
        System.out.println("PERSONA");
        System.out.println(po.getNombre() + " " + po.getApellido() + " " +po.getDireccion() + "Estado civil : " +po.getEstadoCivil() );
        
        
        System.out.println("");
        
        Empleados em = new Empleados();
        
       
        System.out.println("Empleados");
        System.out.println("Dame tu salario ");
        em.setSalario(yolo.nextInt());
        System.out.println(em.getNombre() + " " + em.getApellido() + " " +em.getDireccion() +" " +em.getEdad() +" " +em.getSalario());
        System.out.println("");
       
        
        
        /*em.setNombre("Juan");
        em.setApellido("Picapiedra");
        em.setEstadoCivil(EstadoCivil.CASADO);
        em.setSalario(1);
        */
        
        Clientes cl = new Clientes();
        cl.setRFC("sfd");
        System.out.println("");
        System.out.println("Clientes");
        System.out.println(cl.getNombre() + " " + cl.getApellido() + " " +cl.getDireccion() +" " +cl.getRFC());
        
    }

}
