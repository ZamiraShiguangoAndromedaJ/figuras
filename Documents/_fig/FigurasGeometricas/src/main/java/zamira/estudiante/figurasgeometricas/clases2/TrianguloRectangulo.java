/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamira.estudiante.figurasgeometricas.clases2;

import zamira.estudiante.figurasgeometricas.enunmeraciones.TipoTriangulo;

/**
 *
 * @author user
 */
public class TrianguloRectangulo {

    public double baseCentimetro;
    public double alturaCentimetro;
    public TipoTriangulo tipoTriangulo;

    public TrianguloRectangulo(double baseCentimetro, double alturaCentimetro) {
        this.baseCentimetro = baseCentimetro;
        this.alturaCentimetro = alturaCentimetro;
        this.tipoTriangulo = tipoTriangulo();
    }

   /* public void imprimir() {
        System.out.println(" baseCentimetro: " + baseCentimetro);
        System.out.println("alturaCentimetro: " + alturaCentimetro);

    }*/

    public double calcularAreaTrianguloRectangulo() {

        return (baseCentimetro * alturaCentimetro) / 2;

    }

    public double calcularHipotenunsaTrianguloRectangulo() {
        
           

        return Math.sqrt(Math.pow(baseCentimetro, 2) + Math.pow(alturaCentimetro, 2));

    }

    public double  calcularPerimetroTrianguloRectangulo() {

        return baseCentimetro + alturaCentimetro + calcularHipotenunsaTrianguloRectangulo();

    }
    
    public TipoTriangulo tipoTriangulo() {
        double hipotenusa = calcularHipotenunsaTrianguloRectangulo();
        double lado1 = baseCentimetro;
        double lado2 = alturaCentimetro;

        if (lado1 == lado2 && lado2 == hipotenusa) {
            return TipoTriangulo.EQUILATERO;  
        } else if (lado1 == lado2 || lado2 == hipotenusa || lado1 == hipotenusa) {
            return TipoTriangulo.ISOCELES;  
        } else {
            return TipoTriangulo.ESCALENO;  
    }
       

}
}
