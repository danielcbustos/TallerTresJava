package ejercicio1.figurasGeometricas;

import ejercicio1.figurasGeometricas.interfaces.IFigurasGeometricas;

public class Figura implements IFigurasGeometricas {
    protected String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void calculoArea() {

    }

    @Override
    public void calculoPerimetro() {

    }

}
