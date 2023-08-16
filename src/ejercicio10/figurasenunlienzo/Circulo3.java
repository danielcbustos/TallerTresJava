package ejercicio10.figurasenunlienzo;

public class Circulo3 extends Figura {
    private double radio;

    public Circulo3(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujaste un " + tipoFigura + " de radio " + radio + " sobre el lienzo");
    }
}
