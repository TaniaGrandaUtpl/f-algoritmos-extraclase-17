/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author Usuario
 */
public class Tecnico {
    private String nombre;
    private String funcion;
    private int edad;

    public void establecer_nombre(String nom){
        nombre = nom;
    }
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_funcion(String fun){
        funcion = fun;
    }
    public String obtener_funcion(){
        return funcion;
    }
    
    public void establecer_edad(int eda){
        edad = eda;
    }
    public int obtener_edad(){
        return edad;
    }

    public Tecnico(String nom, String fun, int eda) {
        nombre = nom;
        funcion = fun;
        edad = eda;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s - %s - %s años\n"
                ,obtener_nombre(),obtener_funcion(),obtener_edad());
        return cadena;
    }
    
    
    
}
