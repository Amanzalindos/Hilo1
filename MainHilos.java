package hilos1;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MainHilos {

    public static void main(String[] args) {

        // Crear los tres hilos
        Thread hilo1 = new Hilo1("Hilo 1");
        Thread hilo2 = new Hilo2("Hilo 2");
        Thread hilo3 = new HiloCancion("Hilo de la canción");

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}