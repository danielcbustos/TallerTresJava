package ejercicio6.animalesysonidos;

public class Gato extends TipoAnimales {

    public Gato(String nombreAnimal) {
        super("gato", nombreAnimal);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El " + this.tipoAnimal + " de nombre " + this.nombreAnimal + " hace miau miau miau");
    }
}
