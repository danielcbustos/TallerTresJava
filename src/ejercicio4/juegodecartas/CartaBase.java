package ejercicio4.juegodecartas;

import ejercicio4.juegodecartas.interfaces.ISistemaCartas;

public abstract class CartaBase implements ISistemaCartas {
    protected String palo;
    protected String valor;

    public CartaBase(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    @Override
    public void mostrarCarta() {

    }

    @Override
    public int valorNumerico() {
        return Integer.parseInt(valor);
    }
}
