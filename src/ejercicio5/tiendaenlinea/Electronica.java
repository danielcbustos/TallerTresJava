package ejercicio5.tiendaenlinea;

public class Electronica extends CategoriaProductos {
    String marca;

    public Electronica(String nombreProducto, double precio, String marca) {
        super(nombreProducto, precio);
        this.marca = marca;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("El producto electronico: " + nombreProducto + " de marca" + marca + " tiene un precio de "
                + precio + " COP");
    }
}
