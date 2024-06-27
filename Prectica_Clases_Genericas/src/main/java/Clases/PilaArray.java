package Clases;

import java.util.NoSuchElementException;

public class PilaArray <E>{
    private E[] array;
    private int contador;

    @SuppressWarnings("unchecked")
    public PilaArray(int capacidad) {
        array = (E[]) new Object[capacidad];
        contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public boolean añadir(E elemento) {
        if (contador == array.length) {
            return false;
        }
        array[contador++] = elemento;
        return true;
    }

    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return array[contador - 1];
    }

    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        E elemento = array[--contador];
        array[contador] = null; // Limpieza de referencia
        return elemento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < contador; i++) {
            sb.append(array[i]);
            if (i < contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

