package ARRAY_BIDIMENSIONALES;
//Realiza una función recursiva que reciba un array y devuelva otro array con sus
//elementos invertidos. Por ejemplo, si recibe {1, 2, 3}, devuelve {3, 2, 1}.

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int array[][]=new int[3][3]; // Creamos un array para almacenar
        for(int i=0; i< array.length; i++){ // Bucles for para recorrer el array bidimensional
            for (int j=0; j<array[0].length;j++){
                System.out.print("Introduce un numero: ");
                int numero=sc.nextInt();    // Pedimos por consola los numeros para almacenar
                array[i][j]=numero; // Almacenamos numero en el primer array
            }
        }
        System.out.println("Este es tu array: ");
        imprimirUnaMatriz(array);  // Imprimimos el array
        System.out.println("Este es el array invertido: ");
        imprimirUnaMatriz(invertirArray(array));
    }
    public static void imprimirUnaMatriz(int[][]matriz){    // Funcion para poder imprimir la matriz
        for (int i=0;i<matriz.length;i++){  // Creamos un bucle for para leer el array
            for (int j=0;j<matriz[0].length;j++){   // Seguimos leyendo el array
                System.out.print(matriz[i][j]+"\t");// Imprimimos el array
            }
            System.out.print("\n"); // Salto de linea para que quede con forma de matriz el array
        }

    }
    public static int[][] invertirArray(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
             array[i][j]=array[j][i];
            }
        }
        return invertirArray(array);
    }
}
