/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;
import java.util.ArrayList;

/**
 *
 * @author jjnun
 */
public class Empresa {
    
    ArrayList<Empleado> empleados = new ArrayList<>();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
    public static ArrayList<Double> liquidarNominaEmp(ArrayList<Empleado> empleados){
        
        if(empleados == null) {
            return null;
        }
        else{
            ArrayList<Double> valoresALiquidar = new ArrayList<Double>();
              
            for(Empleado empleado: empleados){
                double auxilioTransporte = 0;
                //verifico que tenga auxilo de transporte true or false
                if(empleado.auxilioTransporte){
                    auxilioTransporte = 106454;
                }else{
                    auxilioTransporte = 0;
                }
                double valorHora = empleado.salario/240;
                double valorHorasExtras = valorHora*empleado.horasExtra;
                double salarioMensualExtras = empleado.salario + valorHorasExtras;
                double descuentoSaludPensionMensual = salarioMensualExtras*0.08;
                double salarioMensualExtrasTransporte = empleado.salario + valorHorasExtras + auxilioTransporte;
                double salarioMensualExtrasTransporteSaludPensional = salarioMensualExtrasTransporte - descuentoSaludPensionMensual;
                
                //double salarioQuincenal = salarioMensualExtrasTransporteSaludPensional/2;
                double salarioMensual = salarioMensualExtrasTransporteSaludPensional;
           
                //valoresALiquidar.add(salarioQuincenal);
                valoresALiquidar.add(salarioMensual);
            }
            return valoresALiquidar;
        }
    }
    
    
    public static ArrayList<Double> liquidarParafiscales(ArrayList<Empleado> empleados){
        
        if(empleados == null) {
            return null;
        }
        else{
           
            ArrayList<Double> valoresALiquidarParafiscal = new ArrayList<Double>();
              
            for(Empleado empleado: empleados){
                double auxilioTransporte = 0;
                //verifico que tenga auxilo de transporte true or false
                if(empleado.auxilioTransporte){
                auxilioTransporte = 106454;
                }else{
                    auxilioTransporte = 0;
                }
                double valorHora = empleado.salario/240;
                double valorHorasExtras = valorHora*empleado.horasExtra;
                double salarioMensualExtras = empleado.salario + valorHorasExtras;
                double descuentoComFam = salarioMensualExtras*0.04;
                double descuentoICBF = salarioMensualExtras*0.03;
                double descuentoSENA = salarioMensualExtras*0.02;
                double sumaDescuentosParafiscales = descuentoComFam + descuentoICBF + descuentoSENA ;
             
                valoresALiquidarParafiscal.add(sumaDescuentosParafiscales);
                 
            }
             return valoresALiquidarParafiscal;
        }
    }
    
    
    
    
}
