package EjFutbol;

import java.util.Comparator;

public class comparadorGoles implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;
        if (f1.getNumeroGoles()== f2.getNumeroGoles()) return f1.getDNI().compareTo(f2.getDNI());
        else return f1.getNumeroGoles()-f2.getNumeroGoles();
    }
}
