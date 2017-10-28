/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;
import paquete_deportes.Equipo;
import paquete_deportes.Jugador;
import paquete_deportes.Tecnico;
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
        Jugador jugadores[] = new Jugador[6];
        jugadores [0] = new Jugador("Manuel Álvarez", "Arquero", 20);
        jugadores [1] = new Jugador("Eduardo Valencia", "Defensa", 21);
        jugadores [2] = new Jugador("Fabian Cevallos", "Defensa", 30);
        jugadores [3] = new Jugador("Antonio Lara", "Centrocampista", 32);
        jugadores [4] = new Jugador("Luis Delgado", "Centrocampista", 17);
        jugadores [5] = new Jugador("Xavier López", "Delantero", 25);
        
        Tecnico tecnicos[] = new Tecnico[3];
        tecnicos [0] = new Tecnico("Luis Gómez", "Técnico Principal", 45);
        tecnicos [1] = new Tecnico("Julio Neto", "Asistente Técnico", 46);
        tecnicos [2] = new Tecnico("Marco Silva", "Preparador Físico", 47);
        
        Equipo e = new Equipo();
        e.establecer_nombre("Boca Juniors");
        e.obtener_nombre();
        e.establecer_siglas("CABJ");
        e.obtener_siglas();
        e.establecer_anio_fundacion(1940);
        e.obtener_anio_fundacion();
        e.establecer_Tecnicos(tecnicos);
        e.obtener_Tecnicos();
        e.establecer_Jugadores(jugadores); 
        e.obtener_Jugadores();
        e.obtener_promedio_edad_tecnicos();
        e.obtener_promedio_edad_jugadores();
        System.out.println(e);
    }
    
}
