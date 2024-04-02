package EjerciciosColecciones.EJ2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        //  Creamos una lista
        ArrayList<Double> list = new ArrayList<>();

        //Añadimos elementos a la lista
        list.add(2.1);
        list.add(3.0);
        list.add(4.4);
        list.add(5.5);
        list.add(6.6);

        //Imprimimos la lista
        System.out.println("Lista original: " + list);
        invertirLista(list);
        System.out.println("Lista invertida: " + list);

    }

    public static <T> void invertirLista(ArrayList<T> list) {
        int size = list.size();  //Almacenamos el tamaño de la lista en la variable
        for (int i = 0; i < size / 2; i++) { //Recorremos la lista hasta la mitad. Abajo explicacion.
            T temp = list.get(i);           //Almacenamos en una variable temporal el elemento i para no perderlo despues del cambio.
            list.set(i, list.get(size - i - 1)); //Cambiamos el elemento i por 5(size)-0(i)-(1).i(0)=i(4)
            list.set(size - i - 1, temp);        //Hacemos el proceso inverso i(4)=i(0)
        }
    }
}


//Recorremos la lista hata la mitad, para ir cambiado cada elemento con su simetrico
//1.-[1][2][3][4][5]
//2.-[5][2][3][4][1]
//3.-[5][4][3][2][1]
//Listo