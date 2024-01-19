package ARRAY_BIDIMENSIONALES;

import java.util.Arrays;

public class Bidimensionales_2 {
    public static void main(String[] args) {
        int [][] matriz={   // Creamos una matriz
                {4,3,15},
                {6,4,2},
                {1,2,3}};
        System.out.println("Esta es la matriz original:");
        imprimirUnaMatriz(matriz);  // Imprimimos la matriz
        System.out.println("Esta es la matriz inversa:");
        imprimirUnaMatriz(mTranspuesta(matriz)); // Imprimimos la matriz traspuesta
        System.out.println("Diagonal directa:\n "+ Arrays.toString(diagonalDirecta(matriz)));   // Imprimimos la diagonal directa de la matriz
        System.out.println("Diagonal inversa:\n "+ Arrays.toString(diagonalInversa(matriz)));   // Imprimimos la diagonal inversa de la matriz
        System.out.println("Suma de todas las filas: ");
        imprimirUnaMatriz(matrizSumada(matriz));
    }

    public static void imprimirUnaMatriz(int[][]matriz){    // Funcion para poder imprimir la matriz
        for (int i=0;i<matriz.length;i++){  // Creamos un bucle for para leer el array
            for (int j=0;j<matriz[0].length;j++){   // Seguimos leyendo el array
                System.out.print(matriz[i][j]+"\t");// Imprimimos el array
            }
            System.out.print("\n"); // Salto de linea para que quede con forma de matriz el array
        }

    }

    public static int[][] mTranspuesta(int[][]matriz){  // Funcion para hacer la traspuesta de la matriz(Cambiar filas con columnas)
        int [][] transpuesta=new int[matriz.length][matriz.length]; // Creamos el array de la traspuesta
        for (int i=0;i<matriz.length;i++){  // Bucle for para leer el array
            for (int j=0;j<matriz[0].length;j++){ // Segundo bu8cle for para leer las filas
                transpuesta[j][i]=matriz[i][j]; // Cambiamos filas por columnas siendo Filas(i) y Columnas(j)
            }
        }
        return transpuesta;
    }

    public static int[] diagonalDirecta(int[][]matriz){     //Funcion para sacar la diagonal directa
        int[] diagonalDirecta=new int[matriz.length];       // Creamos un array para almacenar la diagonal del array
        for (int i=0;i< matriz.length;i++){                 // Bucle for para leer el array
            diagonalDirecta[i]=matriz[i][i];                // Almacenamos los numeros de la diagonal en el array de la diagonal
        }
        return diagonalDirecta;
    }

    public static int[] diagonalInversa(int[][]matriz){     //Funcion para sacar la diagonal inversa
        int[] diagonalInversa=new int[matriz.length];       // Creamos un array para almacenar la diagonal inversa del array
        for (int i=0,j= matriz.length-1;i< matriz.length;i++,j--){  // Bucle for para leer el array(hacemos cuenta regresiva y sa)
            diagonalInversa[i]=matriz[i][j];            // Almacenamos los numeros de la diagonal en el array de la diagonal

        }
        return diagonalInversa;
    }
    public static int[][]añadeFila(int[][]matriz){
        int[][]filaAñadida=new int[matriz.length+1][matriz.length+1];
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                filaAñadida[i][j]=matriz[i][j];
            }
        }
        return filaAñadida;

    }
    public static int sumarFila(int[][]matriz, int fila){
        int [][] matrizSumada=new int[matriz.length+1][matriz.length+1];
        int suma=0;
        for (int i=0; i<matriz.length; i++){
            suma+=matriz[fila][i];
        }
        return suma;
    }
    public static int sumarColumnas(int[][]matriz, int columna){
        int [][] matrizSumada=new int[matriz.length+1][matriz.length+1];
        int suma=0;
        int numero;
        for (int i=0; i<matriz.length; i++){
            suma+=matriz[i][columna];
        }
        return suma;
    }
    public static int[][] matrizSumada(int[][]matriz){
        int [][] mSumas= añadeFila(matriz);
        for (int i=0; i<matriz.length;i++){
            mSumas[i][matriz.length]=sumarFila(matriz,i);
            mSumas[matriz.length][i]=sumarColumnas(matriz,i);
        }
        mSumas[matriz.length][matriz.length]=sumarFila(mSumas,matriz.length);
        return mSumas;
    }
}
