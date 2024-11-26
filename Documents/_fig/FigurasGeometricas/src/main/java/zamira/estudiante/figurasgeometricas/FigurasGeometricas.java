/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zamira.estudiante.figurasgeometricas;

import zamira.estudiante.figurasgeometricas.clase1.Circulo;
import zamira.estudiante.figurasgeometricas.clase2.Rectangulo;



/**
 *
 * @author user
 */
public class FigurasGeometricas {
    

    public static void main(String[] args) {
        
        Circulo objCirculo = new Circulo (3.4);
        
        double Area = objCirculo.calcularAreaCirculo();
        System.out.println("El area del Circulo es :" + Area);
        
        double Perimetro = objCirculo.calcularPerimetroCirculo();
        System.out.println("El perimetro del Circulo es :" + Perimetro);
        
        
        Rectangulo objRectangulo = new Rectangulo (5,2);
        double area = objRectangulo.calcularArea();
        System.out.println("El area del rectangulo es " + area);
        
        double perimetro = objRectangulo.calcularPerimetro();
        System.out.println("El perimetro del Circulo es :" + perimetro);
      
    
    }
}
