package ejercicio10.figurasenunlienzo;

import ejercicio10.figurasenunlienzo.interfaces.IDibujable;

public abstract class Figura implements IDibujable {
    protected String tipoFigura;

    public Figura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public void dibujar() {

    }

}
