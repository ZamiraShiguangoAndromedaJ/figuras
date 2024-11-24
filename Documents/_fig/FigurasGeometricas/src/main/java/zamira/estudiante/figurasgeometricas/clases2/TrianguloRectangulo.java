/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamira.estudiante.figurasgeometricas.clases2;

/**
 *
 * @author user
 */
public class TrianguloRectangulo {
    
    public double  baseCentimetro;
    public double alturaCentimetro;
    
        public TrianguloRectangulo(double  baseCentimetro, double alturaCentimetro) {
        this. baseCentimetro =  baseCentimetro;
        this.alturaCentimetro = alturaCentimetro;

    }

    public void imprimir() {
        System.out.println(" baseCentimetro: " +  baseCentimetro);
        System.out.println("alturaCentimetro: "+ alturaCentimetro);

    }

    public double calcularAreaTrianguloRectangulo() {
        
        return (baseCentimetro*alturaCentimetro)/2;

    }
    /*
    public double calcularPerimetroTrianguloRectangulo(){
        
        return longitudLadoCentimetro*4;
    }*/
    
}
