package ejercicio1.figurasGeometricas;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public void calculoArea() {
        double areaCuadrado = lado * lado;
        System.out.println("El area del cuadrado es: " + areaCuadrado);
    }

    @Override
    public void calculoPerimetro() {
        double perimetroCuadrado = 4 * lado;
        System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado);
    }

}
