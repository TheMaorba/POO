/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Persona {
    //atributos 
    public String nombre;
    public int edad;
    public double estatura;
    //metodos
    public void mostrar(){
        System.out.println("nombre"+nombre);
        System.out.println("edad"+edad);
        System.out.println("estatura"+estatura);
    }
    public int cuadradoEdad(){
        return edad*edad;
    }   
}