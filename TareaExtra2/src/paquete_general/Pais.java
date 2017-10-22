/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_general;

/**
 *
 * @author Usuario
 */
public class Pais {
    private String nombre;
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    public String obtener_nombre(){
        return nombre;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s",obtener_nombre());
        return cadena;
    }
    
    

}
