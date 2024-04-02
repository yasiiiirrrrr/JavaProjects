package EjerciciosColecciones.EJ4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        menu();
    }

    public static <T> void menu() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("1. Nueva lista");
            System.out.println("2. Número de cadenas");
            System.out.println("3. Añadir cadena");
            System.out.println("4. Eliminar cadena");
            System.out.println("5. Contiene cadena");
            System.out.println("6. Mostrar lista entera");
            System.out.println("7. Salir");
            int opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    list.clear();
                    break;
                case 2:
                    System.out.println(list.size());
                    break;
                case 3:
                    añadirElemento(list);
                    break;
                case 4:
                    eliminarElemento(list);
                    break;
                case 5:
                    contieneElemento(list);
                    break;
                case 6:
                    System.out.println(list);
                    break;
                case 7:
                    return;
            }
        }
    }

    public static void añadirElemento(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduca el elemento que desea añadir: ");
        String elemento = sc.nextLine();
        list.add(elemento);
        System.out.println("Elemento agregado con exito!");
    }

    public static void eliminarElemento(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduca la posicion del elemento que desea eliminar: ");
        int posicion = sc.nextInt();
        list.remove(posicion);
        System.out.println("Elemento eliminado con exito!");
    }

    public static void contieneElemento(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduca el elemento que desea buscar: ");
        String elemento = sc.nextLine();
        if (list.contains(elemento)) System.out.println(elemento + " ha sido encontrado con exito");
        else System.out.println("No se ha encontrado " + elemento);

    }
}
