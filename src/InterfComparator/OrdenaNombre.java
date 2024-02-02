package Tema_07.Ejemplos.InterfComparator;

import java.util.Comparator;

public class OrdenaNombre implements Comparator {

    @Override
    public int compare(Object obj01, Object obj02) {
        return ((Futbolista)obj01).getName().compareTo(((Futbolista)obj02).getName());
    }
}
