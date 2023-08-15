package ejercicio6.animalesysonidos;

public class Pajaro extends TipoAnimales {
    public Pajaro(String nombreAnimal) {
        super("pollo", nombreAnimal);

    }

    @Override
    public void hacerSonido() {
        System.out.println("El " + this.tipoAnimal + " de nombre " + this.nombreAnimal + " hace pio pio pio");
    }
}
