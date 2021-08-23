/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

//import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author jjnun
 */
public class Empleado {

    /**
     * @param args the command line arguments
     */
    
    /*private int id;
    private String nombre;
    private int horasExtra;
    private boolean auxilioTransporte;
    private int salario;
    
    public Empleado(String nombre, int horasExtra, boolean auxilioTransporte, int salario){
        //TODO
    }*/
    
    public static ArrayList<Double> liquidarNominaQuincenal(ArrayList<Empleado> empleados) {
        //TODO
        int n= 3;
         ArrayList empleadosArray= new ArrayList(n);
         // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++)
            empleadosArray.add(i);
  
        // Printing elements
        System.out.println(empleadosArray);
  
        return empleadosArray;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n= 3;
         ArrayList empleadosArray= new ArrayList(n);
         // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++)
            empleadosArray.add(i);
  
        // Printing elements
        System.out.println(empleadosArray);
  
        //return empleadosArray;
    }*/
    liquidarNominaQuincenal();
}
