package org.example;


import Clases.Almacen;
import Clases.Producto;

public class Main {
    public static void main(String[] args) {

        Almacen<Producto> almacen = new Almacen<>();
        Producto alimento = new Producto("Manzana", 1.0);
        Producto electronico = new Producto("Televisor", 300.0);

        almacen.anadirProducto(alimento);
        almacen.anadirProducto(electronico);

        almacen.imprimirProductos();
    }
}