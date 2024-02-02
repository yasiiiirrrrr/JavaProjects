package Tema_07.Ejemplos.InterfComparator;

import java.util.Arrays;

public class MainFutbolista {
    public static void main(String[] args) {
        //Creamos el array con los distintos elementos (futbolistas)
        Futbolista[] liga = new Futbolista[5];

        liga[0] = new Futbolista("64857362J", "Ana", (byte)25, (byte)50);
        liga[1] = new Futbolista("85736214B", "Juan", (byte)25, (byte)10);
        liga[2] = new Futbolista("95435643H", "Yasir", (byte)18, (byte)75);
        liga[3] = new Futbolista("35886746F", "Mari", (byte)27, (byte)100);
        liga[4] = new Futbolista("25376486D", "Dani", (byte)34, (byte)25);

        //Creamos los distintos comparadores correspondientes a las interfaces del "Comparator"
        OrdenaEdadNombre edadNombre = new OrdenaEdadNombre();
        OrdenaEdad edad = new OrdenaEdad();
        OrdenaNombre nombre = new OrdenaNombre();

        //Primero ordenamos e imprimimos usando el "Comparable" de la clase "Futbolista"
        Arrays.sort(liga);
        System.out.println("Jugadores ordenados por DNI:\n" + Arrays.toString(liga));

        //Luego ordenamos e imprimimos usando los distintos comparadores que hemos creado
        Arrays.sort(liga, edadNombre);
        System.out.println("Jugadores ordenados por edad y nombre:\n" + Arrays.toString(liga));

        Arrays.sort(liga, edad);
        System.out.println("Jugadores ordenados por edad" + Arrays.toString(liga));

        Arrays.sort(liga, nombre);
        System.out.println("Jugadores ordenados por nombre:\n" + Arrays.toString(liga));
    }
}
