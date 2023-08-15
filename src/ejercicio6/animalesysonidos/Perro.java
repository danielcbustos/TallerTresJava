package ejercicio6.animalesysonidos;

public class Perro extends TipoAnimales {

    public Perro(String nombreAnimal) {
        super("perro", nombreAnimal);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El " + this.tipoAnimal + " de nombre " + this.nombreAnimal + " hace guau guau guau");
    }

}
