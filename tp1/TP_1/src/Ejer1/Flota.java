package Ejer1;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Avion> aviones;

    public Flota() {
        this.aviones= new ArrayList<>();
    }

    public Flota(ArrayList<Avion> aviones) {
        this.aviones = aviones;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }

    public void agregarAvion(Avion avion){
        this.aviones.add(avion);
    }
}
