package ejercicio4.juegodecartas;

public class CartaPoker extends CartaBase {

    public CartaPoker(String palo, String valor) {
        super(palo, valor);

    }

    @Override
    public void mostrarCarta() {
        System.out.println(valor + " de " + palo);
    }

    @Override
    public int valorNumerico() {
        switch (valor) {
            case "As":
                return 1;
            case "Jota":
                return 11;
            case "Reina":
                return 12;
            case "Rey":
                return 13;
            default:
                return Integer.parseInt(valor);
        }
    }

}
