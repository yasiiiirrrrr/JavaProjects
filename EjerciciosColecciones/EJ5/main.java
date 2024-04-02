package EjerciciosColecciones.EJ5;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static int indiceActual = 0;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> list = new ArrayList<>();
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
            return;
        } else if (indiceActual == list.size()) {
            indiceActual = 0;
        }
        System.out.println("Siguiente número: " + list.get(indiceActual++));
    }

    public static void mostrarAnterior(ArrayList<Float> list) {
        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        } else if (indiceActual == 0) {
            indiceActual = list.size();
        }
        System.out.println("Siguiente número: " + list.get(--indiceActual));
    }

    public static void añadirElemento(ArrayList<Float> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduca el elemento que desea añadir: ");
        Float elemento = sc.nextFloat();
        list.add(elemento);
        System.out.println("Elemento agregado con exito!");
    }

    public static void eliminarUltimoMostrado(ArrayList<Float> list) {
        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        list.remove(--indiceActual);
        System.out.println("Ultimo elemento elimidado con exito!.");
    }

    public static void sustituirUltimoMostrado(ArrayList<Float> list) {
        Scanner sc = new Scanner(System.in);

        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("Introduce el numero que deseas qu remplaze al ultimo elemento mostrado:");
        Float elemento = sc.nextFloat();
        list.set(--indiceActual, elemento);
        System.out.println("Ultimo elemento sustituido con exito!.");
    }
}

