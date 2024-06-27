package Clases;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    private List<T> productos = new ArrayList<>();

    public void anadirProducto(T producto) {
        productos.add(producto);
    }

    public void imprimirProductos() {
        for (T producto : productos) {
            System.out.println(producto);
        }
    }
}
