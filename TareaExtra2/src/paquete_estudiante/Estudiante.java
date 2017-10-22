/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;

import paquete_academico.Asignatura;
import paquete_academico.Universidad;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String nombres;
    private String apellidos;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    private Universidad universidad;
    
    public void establecer_nombres(String nom){
        nombres = nom;
    }
    public String obtener_nombres(){
        return nombres;
    }
    
    public void establecer_apellidos(String apell){
        apellidos = apell;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public void establecer_asignatura_1(Asignatura as_1){
        asignatura_1 = as_1;
    }
    public Asignatura obtener_asignatura_1(){
        return asignatura_1;
    }
    
    public void establecer_asignatura_2(Asignatura as_2){
        asignatura_2 = as_2;
    }
    public Asignatura obtener_asignatura_2(){
        return asignatura_2;
    }
    
    public void establecer_universidad(Universidad u){
        universidad = u;
    }
    public Universidad obtener_universidad(){
        return universidad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Estudiante:\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Universidad: %s\n"
                + "Tiene las siguientes asignaturas: \n"
                + "Asignatura 1: %s\n"
                + "Asignatura 2: %s",obtener_nombres(),obtener_apellidos(),obtener_universidad(),obtener_asignatura_1(),obtener_asignatura_2());
        return cadena;
    }
    
    
}
