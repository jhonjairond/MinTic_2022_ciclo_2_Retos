/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jjnun
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Scanner in= new Scanner(System.in);
        System.out.println("Hola Mundo");
        String dato= in.nextLine();
        System.out.println("el dato ingresado es: "+ dato);*/
        String mensaje= "ingrese un puto dato" , str ;
        str= JOptionPane.showInputDialog(null, mensaje);
        System.out.println("el dato ingresado es: "+ str);
        
        
    }
    
}
