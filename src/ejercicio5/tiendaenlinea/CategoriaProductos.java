package ejercicio5.tiendaenlinea;

import ejercicio5.tiendaenlinea.interfaces.ISistemaTienda;

public class CategoriaProductos implements ISistemaTienda {

    protected String nombreProducto;
    protected double precio;

    public CategoriaProductos(String nombreProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
    }

}
