import java.lang.module.FindException;
import java.util.TreeSet;
public class HiloLector extends Thread {
    final Buzon buzon;

    public HiloLector(Buzon buzon){
        this.buzon = buzon;
    }

    @Override
    public void run() {
        buzon.leer();

    }
}
