public class Main {
    public static void main(String[] args) {

        Buzon buzon = new Buzon();

        HiloEscritor escritor = new HiloEscritor(buzon,"Hola");
        HiloEscritor escritor1 = new HiloEscritor(buzon, "Adiossss");
        HiloLector lector = new HiloLector(buzon);
        HiloLector lector1 = new HiloLector(buzon);
        HiloLector lector2 = new HiloLector(buzon);
        HiloLector lector3 = new HiloLector(buzon);
        HiloEscritor escritorEspera = new HiloEscritor(buzon, "Esperando a escribir el mensaje");

        escritor.start(); escritorEspera.start(); lector.start(); lector2.start(); escritor1.start(); lector1.start(); lector3.start();
        try {
            escritor.join(); escritor1.join(); lector.join(); lector1.join(); lector2.join();lector3.join(); escritorEspera.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
