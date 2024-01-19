package ARRAY_BIDIMENSIONALES;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz: ");
        int n=sc.nextInt();
        int array[][]=new int[n][n];
        int arrayn[][]=new int[n][n];
        for(int i=0; i< array.length; i++){
            for (int j=0; j<array[0].length;j++){
                System.out.print("Introduce un numero: ");
                int numero=sc.nextInt();
                array[i][j]=numero;
                arrayn[i][j]=array[i][j];
            }
        }
        System.out.println("Este es tu array: ");
        imprimirUnaMatriz(arrayn);
        System.out.println("Este es tu array invertido: ");
        imprimirUnaMatriz(invertirMatriz(array));
    }
    public static void imprimirUnaMatriz(int[][]matriz){    // Funcion para poder imprimir la matriz
        for (int i=0;i<matriz.length;i++){  // Creamos un bucle for para leer el array
            for (int j=0;j<matriz[0].length;j++){   // Seguimos leyendo el array
                System.out.print(matriz[i][j]+"\t");// Imprimimos el array
            }
            System.out.print("\n"); // Salto de linea para que quede con forma de matriz el array
        }

    }
    public static int [][] invertirMatriz(int array[][]){
        int arrayn[][]=new int[array.length][array[0].length];
        for(int i=0; i< array.length;i++){
            for (int j=0; j< array.length; j++){
                arrayn[j][i]=array[i][j];
            }
        }
        return arrayn;
    }
}
