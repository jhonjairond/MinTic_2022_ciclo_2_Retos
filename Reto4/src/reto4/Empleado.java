/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

/**
 *
 * @author jjnun
 */
public class Empleado {
    
    //private int id;
    private String nombre;
    private int horasExtra;
    private boolean auxilioTransporte;
    private int salario;
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Empleado() {
    }

    public Empleado(String nombre, int horasExtra, boolean auxilioTransporte, int salario) {
        this.nombre = nombre;
        this.horasExtra = horasExtra;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
    }
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public boolean isAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(boolean auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
