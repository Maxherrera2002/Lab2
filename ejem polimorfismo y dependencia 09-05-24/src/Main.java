import clases.Automovil;
import clases.Bicicleta;
import clases.Persona;
import clases.Vehiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo=new Vehiculo();
        Automovil automovil=new Automovil();
        Bicicleta bicicleta=new Bicicleta();

        Persona persona1=new Persona("Pepe", vehiculo);
        Persona persona2=new Persona("Juli", automovil);
        Persona persona3=new Persona("Isi", bicicleta);

        persona1.viajar();
        persona2.viajar();
        persona3.viajar();
        


    }
}