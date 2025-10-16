public class Main {
    public static void main(String[] args) {

        Buzon buzon = new Buzon();

        HiloEscritor escritor = new HiloEscritor(buzon,"Hola holita vecinito");
        escritor.run();
    }
}
