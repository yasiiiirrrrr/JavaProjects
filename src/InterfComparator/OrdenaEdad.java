package Tema_07.Ejemplos.InterfComparator;

import java.util.Comparator;

public class OrdenaEdad implements Comparator {

    @Override
    public int compare(Object obj01, Object obj02) {
        return ((Futbolista)obj01).getAge()-((Futbolista)obj02).getAge();
    }
}
