package Ejer1;

public class Piloto extends Persona implements Volador {
    private int licencia_piloto;

    public Piloto(String nombre, int edad, int licencia_piloto) {
        super(nombre, edad);
        this.licencia_piloto = licencia_piloto;
    }

    public int getLicencia_piloto() {
        return licencia_piloto;
    }

    public void setLicencia_piloto(int licencia_piloto) {
        this.licencia_piloto = licencia_piloto;
    }

    @Override
    public void volar() {
        System.out.println("vuelo en un avion");
    }
}
