/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.ArrayList;
import reto3.Empresa;
import reto3.Empleado;

/**
 *
 * @author jjnun
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empleado e1 = new Empleado(/*1,*/"Ada", 5, true, 1500000);
        Empleado e2 = new Empleado(/*2, */"Laura", 5, true, 1085000);
        //Empleado e3 = new Empleado(/*3, */"Carmen", 5, true, 1085000);
        //Empleado e4 = new Empleado(/*3, */"Carmen", 5, true, 1085000);

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(e1);
        empleados.add(e2);
        //empleados.add(e3);
        //empleados.add(e4);

        ArrayList<Double> salida = Empresa.liquidarNominaEmp(empleados);
        ArrayList<Double> salidaParafiscal = Empresa.liquidarParafiscales(empleados);
        ArrayList<Double> salidaSeguridadSocial = Empresa.liquidarSegSocialEmp(empleados);
        ArrayList<Double> salidaPresSociales = Empresa.liquidarPrestacionesEmp(empleados);


        /*for(int i=0; i<3; i++){
            System.out.println(empleados.get(i).salario);
        }
        
        for(Empleado empleado: empleados){
            System.out.println(empleado.salario);
        }
        
        System.out.println(e1.salario);*/
        System.out.println(salida);
        System.out.println(salidaParafiscal);
        System.out.println(salidaSeguridadSocial);
        System.out.println(salidaPresSociales);

    }

}
