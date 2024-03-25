package Ejer2;

public class Cliente extends Persona_2{
    private int numer_tarjeta;

    public Cliente(String nombre, int edad) {
        super(nombre, edad);
    }

    public Cliente(String nombre, int edad, int numer_tarjeta) {
        super(nombre, edad);
        this.numer_tarjeta = numer_tarjeta;
    }

    public int getNumer_tarjeta() {
        return numer_tarjeta;
    }

    public void setNumer_tarjeta(int numer_tarjeta) {
        this.numer_tarjeta = numer_tarjeta;
    }
}
