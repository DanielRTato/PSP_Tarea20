public class Buzon {
    String mensaje;
    boolean isEmpty;

    public synchronized void escribir(String mensaje) {
        while (isEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.mensaje = mensaje;
        isEmpty = true;
        System.out.println("Escritor: " + mensaje);
        notifyAll();
    }

    public synchronized String leer () {
        while(!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Lector: " + mensaje);
        isEmpty = true;
        notifyAll();
        return mensaje;
    }

}
