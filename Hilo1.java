package hilos1;
class Hilo1 extends Thread {
        String nombre;

        public Hilo1(String nombre) {
            this.nombre = nombre;
        }

        public void run() {
                 System.out.println("Hola desde " + nombre);

            }

 }