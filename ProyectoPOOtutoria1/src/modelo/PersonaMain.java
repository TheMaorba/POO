/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.nombre="juan";
        persona.edad=23;
        persona.estatura=1.70;
        int cuadrado = persona.cuadradoEdad();
        persona.mostrar();
        System.out.println(cuadrado);
    }
    
}
