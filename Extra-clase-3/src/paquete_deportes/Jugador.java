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
public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_posicion(String pos){
        posicion = pos;
    }
    public String obtener_posicion(){
        return posicion;
    }
    
    public void establecer_edad(int eda){
        edad = eda;
    }
    public int obtener_edad(){
        return edad;
    }

    public Jugador(String nom, String pos, int eda) {
        nombre = nom;
        posicion = pos;
        edad = eda;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s - %s - %s años\n"
                ,obtener_nombre(),obtener_posicion(),obtener_edad());
        return cadena;
    }
    
    
    
    
    
}
