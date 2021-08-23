/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_mvc.Controler;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import Crud_Mvc.Conexion.Conexion;
import crud_mvc.Modelo.Persona;

/**
 *
 * @author P117
 */
public class Consultas {
     Conexion con= new Conexion(); 
   public boolean escribir(Persona p) { 
        try { 
            
            String sql ="INSERT INTO usuarios VALUES ('"+p.getCedula()+"','"+p.getNombre()+"','"+p.getApellido()+"')"; 
            Statement sentencia; 
            sentencia = con.GetConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql); 
           // GetConnection().commit(); 
            sentencia.close(); 
             
        } catch (SQLException e) { 
            e.printStackTrace(); 
            System.out.print("ERROR SQL" + e); 
            return false; 
        }         
        return true; 
    } 
   
   public ResultSet consultar(Persona p) { 
        String sql ="select * from usuarios where cedula='"+p.getCedula()+"'";    
        
        ResultSet resultado =null; 
        try { 
            Statement sentencia; 
            sentencia = con.GetConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql); 
             
        } catch (SQLException e) { 
            e.printStackTrace(); 
            return resultado=null; 
        } 
        
       return resultado; 
    } 
   
      
      public void Eliminar(Persona p) {
        String sql ="delete from usuarios where cedula='"+p.getCedula()+"'"; 
        ResultSet resultado =null; 
        try { 
            Statement sentencia; 
            sentencia = con.GetConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            sentencia.close(); 
            JOptionPane.showMessageDialog(null,"REGISTRO ELIMINADO SATISFACTORIAMENTE");
                 
        } catch (SQLException e) { 
            e.printStackTrace(); 
            
        } 
        
       
    }
        public void Actualizar(Persona p) { 
        ResultSet resultado =null; 
        String sql ="update usuarios set nombre='"+p.getNombre()+"',apellido='"+p.getApellido()+"' where cedula='"+p.getCedula()+"'"; 
        try { 
            Statement sentencia; 
            sentencia = con.GetConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql); 
           // GetConnection().commit(); 
            sentencia.close(); 
           
            JOptionPane.showMessageDialog(null,"REGISTRO ACTUALIZADO SATISFACTORIAMENTE");
                 
        } catch (SQLException e) { 
            e.printStackTrace(); 
            
        } 
      }
        
        
    public ResultSet Select_sexo() { 
        String sql ="select upper(descripcion) as descripcion from sexo" ;  
        ResultSet resultado =null; 
        try { 
            Statement sentencia; 
            sentencia = con.GetConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql); 
             
        } catch (SQLException e) { 
            e.printStackTrace(); 
            return resultado=null; 
        } 
        
       return resultado; 
    } 
}
