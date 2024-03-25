package Clases;
import java.util.ArrayList;
public class Avion {
    private int numero_matricula;

    public Avion() {
    }

    public Avion(int numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    public int getNumero_matricula() {
        return numero_matricula;
    }

    public void setNumero_matricula(int numero_matricula) {
        this.numero_matricula = numero_matricula;
    }
}
