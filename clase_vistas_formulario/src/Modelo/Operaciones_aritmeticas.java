/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jjnun
 */
public class Operaciones_aritmeticas {
    
    private float num1;
    private float num2;
    private float resultado;

    public Operaciones_aritmeticas() {};
        
    public Operaciones_aritmeticas(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public void Sumar (float n1, float n2){
        this.resultado =n1+n2;
        //this.setResultado=
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
}
