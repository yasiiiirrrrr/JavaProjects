package ARRAY_BIDIMENSIONALES;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz: ");
        int n=sc.nextInt();
        int array[][]=new int[n][n]; // Creamos un array temporal para almacenar
        int arrayn[][]=new int[n][n]; // Este es el array que imprimiremos al final

        for(int i=0; i< array.length; i++){ // Bucles for para recorrer el array bidimensional
            for (int j=0; j<array[0].length;j++){
                System.out.print("Introduce un numero: ");
                int numero=sc.nextInt();    // Pedimos por consola los numeros para almacenar
                array[i][j]=numero; // Almacenamos numero en el primer array
                arrayn[i][j]=array[i][j]; // Almacenamos el numero en el segundo array
            }
        }
        System.out.println("Este es tu array: ");
        imprimirUnaMatriz(arrayn);  // Imprimimos el array
        multiplicarMatriz(arrayn);  // Imprimimos el array multiplicado

    }
    public static void imprimirUnaMatriz(int[][]matriz){    // Funcion para poder imprimir la matriz
        for (int i=0;i<matriz.length;i++){  // Creamos un bucle for para leer el array
            for (int j=0;j<matriz[0].length;j++){   // Seguimos leyendo el array
                System.out.print(matriz[i][j]+"\t");// Imprimimos el array
            }
            System.out.print("\n"); // Salto de linea para que quede con forma de matriz el array
        }

    }
    public static int multiplicarMatriz(int[][] matriz) { // Funcion para multiplicar todos los valores de una matriz
        int resultado = 1;  // Inicializamos el resultado en cero

        for (int i = 0; i < matriz.length; i++) {  // Bucle for para leer el array
            for (int j = 0; j < matriz[i].length; j++) {
                resultado *= matriz[i][j]; // multiplicamos cada numero por el anterior
            }
        }
        System.out.println(resultado); // Imprimimos el resultado de la multiplicacion
        return resultado; // Devolvemos el resultado
    }
}
