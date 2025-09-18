/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Mateo
 */
public class Rectangulo {
    private double base;
    private double altura;
    
    // Constructor sin parametros
    
    public Rectangulo (){
        System.out.println("contructor rectangulo sin parametros");
        this.base = 0.0;
        this.altura = 0.0; 
    }
// Constructor con parametros
    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura; 
}    

    // metodos
    private double area (){
    double areaCirc;
    areaCirc = base*altura;
    return areaCirc;
    }
    // Metodo para mostrar
    public void mostrarRectangulo(){
        System.out.println("base-> "+base);
        System.out.println("altura-> "+altura);
        double area = area();
        System.out.println("area del circulo "+area);
    }
    
    // metodos setter y getter
    public void setBase(double base){
        this.base = base;
        
    }
        public double getBase(){
            return this.base;
        }
        public void setAltura(double altura){
            this.altura = altura;
        }
        public double getAltura(){
            return this.altura;
        }
}
