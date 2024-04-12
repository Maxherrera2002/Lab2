package clases;
import java.util.Random;
import java.util.concurrent.Semaphore;
public class Filosofo implements Runnable {
    private Semaphore[] tenedores;
    private int id;
    private Random rnd = new Random();

    public Filosofo(int id, Semaphore[] tenedores) {
        this.id = id;
        this.tenedores = tenedores;
    }

    private void comer() throws InterruptedException {
        // Intenta adquirir los tenedores
        tenedores[id].acquire();
        tenedores[(id + 1) % tenedores.length].acquire();

        // Come
        System.out.println("Filosofo " + id + " comiendo");

        // Libera los tenedores
        tenedores[id].release();
        tenedores[(id + 1) % tenedores.length].release();

        // Espera un tiempo aleatorio
        Thread.sleep(rnd.nextInt(4000) + 1000);
    }
    private void pensar() throws InterruptedException {
        // Piensa
        System.out.println("El filosofo " + id + " está pensando");

        // Espera un tiempo aleatorio
        Thread.sleep(rnd.nextInt(4000) + 1000);
    }
    @Override
    public void run() {
        while (true) {
            try {
                comer();
                pensar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
