/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author Usuario
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_creditos(int cred){
        creditos = cred;
    }
    public int obtener_creditos(){
        return creditos;
    }
    
    public void establecer_carrera(Carrera carr){
        carrera = carr;
    }
    public Carrera obtener_carrera(){
        return carrera;
    }
    
    public void establecer_docente(Docente docen){
        docente = docen;
    }
    public Docente obtener_docente(){
        return docente;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s (%s créditos) de la carrera %s. Docente: %s",obtener_nombre(),obtener_creditos(),obtener_carrera(),obtener_docente());
        return cadena;
    }
    
    
    
}
