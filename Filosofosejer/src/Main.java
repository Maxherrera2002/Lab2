import clases.Filosofo;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        int numFilosofos = 5;
        Semaphore[] tenedores = new Semaphore[numFilosofos];
        Thread[] filosofos = new Thread[numFilosofos];

        // Inicializa los semáforos
        for (int i = 0; i < numFilosofos; i++) {
            tenedores[i] = new Semaphore(1);
        }

        // Crea e inicia los threads de los filósofos
        for (int i = 0; i < numFilosofos; i++) {
            filosofos[i] = new Thread(new Filosofo(i, tenedores));
            filosofos[i].start();
        }
    }
}