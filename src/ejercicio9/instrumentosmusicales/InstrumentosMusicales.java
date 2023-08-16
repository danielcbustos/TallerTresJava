package ejercicio9.instrumentosmusicales;

public abstract class InstrumentosMusicales {
    protected String tipoInstrumento;

    public InstrumentosMusicales(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public abstract void tocar();
}
