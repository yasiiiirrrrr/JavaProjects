package EjerciciosColecciones.EJ3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Huevos");
        list1.add("Pan");
        list1.add("Chocolate");
        list1.add("Agua");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Champu");
        list2.add("Gel");
        list2.add("Pasta de dientes");
        list2.add("Desodorante");


        System.out.println("Lista Supermercado: " + list1);
        System.out.println("Lista Drogueria: " + list2);

        System.out.println("Lista Completa: " + unirListas(list1, list2));


    }

    public static <T> ArrayList unirListas(ArrayList<T> list1, ArrayList<T> list2) {
        int size1 = list1.size();
        int size2 = list2.size();

        ArrayList<T> list = new ArrayList<>();

        for (int i = 0; i < size1; i++) {
            list.add(list1.get(i)); // Agregar elementos de list1 a list
        }
        for (int i = 0; i < size2; i++) {
            list.add(list2.get(i)); // Agregar elementos de list2 a list
        }
        return list;
    }
}
