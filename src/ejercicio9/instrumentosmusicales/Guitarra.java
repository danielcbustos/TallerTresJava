package ejercicio9.instrumentosmusicales;

public class Guitarra extends InstrumentosMusicales {

    public Guitarra() {
        super("Guitarra");

    }

    @Override
    public void tocar() {
        System.out.println(
                "Tu instrumento es " + this.tipoInstrumento + ", y hace el siguiente sonido: Twang Twang Twang ");
    }

}
