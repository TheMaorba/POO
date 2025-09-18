/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

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
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite base objeto 1");
        double baseR1 = teclado.nextDouble();        
        System.out.println("Digite altura objeto 1");
        double alturaR1 = teclado.nextDouble();
        
        
        // Asi es como se crea un objeto
        // Si no defino el constructor se llama constructor con parametros
        // COnstructor sin parametros por defecto
        Rectangulo r1 = new Rectangulo();

        
        r1.setBase(baseR1);
        r1.setAltura(alturaR1);
        
        // Aqui se crearon con atributos publicos - Antes
        //r1.base = 45.6;
        //r1.altura = 34.4;
        
        System.out.println("************************************");
        r1.mostrarRectangulo();
        
        ///////////////////////////////////////////////////////////////////
        System.out.println("Digite base objeto 2");
        double baseR2 = teclado.nextDouble();        
        System.out.println("Digite altura objeto 2");
        double alturaR2 = teclado.nextDouble();
        Rectangulo r2 = new Rectangulo(baseR2,alturaR2);
        
        
        //creo otro objeto
        //Rectangulo r2 = new Rectangulo(10.1,20.2);
        

        // Ahora se hizo con atributos
        // r1.setAltura(34.4);
        // r1.setBase(45.6);
        
        System.out.println("************************************");
        r2.mostrarRectangulo();
        
 //       System.out.println("base-> "+r1.getBase());
  //      System.out.println("altura-> "+r1.getAltura());
    //    double areaR1 = r1.area();
  //      System.out.println("area del circulo "+areaR1);
  //      System.out.println("************************************");
        
  //              System.out.println("base-> "+r2.getBase());
  //      System.out.println("altura-> "+r2.getAltura());
  //      double areaR2 = r2.area();
  //      System.out.println("area del circulo "+areaR2);
  //      System.out.println("************************************");
    }
    
}
