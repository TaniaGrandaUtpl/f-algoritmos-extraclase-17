/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extraclase1;

/**
 *
 * @author Usuario
 */
public class Titulo {
    private String nombre;
    private String nombre_universidad;
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_nombre_universidad(String nom_u){
        nombre_universidad = nom_u;
    }
    public String obtener_nombre_universidad(){
        return nombre_universidad;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
