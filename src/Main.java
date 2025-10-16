public class Main {
    public static void main(String[] args) {

        Buzon buzon = new Buzon();

        HiloEscritor escritor = new HiloEscritor(buzon,"Hola");
        HiloEscritor escritor1 = new HiloEscritor(buzon, "Adiossss");
        HiloLector lector = new HiloLector(buzon);
        HiloLector lector1 = new HiloLector(buzon);
        HiloLector lector2 = new HiloLector(buzon);

        escritor.start();  lector.start(); lector2.start(); escritor1.start(); lector1.start();


    }
}
