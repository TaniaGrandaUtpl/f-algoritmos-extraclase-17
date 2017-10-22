/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_estudiante.Estudiante;
import paquete_academico.Asignatura;
import paquete_academico.Carrera;
import paquete_academico.Docente;
import paquete_academico.Universidad;
import paquete_general.Pais;
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
        Pais p = new Pais();
        p.establecer_nombre("Ecuador");
        Pais p1 = new Pais();
        p1.establecer_nombre("Colombia");
        Pais p2 = new Pais();
        p2.establecer_nombre("Perú");
        
        Docente d = new Docente();
        d.establecer_nombres("Mario");
        d.establecer_apellidos("Alcivar");
        d.establecer_pais(p1);
        Docente d1 = new Docente();
        d1.establecer_nombres("María");
        d1.establecer_apellidos("Ruiz");
        d1.establecer_pais(p2);
        
        Carrera c = new Carrera();
        c.establecer_nombre("Sistemas");
        c.establecer_modalidad("presencial");
        
        Asignatura a = new Asignatura();
        a.establecer_nombre("Matemáticas");
        a.establecer_creditos(10);
        a.establecer_carrera(c);
        a.establecer_docente(d);
        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Física");
        a1.establecer_creditos(8);
        a1.establecer_carrera(c);
        a1.establecer_docente(d1);
        
        Universidad u = new Universidad();
        u.establecer_nombre("Universidad Técnica Particular de Loja");
        u.establecer_siglas("UTPL");
        u.establecer_pais(p);
        
        System.out.println("CASO 1: ");
        Estudiante e = new Estudiante();
        e.establecer_nombres("Luis V.");
        e.establecer_apellidos("Perez J.");
        e.establecer_universidad(u);
        e.establecer_asignatura_1(a);
        e.establecer_asignatura_2(a1);
        
        System.out.println(e);
        
        System.out.println("\n");
        
        Pais p3 = new Pais();
        p3.establecer_nombre("Venezuela");
        
        Docente d2 = new Docente();
        d2.establecer_nombres("Luis");
        d2.establecer_apellidos("Armijos");
        d2.establecer_pais(p3);
        
        Carrera c1 = new Carrera();
        c1.establecer_nombre("Ingeniería Química");
        c1.establecer_modalidad("distancia");

        
        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("Biología");
        a2.establecer_creditos(9);
        a2.establecer_carrera(c1);
        a2.establecer_docente(d2);
        Asignatura a3 = new Asignatura();
        a3.establecer_nombre("Física");
        a3.establecer_creditos(7);
        a3.establecer_carrera(c1);
        a3.establecer_docente(d1);
        
        Universidad u1 = new Universidad();
        u1.establecer_nombre("Universidad Técnica Equinoccial");
        u1.establecer_siglas("UTE");
        u1.establecer_pais(p);
        
        System.out.println("CASO 2: ");
        Estudiante e1 = new Estudiante();
        e1.establecer_nombres("Ana.");
        e1.establecer_apellidos("Lima J.");
        e1.establecer_universidad(u1);
        e1.establecer_asignatura_1(a2);
        e1.establecer_asignatura_2(a3);
        
        System.out.println(e1);
    }
    
}
