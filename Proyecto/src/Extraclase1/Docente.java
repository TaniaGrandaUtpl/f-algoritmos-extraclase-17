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
public class Docente {
    private String nombres;
    private String apellidos;
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    private String asignatura_1;
    private String asignatura_2;
    
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
    
    public void establecer_titulo_tercer_nivel(String tercer_nivel){
        titulo_tercer_nivel = tercer_nivel;
    }
    public String obtener_titulo_tercer_nivel(){
        return titulo_tercer_nivel;
    }
    
    public void establecer_titulo_cuarto_nivel(String cuarto_nivel){
        titulo_cuarto_nivel = cuarto_nivel;
    }
    public String obtener_titulo_cuarto_nivel(){
        return titulo_cuarto_nivel;
    }
    
    public void establecer_asignatura_1(String a_1){
        asignatura_1 = a_1;
    }
    public String obtener_asignatura_1(){
        return asignatura_1;
    }  
        
    public void establecer_asignatura_2(String a_2){
        asignatura_2= a_2;
    }
    public String obtener_asignatura_2(){
        return asignatura_2;
    }
}
