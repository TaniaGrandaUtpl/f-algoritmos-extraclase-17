/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Equipo {
    private String nombre;
    private String siglas;
    private int anio_fundacion;
    private Jugador[] jugadores;
    private Tecnico[] tecnicos;
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_siglas(String sig){
        siglas = sig;
    }
    public String obtener_siglas(){
        return siglas;
    }
    
    public void establecer_anio_fundacion(int a_f){
        anio_fundacion = a_f;
    }
    public int obtener_anio_fundacion(){
        return anio_fundacion;
    }
    
    public void establecer_Jugadores(Jugador[] jd) {
        jugadores = jd;
    }
    public Jugador[] obtener_Jugadores() {
        return jugadores;
    }

    public void establecer_Tecnicos(Tecnico[] tc) {
        tecnicos = tc;
    }
    public Tecnico[] obtener_Tecnicos() {
        return tecnicos;
    }

    public Equipo() {
        
    }

    public Equipo(Jugador[] jug, Tecnico[] tec) {
        jugadores = jug;
        tecnicos = tec;
    }
        
    public double obtener_promedio_edad_jugadores(){
        int suma=0;
        double prom=0;
        for (int i = 0; i < jugadores.length; i++) {
            suma += jugadores[i].obtener_edad();  
        }
        prom = suma/jugadores.length;
        return prom;
    }
    
    public double obtener_promedio_edad_tecnicos(){
        int suma=0;
        double prom=0;
        for (int i = 0; i < tecnicos.length; i++) {
            suma += tecnicos[i].obtener_edad();
        }
        prom = suma/tecnicos.length;
        return prom;
    }

    @Override
    public String toString() {
        String cadena = String.format("Reporte:\n"
                + "Equipo: %s(%s)\n"
                + "Año de fundación: %s\n"
                + "Sus técnicos son:\n"
                + "%s\n"
                + "Sus jugadores son:\n"
                + "%s\n"
                + "Promedio edad de:\n"
                + "Técnicos: %s años\n"
                + "Jugadores: %s años",obtener_nombre(),obtener_siglas(),obtener_anio_fundacion(),
                Arrays.toString(obtener_Tecnicos()),Arrays.toString(obtener_Jugadores()),obtener_promedio_edad_tecnicos(),obtener_promedio_edad_jugadores());
        return cadena;
    }
    
    
}
