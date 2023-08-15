package ejercicio5.tiendaenlinea;

public class Libro extends CategoriaProductos {
    int numPaginas;

    public Libro(String nombreProducto, double precio, int numPaginas) {
        super(nombreProducto, precio);
        this.numPaginas = numPaginas;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(
                "El producto libro de nombre: " + nombreProducto + " con " + numPaginas + " paginas tiene un precio de "
                        + precio + " COP");
    }

}
