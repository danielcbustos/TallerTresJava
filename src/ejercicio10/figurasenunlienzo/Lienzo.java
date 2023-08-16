package ejercicio10.figurasenunlienzo;

import java.util.ArrayList;
import java.util.List;

import ejercicio10.figurasenunlienzo.interfaces.IDibujable;

public class Lienzo {
    private List<IDibujable> figurasDibujables;
    private IDibujable cuadrado;
    private IDibujable triangulo;
    private IDibujable circulo;

    public Lienzo(IDibujable cuadrado, IDibujable triangulo, IDibujable circulo) {
        this.cuadrado = cuadrado;
        this.triangulo = triangulo;
        this.circulo = circulo;
        this.figurasDibujables = new ArrayList<>();
    }

    public List<IDibujable> listarFiguras() {
        figurasDibujables.add(circulo);
        figurasDibujables.add(triangulo);
        figurasDibujables.add(cuadrado);
        return figurasDibujables;
    }

}
