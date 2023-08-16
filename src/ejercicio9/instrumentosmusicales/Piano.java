package ejercicio9.instrumentosmusicales;

public class Piano extends InstrumentosMusicales {

    public Piano() {
        super("Piano");

    }

    @Override
    public void tocar() {
        System.out.println(
                "Tu instrumento es " + this.tipoInstrumento + ", y hace el siguiente sonido: Plin Plin Plin ");
    }

}
