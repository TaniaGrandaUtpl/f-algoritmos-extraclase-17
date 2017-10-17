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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docente d = new Docente();
        Asignatura a = new Asignatura();
        Titulo t = new Titulo();
        
        System.out.println("CASO 1");
        System.out.println("Datos del Docente: ");
        d.establecer_nombres("Nombres: Luis V.");
        System.out.println(d.obtener_nombres());
        d.establecer_apellidos("Apellidos: Perez J.");
        System.out.println(d.obtener_apellidos());
        System.out.println("Tiene a su cargo las asignaturas: ");
        d.establecer_asignatura_1("Asignatura 1: ");
        a.establecer_nombre("Matemáticas con número de creditos ");
        a.establecer_creditos(8);
        System.out.println(d.obtener_asignatura_1()+a.obtener_nombre()+a.obtener_creditos());
        d.establecer_asignatura_1("Asignatura 2: ");
        a.establecer_nombre("Física con número de créditos ");
        a.establecer_creditos(6);
        System.out.println(d.obtener_asignatura_1()+a.obtener_nombre()+a.obtener_creditos());
        System.out.println("El docente tiene los siguientes títulos académicos: ");
        d.establecer_titulo_tercer_nivel("Título 3er nivel: ");
        t.establecer_nombre("Licenciado en Físico Matematicas - ");
        t.establecer_nombre_universidad("Universidad Politécnica");
        System.out.println(d.obtener_titulo_tercer_nivel()+t.obtener_nombre()+t.obtener_nombre_universidad());
        d.establecer_titulo_tercer_nivel("Título 4to nivel: ");
        t.establecer_nombre("Magister en Docencia Matemática - ");
        t.establecer_nombre_universidad("Universidad Valenciana");
        System.out.println(d.obtener_titulo_tercer_nivel()+t.obtener_nombre()+t.obtener_nombre_universidad());
        
        System.out.println("\n");
        
        System.out.println("CASO 2");
        System.out.println("Datos del Docente: ");
        d.establecer_nombres("Nombres: Ana M.");
        System.out.println(d.obtener_nombres());
        d.establecer_apellidos("Apellidos: Velez P.");
        System.out.println(d.obtener_apellidos());
        System.out.println("Tiene a su cargo las asignaturas: ");
        d.establecer_asignatura_1("Asignatura 1: ");
        a.establecer_nombre("Sociales con número de creditos ");
        a.establecer_creditos(9);
        System.out.println(d.obtener_asignatura_1()+a.obtener_nombre()+a.obtener_creditos());
        d.establecer_asignatura_1("Asignatura 2: ");
        a.establecer_nombre("Literatura con número de creditos ");
        a.establecer_creditos(10);
        System.out.println(d.obtener_asignatura_1()+a.obtener_nombre()+a.obtener_creditos());
        System.out.println("El docente tiene los siguientes títulos académicos: ");
        d.establecer_titulo_tercer_nivel("Título 3er nivel: ");
        t.establecer_nombre("Licenciado en Ciencias Sociales - ");
        t.establecer_nombre_universidad("Universidad Salesiana");
        System.out.println(d.obtener_titulo_tercer_nivel()+t.obtener_nombre()+t.obtener_nombre_universidad());
        d.establecer_titulo_tercer_nivel("Título 4to nivel: ");
        t.establecer_nombre("Magister en Docencia Social - ");
        t.establecer_nombre_universidad("Universidad Cataluña");
        System.out.println(d.obtener_titulo_tercer_nivel()+t.obtener_nombre()+t.obtener_nombre_universidad());
    }
    
}
