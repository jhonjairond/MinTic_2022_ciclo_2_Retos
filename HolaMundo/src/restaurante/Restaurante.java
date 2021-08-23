/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.util.Scanner;

/**
 *
 * @author jjnun
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in= new Scanner(System.in);
        String dato= in.nextLine();// nextInt()//nextDoble() etc
        int test= Integer.parseInt(dato);
        /*if(dato.equals(2)){
            System.out.println("igual a 2");
        }
        else{
            System.out.println("no igual a 2");}*/
        if(test==2){
            System.out.println("igual a 2");
        }
        else{
            System.out.println("no es igual a 2");
        }
    }
        
}
    

