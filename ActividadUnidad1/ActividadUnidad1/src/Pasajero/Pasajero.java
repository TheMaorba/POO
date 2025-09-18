/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pasajero;
import java.time.LocalTime;

/**
 *
 * @author Mateo
 */

// Se define la clase pasajero 
public class Pasajero {
    
    // Atributos privados para encapsulación
    private String nombre;
    private int tipoDocumento;
    private String documento;
    private char claseAvion;
    private String aerolinea;
    private int valorPasaje;
    private int codigoVuelo;
    private double duracionVuelo;
    private LocalTime horaPartida;
    private LocalTime horaLlegada;
    
    
    
    // Constructor sin parámetros
    public Pasajero() {
        System.out.println("Constructor Pasajero sin parámetros");
        this.codigoVuelo = 123456;
        this.valorPasaje = 200000;
        this.horaPartida = LocalTime.of(1, 30);
        this.horaLlegada = LocalTime.of(6, 30);
        this.duracionVuelo = 5.0; // 5 horas de duración
    }
   
    
    
    // Metodo para mostrar datos del pasajero
    public void mostrarpasajero1(){
        System.out.println("nombre -> "+nombre);
        System.out.println("tipo de documento -> "+tipodocumento);
        System.out.println("Clase Avion -> "+claseavion);
        System.out.println("Aereolinea -> "+aereolinea);
        System.out.println("Valor Pasaje -> "+valorpasaje);
        System.out.println("Codigo Vuelo -> "+codigovuelo);
        System.out.println("Duracion del vuelo -> "+duracionvuelo);
        System.out.println("Hora de Partida -> "+horapartida);
        System.out.println("Hora de LLegada -> "+horallegada);
        
        
       
        
        
        
        // Constructor sin parametro
        
        public Pasajero() {
            
        }
    }
    
    
}
