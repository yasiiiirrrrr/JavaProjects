package ARRAYS.Listas;
import java.util.Scanner;

public class Listas1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la lista: ");
        int lista[]={1,2,4,5,6,9,15};
        System.out.println("Introduce la posicion de la lista que quieres eliminar: ");
        int posicion=sc.nextInt();
        int opcion=0;
        while(true){
            imprimirMenu(opcion);
            if(opcion==1){
                insertarElemento(lista,4);
            }
            else if (opcion==2){
                imprimirLista(lista);
            }
            else if (opcion==3){
                eliminarElemento(lista,posicion);
            }
            else if (opcion==4){
                break;
            }
        }
    }
    public static int imprimirMenu(int opcion){
        Scanner sc= new Scanner(System.in);
        System.out.println("\n⎡---------------------------------⎤");
        System.out.println("|           Menú Principal        |");
        System.out.println("|---------------------------------|");
        System.out.println("|    1. Insertar elemento         |");
        System.out.println("|    2. Eliminar elemento         |");
        System.out.println("|    3. Ver lista                 |");
        System.out.println("|    4. Salir                     |");
        System.out.println("⎣_________________________________⎦");
        System.out.print("\n     Seleccione una opción (1-5): ");
        opcion = sc.nextInt();
        return opcion;
    }

    public static int[] insertarElemento(int array[], int valor) {    // Función para insertar un entero dentro de un array de enteros
        Scanner sc = new Scanner(System.in); // Inicializamos un objeto Scanner para entrada de datos
        int longitud = array.length; // Obtenemos la longitud del array original
        int[] newArray = new int[longitud + 1]; // Creamos un nuevo array con una longitud mayor

        int i;
        // Copiamos los elementos del array original al nuevo array hasta encontrar la posición de inserción
        for (i = 0; i < longitud && array[i] < valor; i++) {
            newArray[i] = array[i];
        }

        newArray[i] = valor; // Insertamos el nuevo valor en la posición adecuada

        // Copiamos los elementos restantes del array original al nuevo array
        for (int j = i + 1; j <= longitud; j++) {
            newArray[j] = array[j - 1];
        }

        return newArray; // Retornamos el nuevo array con el valor insertado
    }

    // Función para eliminar un elemento en una posición dada de un array de enteros
    public static int[] eliminarElemento(int array[], int posicion) {
        int longitud = array.length;
        int[] newArray = new int[longitud - 1]; // Creamos un nuevo array con una longitud menor

        // Copiamos los elementos del array original al nuevo array hasta la posición de eliminación
        for (int i = 0; i < posicion; i++) {
            newArray[i] = array[i];
        }

        // Ignoramos el elemento en la posición de eliminación y continuamos copiando los elementos restantes
        for (int i = posicion + 1; i < longitud; i++) {
            newArray[i - 1] = array[i];
        }

        return newArray; // Retornamos el nuevo array sin el elemento eliminado
    }

    public static void imprimirLista(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}