package Tema_07.Ejemplos.InterfComparator;

import java.util.Comparator;

public class OrdenaEdadNombre implements Comparator {

    @Override
    public int compare(Object obj01, Object obj02) {
        if (((Futbolista)obj01).getAge() == ((Futbolista)obj02).getAge()) {
            return ((Futbolista)obj01).getName().compareTo(((Futbolista)obj02).getName());
        } else return ((Futbolista)obj01).getAge()-((Futbolista)obj02).getAge();
    }
}
