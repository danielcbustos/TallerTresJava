package ejercicio10.figurasenunlienzo;

public class Cuadrado3 extends Figura {
    private double lado;

    public Cuadrado3(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujaste un " + tipoFigura + " de lado " + lado + " cms sobre el lienzo");
    }
}
