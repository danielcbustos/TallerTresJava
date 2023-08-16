package ejercicio10.figurasenunlienzo;

public class Triangulo3 extends Figura {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo3(double ladoA, double ladoB, double ladoC) {
        super("Triangulo");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujaste un " + tipoFigura + " de lados " + ladoA + " cms " + ladoB + " cms " + ladoC
                + " cms sobre el lienzo");
    }
}
