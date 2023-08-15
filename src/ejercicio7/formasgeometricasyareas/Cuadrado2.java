package ejercicio7.formasgeometricasyareas;

public class Cuadrado2 extends Figura2 {
    private double lado;

    public Cuadrado2(double lado) {
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
