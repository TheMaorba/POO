/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante est1 = new Estudiante();
        est1.codigo ="0001";
        est1.nombre ="maria";
        est1.apellido ="velez";
        est1.edad = 20;
        est1.estatura = 1.70;
        est1.programa ="ingenieria de software";
        est1.mostrarEstudiante();
        String validar = est1.validarMayorEdad();
        System.out.println(validar);
    }
    
}
