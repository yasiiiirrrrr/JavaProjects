package EjFutbol;

import java.util.Comparator;

public class comparadorNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;
        return f1.getNombre().compareTo(f2.getNombre());
    }
}
