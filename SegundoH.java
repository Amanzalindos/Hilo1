package hilos1;

/*Segundo hilo*/

class SegundoH extends Thread {
        String Nombre;

        public SegundoH(String nombre) {
            this.Nombre = nombre;
        }

        public void run() {

              System.out.println("Desde: " + Nombre + "\n");
                           for (int i = 1; i <= 10; i++) {
                    System.out.println("Cuenta: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Terminado.");
            }

       }