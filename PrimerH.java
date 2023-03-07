package hilos1;

/*Primer hilo*/

class PrimerH extends Thread {
        String Nombre;

        public PrimerH(String nombre) {
            this.Nombre = nombre;
        }

        public void run() {
                 System.out.println("Desde: " + Nombre);

            }

 }