package hilos1;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

   public class Pista extends Thread {
        String Name;

        public Pista(String Name) {
            this.Name = Name;
        }

        public void run() {
            try {
                File archivoSonido = new File("C:\\Users\\User\\Desktop\\Universidad\\Cuarto semestre\\Tecnologias para aplicaciones moviles\\Potencia\\src\\Hilos1\\Mondongo2.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(archivoSonido));
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }