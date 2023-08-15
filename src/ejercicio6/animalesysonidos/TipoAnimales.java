package ejercicio6.animalesysonidos;

public abstract class TipoAnimales {
    protected String tipoAnimal;
    protected String nombreAnimal;

    public TipoAnimales(String tipoAnimal, String nombreAnimal) {
        this.tipoAnimal = tipoAnimal;
        this.nombreAnimal = nombreAnimal;
    }

    public abstract void hacerSonido();
}
