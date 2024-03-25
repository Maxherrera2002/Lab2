package Ejer2;

public class Reserva {
    private int numerodereserva;
    private Cliente cliente;
    private Avion_ejer2 avionasignado;

    public Reserva(Avion_ejer2 avionasignado) {
        this.avionasignado = avionasignado;
    }

    public Reserva(int numerodereserva, Cliente cliente, Avion_ejer2 avionasignado) {
        this.numerodereserva = numerodereserva;
        this.cliente = cliente;
        this.avionasignado = avionasignado;
    }

    public Reserva(int numerodereserva, Cliente cliente) {
        this.numerodereserva = numerodereserva;
        this.cliente = cliente;
    }

    public int getNumerodereserva() {
        return numerodereserva;
    }

    public void setNumerodereserva(int numerodereserva) {
        this.numerodereserva = numerodereserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Avion_ejer2 getAvionasignado() {
        return avionasignado;
    }

    public void setAvionasignado(Avion_ejer2 avionasignado) {
        this.avionasignado = avionasignado;
    }
}
