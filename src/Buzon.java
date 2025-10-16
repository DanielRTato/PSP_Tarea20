public class Buzon {
    String mensaje;
    boolean isEmpty = true;

    public synchronized void escribir(String mensaje) {
        while (!isEmpty){
            try {
                wait();
                System.out.println("Escritor: Estoy esperando");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.mensaje = mensaje;
        isEmpty = false;
        System.out.println("Escritor: " + mensaje);
        notifyAll();
    }

    public synchronized String leer () {
        while(isEmpty) {
            try {
                wait();
                System.out.println("Lector: Estoy esperando");
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
