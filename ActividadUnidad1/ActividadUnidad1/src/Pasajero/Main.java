/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pasajero;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author Mateo
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Solicitar nombre del pasajero
        System.out.println("Digite nombre del pasajero:");
        String nombre = teclado.nextLine();
        
        // Selección de tipo de documento
        System.out.println("\nSeleccione el tipo de documento:");
        System.out.println("1. Cédula");
        System.out.println("2. Pasaporte");
        System.out.println("3. Tarjeta de Identidad");
        System.out.print("Digite el número de opción: ");
        int respuestaTipoDoc = teclado.nextInt();
        teclado.nextLine(); // Limpiar buffer
        
        int tipoDocumento = respuestaTipoDoc;
        String nombreTipoDoc = "";
        

        if (respuesta == 1) {
            tipoDocumento = "Cédula";
        } else if (respuesta == 2) {
            tipoDocumento = "Pasaporte";
        } else if (respuesta == 3) {
            tipoDocumento = "Tarjeta de Identidad";
        } else {
            tipoDocumento = "Opción no válida";
        }

        System.out.println("Seleccionaste: " + tipoDocumento);
    }
}


        
        System.out.println("Ingrese el numero de documento: ");
        
        
      
        
        System.out.println("Seleccione la Aereolinea: ");

        System.out.println("Ingrese la cantidad de vuelos realizados este mes: ");
        int cantidadvuelos = teclado.nextInt();

        int valorpasaje; // declaramos como número

        if (cantidadvuelos >= 3) {                
    valorpasaje = 0;   // sin comillas
    } else {
    valorpasaje = 200000;  // sin comillas
}

System.out.println("El valor del pasaje es: " + valorpasaje);
        
        
        
        Avianca
        Emirates
        Qatar Airways
                
                
                
    public int tipodocumento;
    public String documento;
    public char claseavion;
    private String aereolinea;
    public int valorpasaje;
    private int codigovuelo;
    private double duracionvuelo;
    private LocalTime horapartida;
    private LocalTime horallegada;
    private int descuento;
    public String cancelacion;
        
        
        
        Pasajero pasajero1 = new Pasajero();
    }
    



        p1.setnombre(nombre);
        p1.settipodocumento(tipodocumento);


         System.out.println("************************************");
         pasajero1.mostrarpasajero();
    
         
         
        Pasajero pasajero2 = new Pasajero();
        pasajero2.mostrarpasajero();
}
