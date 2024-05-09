package clases;

public class Persona {
    private String nombre;
    Vehiculo vehiculo;

    public Persona(String nombre, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }
    public void viajar(){
        System.out.println("La persona esta viajando en un vehiculo");
        vehiculo.mover();
    }
}
