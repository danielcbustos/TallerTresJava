package ejercicio1.figurasGeometricas;

import ejercicio1.figurasGeometricas.interfaces.IFigurasGeometricas;

public class Circulo implements IFigurasGeometricas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calculoArea() {
        double areaCirculo = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + areaCirculo);
    }

    @Override
    public void calculoPerimetro() {
        double perimetroCirculo = 2 * Math.PI * radio;
        System.out.println("El perimetro del circulo es: " + perimetroCirculo);
    }

}
