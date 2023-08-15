package ejercicio1.figurasGeometricas;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Circulo");
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
