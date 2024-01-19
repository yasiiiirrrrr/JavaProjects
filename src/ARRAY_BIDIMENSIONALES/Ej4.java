package ARRAY_BIDIMENSIONALES;
//Realiza una función que reciba una matriz cuadrada y devuelva la suma de cada fila y de cada columna.

import java.util.Scanner;

public class Ej4 {
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
    }
    public static void imprimirUnaMatriz(int[][]matriz){    // Funcion para poder imprimir la matriz
        for (int i=0;i<matriz.length;i++){  // Creamos un bucle for para leer el array
            for (int j=0;j<matriz[0].length;j++){   // Seguimos leyendo el array
                System.out.print(matriz[i][j]+"\t");// Imprimimos el array
            }
            System.out.print("\n"); // Salto de linea para que quede con forma de matriz el array
        }

    }
    public static int[][] añadirFilas(int array[][]){

        return array;
    }
    public static int sumaFilas(int array[][]){
        int sumaFila=0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                sumaFila=sumaFila+array[i][j];
            }
        }

        return sumaFila;
    }
}
