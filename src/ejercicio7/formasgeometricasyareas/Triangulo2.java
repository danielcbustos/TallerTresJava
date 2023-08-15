package ejercicio7.formasgeometricasyareas;

public class Triangulo2 extends Figura2 {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo2(double ladoA, double ladoB, double ladoC) {
        super("Triangulo");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public void calculoArea() {
        double s = (ladoA + ladoB + ladoC) / 2;
        double areaTriangulo = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
        System.out.println("El area del triangulo es: " + areaTriangulo);
    }

    @Override
    public void calculoPerimetro() {
        double perimetroTriangulo = ladoA + ladoB + ladoC;
        System.out.println("El perimetro del triangulo es: " + perimetroTriangulo);
    }
}
