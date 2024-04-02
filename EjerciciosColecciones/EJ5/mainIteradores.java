package EjerciciosColecciones.EJ5;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class mainIteradores {
    static ArrayList<Float> list = new ArrayList<>();
    static ListIterator<Float> iterador;

    public static void main(String[] args) {
        iterador = list.listIterator();
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Mostrar la lista");
            System.out.println("2. Mostrar siguiente");
            System.out.println("3. Mostrar anterior");
            System.out.println("4. Añadir elemento");
            System.out.println("5. Eliminar el último mostrado");
            System.out.println("6. Sustituir el último mostrado");
            System.out.println("7. Salir");
            int opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    System.out.println(list);
                    break;
                case 2:
                    mostrarSiguiente(list);
                    break;
                case 3:
                    mostrarAnterior(list);
                    break;
                case 4:
                    añadirElemento(list);
                    break;
                case 5:
                    eliminarUltimoMostrado(list);
                    break;
                case 6:
                    sustituirUltimoMostrado(list);
                    break;
                case 7:
                    return;
            }
        }
    }

    public static void mostrarSiguiente(ArrayList<Float> list) {
        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else if (iterador.hasNext()) {
            Float elemento = iterador.next();
            System.out.println("Siguiente número: " + elemento);
        } else {
            iterador = list.listIterator();
            Float primerElemento = iterador.next();
            System.out.println("Siguiente numero: " + primerElemento);
        }

    }


    public static void mostrarAnterior(ArrayList<Float> list) {
        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        if (iterador.hasPrevious()) {
            Float elemento = iterador.previous();
            System.out.println("Numero anterior: " + elemento);
        } else {
            iterador = list.listIterator(list.size());
            Float ultimoElemento = iterador.previous();
            System.out.println("Numero anterior: " + ultimoElemento);

        }

    }

    public static void añadirElemento(ArrayList<Float> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduca el elemento que desea añadir: ");
        Float elemento = sc.nextFloat();
        iterador.add(elemento);
        System.out.println("Elemento agregado con exito!");
    }

    public static void eliminarUltimoMostrado(ArrayList<Float> list) {
        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Float elementoEliminado = iterador.previous();
        iterador.remove();
        System.out.println("Ultimo elemento " + elementoEliminado + " elimidado con exito!.");
    }

    public static void sustituirUltimoMostrado(ArrayList<Float> list) {
        Scanner sc = new Scanner(System.in);

        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("Introduce el numero que deseas qu remplaze al ultimo elemento mostrado:");
        Float elemento = sc.nextFloat();
        int ultimoElementoIndice = iterador.previousIndex();
        list.set(ultimoElementoIndice, elemento);
        System.out.println("Ultimo elemento sustituido con exito!.");
    }
}
