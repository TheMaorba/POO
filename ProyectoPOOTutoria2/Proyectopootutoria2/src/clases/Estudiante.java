/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @atributos de la clase Estudiante
 */
public class Estudiante {
  public String codigo;
  public String nombre;
  public String apellido;
  public String programa;
  public int edad;
  public double estatura;
  /**
   * Metodos
   */
  public void mostrarEstudiante(){
      System.out.println("codigo"+codigo);
      System.out.println("nombre"+nombre);
      System.out.println("apellido"+apellido);
      System.out.println("edad"+edad);
      System.out.println("estatura"+estatura);
  }  
  public String validarMayorEdad(){
      return (edad>=18)?"Es mayor de edad":"es menor de edad";
  }
  
  
  
//  public void metodoa(){
//      int ret = metodob(1, 2);
//              System.out.println(ret);
//  }          
//        public int metodob (int n, int n2){
//            return n*n2;
//  
//  }
//  public double metodob(double n3, int n4){
//        return n3*n4;
//}
}



