/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamira.estudiante.figurasgeometricas.clase1;

/**
 *
 * @author anthony
 */
public class Circulo {
    public double radio;
    public Circulo (){
    
}
    public Circulo(double radio) {
        this.radio = radio;

    }
    public void imprimir() {
        System.out.println("el Radio es: " + radio);
    }
     public double calcularAreaCirculo() {
        
        return radio*radio;

    }
      public double calcularPerimetroCirculo(){
        
        return radio*1;
    }
    
}
