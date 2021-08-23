/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;
import java.util.ArrayList;

/**
 *
 * @author jjnun
 */
public class Empresa {
    
    private ArrayList<Empleado> empleados = new ArrayList<>();

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
                if(empleado.isAuxilioTransporte()){
                    auxilioTransporte = 106454;
                }else{
                    auxilioTransporte = 0;
                }
                double valorHora = empleado.getSalario()/240;
                double valorHorasExtras = valorHora*empleado.getHorasExtra();
                double salarioMensualExtras = empleado.getSalario() + valorHorasExtras;
                //double descuentoSaludPensionMensual = salarioMensualExtras*0.08; // se calcula en los demas metodos de empresa
                double salarioMensualExtrasTransporte = empleado.getSalario() + valorHorasExtras + auxilioTransporte;
                //double salarioMensualExtrasTransporteSaludPensional = salarioMensualExtrasTransporte - descuentoSaludPensionMensual;
                
                //double salarioQuincenal = salarioMensualExtrasTransporteSaludPensional/2;
                // double salarioMensual = salarioMensualExtrasTransporteSaludPensional;
           
                //valoresALiquidar.add(salarioQuincenal);
                valoresALiquidar.add(salarioMensualExtras);
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
                if(empleado.isAuxilioTransporte()){
                auxilioTransporte = 106454;
                }else{
                    auxilioTransporte = 0;
                }
                double valorHora = empleado.getSalario()/240;
                double valorHorasExtras = valorHora*empleado.getHorasExtra();
                double salarioMensualExtras = empleado.getSalario() + valorHorasExtras;
                double descuentoComFam = salarioMensualExtras*0.04;
                double descuentoICBF = salarioMensualExtras*0.03;
                double descuentoSENA = salarioMensualExtras*0.02;
                double sumaDescuentosParafiscales = descuentoComFam + descuentoICBF + descuentoSENA ;
             
                valoresALiquidarParafiscal.add(sumaDescuentosParafiscales);
                 
            }
             return valoresALiquidarParafiscal;
        }
    }
    
    
    public static ArrayList<Double> liquidarSegSocialEmp(ArrayList<Empleado> empleados){
        
        if(empleados == null) {
            return null;
        }
        else{
           
            ArrayList<Double> valoresALiquidarSeguridadSocial = new ArrayList<Double>();
              
            for(Empleado empleado: empleados){
                double auxilioTransporte = 0;
                //verifico que tenga auxilo de transporte true or false
                if(empleado.isAuxilioTransporte()){
                auxilioTransporte = 106454;
                }else{
                    auxilioTransporte = 0;
                }
                double valorHora = empleado.getSalario()/240;
                double valorHorasExtras = valorHora*empleado.getHorasExtra();
                double salarioMensualExtras = empleado.getSalario() + valorHorasExtras;
                double descuentoSalud = salarioMensualExtras*0.085;
                double descuentoPension = salarioMensualExtras*0.12;
                double descuentoRiesgosLaborales = salarioMensualExtras*0.00522;
                double sumaDescuentosSeguridadSocial = descuentoSalud + descuentoPension + descuentoRiesgosLaborales ;
             
                valoresALiquidarSeguridadSocial.add(sumaDescuentosSeguridadSocial);
                 
            }
             return valoresALiquidarSeguridadSocial;
        }
    }
    
    
    public static ArrayList<Double> liquidarPrestacionesEmp(ArrayList<Empleado> empleados){
        
        if(empleados == null) {
            return null;
        }
        else{
           
            ArrayList<Double> valoresALiquidarPresSociales = new ArrayList<Double>();
              
            for(Empleado empleado: empleados){
                double auxilioTransporte = 0;
                //verifico que tenga auxilo de transporte true or false
                if(empleado.isAuxilioTransporte()){
                auxilioTransporte = 106454;
                }else{
                    auxilioTransporte = 0;
                }
                double valorHora = empleado.getSalario()/240;
                double valorHorasExtras = valorHora*empleado.getHorasExtra();
                double salarioMensualExtras = empleado.getSalario() + valorHorasExtras;
                double salarioMensualExtrasTransporte = empleado.getSalario() + valorHorasExtras + auxilioTransporte;
                double bonificacionPrimaServ = salarioMensualExtrasTransporte*0.0833;
                double bonificacionPrimaCesa = salarioMensualExtrasTransporte*0.0833;
                double bonificacionInteCesa = bonificacionPrimaCesa*0.12;
                double bonificacionVacaciones = empleado.getSalario()*0.0416;
                
                double sumaBonificaciones = bonificacionPrimaServ + bonificacionPrimaCesa + bonificacionInteCesa + bonificacionVacaciones ;
             
                valoresALiquidarPresSociales.add(sumaBonificaciones);
                 
            }
             return valoresALiquidarPresSociales;
        }
    }
    
    
}
