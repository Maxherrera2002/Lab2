package Ejer1;

public class Vuelo {
    private int numero_vuelo;
    private Avion avionAsignado;

    public Vuelo(Avion avionAsignado) {
        this.avionAsignado = avionAsignado;
    }

    public Vuelo(int numero_vuelo, Avion avionAsignado) {
        this.numero_vuelo = numero_vuelo;
        this.avionAsignado = avionAsignado;
    }

    public int getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(int numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public Avion getAvionAsignado() {
        return avionAsignado;
    }

    public void setAvionAsignado(Avion avionAsignado) {
        this.avionAsignado = avionAsignado;
    }
}
