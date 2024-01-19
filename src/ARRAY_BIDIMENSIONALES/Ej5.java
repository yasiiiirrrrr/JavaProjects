package ARRAY_BIDIMENSIONALES;
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de filas: ");
        int filas=sc.nextInt();
        System.out.println("Introduce el numero de columnas: ");
        int columnas=sc.nextInt();
        int array[][] = new int[filas][columnas]; // Creamos un array para almacenar
        for (int i = 0; i <filas; i++) { // Bucles for para recorrer el array bidimensional
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce un numero: ");
                int numero = sc.nextInt();    // Pedimos por consola los numeros para almacenar
                array[i][j] = numero; // Almacenamos numero en el primer array
            }
        }
        System.out.println("Este es tu array: ");
        imprimirUnaMatriz(array);  // Imprimimos el array
    }
    public static void imprimirUnaMatriz(int[][] matriz) {     // Funcion para poder imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {  // Creamos un bucle for para leer el array
            for (int j = 0; j < matriz[0].length; j++) {   // Seguimos leyendo el array
                System.out.print(matriz[i][j] + "\t");// Imprimimos el array
            }
            System.out.print("\n"); // Salto de linea para que quede con forma de matriz el array
        }

    }
}
