/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_mvc.Modelo;

/**
 *
 * @author P117
 */
public class Persona {
    
    private String _cedula;
    private String _nombre;
    private String _apellido;

    public Persona() {
    }

    public Persona(String _cedula, String _nombre, String _apellido) {
        this._cedula = _cedula;
        this._nombre = _nombre;
        this._apellido = _apellido;
    }

    
    public String getCedula() {
        return _cedula;
    }

    public void setCedula(String _cedula) {
        this._cedula = _cedula;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }
    
    
}
