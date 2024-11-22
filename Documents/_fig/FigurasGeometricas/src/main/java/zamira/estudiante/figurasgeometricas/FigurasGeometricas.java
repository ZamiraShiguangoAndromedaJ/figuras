/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zamira.estudiante.figurasgeometricas;

import zamira.estudiante.figurasgeometricas.clases1.Cuadrado;

/**
 *
 * @author user
 */
public class FigurasGeometricas {

    public static void main(String[] args) {
        
        System.out.println("hola");
        
        Cuadrado objCuadrado = new Cuadrado(9);
        objCuadrado.imprimir();
        
        double area=objCuadrado.calcularAreaCuadrado();
        System.out.println("el area del Cuadrado es:"+area);
        
        double perimetro=objCuadrado.calcularPerimetroCuadrado();
        System.out.println("el perimetro Cuadrado es: "+perimetro);
        
        
        
        
        
    }
    
}
