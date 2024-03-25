package Ejer1;

public class Reserva {
    int numero_reserva;
    private Reserva numero_vuelo;

    public Reserva(int numero_reserva, Reserva numero_vuelo) {
        this.numero_reserva = numero_reserva;
        this.numero_vuelo = numero_vuelo;
    }

    public int getNumero_reserva() {
        return numero_reserva;
    }

    public void setNumero_reserva(int numero_reserva) {
        this.numero_reserva = numero_reserva;
    }

    public Reserva getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(Reserva numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }
}
