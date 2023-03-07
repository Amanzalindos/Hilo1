package hilos1;
class Hilo2 extends Thread {
        String nombre;

        public Hilo2(String nombre) {
            this.nombre = nombre;
        }

        public void run() {

              System.out.println("Hola desde " + nombre + "\nVoy a hacer un conteo uwu");
                           for (int i = 1; i <= 10; i++) {
                    System.out.println("Contando: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Conteo finalizado.");
            }

       }