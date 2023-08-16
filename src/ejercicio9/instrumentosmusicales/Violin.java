package ejercicio9.instrumentosmusicales;

public class Violin extends InstrumentosMusicales {

    public Violin() {
        super("Violin");

    }

    @Override
    public void tocar() {
        System.out.println(
                "Tu instrumento es " + this.tipoInstrumento + ", y hace el siguiente sonido: Glin Glin Glin ");
    }

}
