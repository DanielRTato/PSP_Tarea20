public class HiloEscritor extends Thread{
    final Buzon buzon;
    String mensaje;

    public HiloEscritor(Buzon buzon, String mensaje) {
        this.buzon = buzon;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        buzon.escribir(mensaje);
    }
}

