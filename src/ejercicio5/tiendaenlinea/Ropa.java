package ejercicio5.tiendaenlinea;

public class Ropa extends CategoriaProductos {
    String talla;

    public Ropa(String nombreProducto, double precio, String talla) {
        super(nombreProducto, precio);
        this.talla = talla;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("El producto de ropa: " + nombreProducto + " de talla " + talla + " tiene un precio de "
                + precio + " COP");
    }
}
