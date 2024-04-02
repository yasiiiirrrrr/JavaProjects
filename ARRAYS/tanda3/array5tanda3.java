package ARRAYS.tanda3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class array5tanda3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];            // Declaramos un array llamado A
        for (int i=0; i<A.length;i++){      // Bucle for para ir añadiendo numeros al array
            System.out.print("Introduce un numero para la tabla A: ");
            int numeroA=sc.nextInt();        // Pedimos por teclado
            A[i]=numeroA;                    // Almacenamos en las posiciones i los numeros introducidos
        }
        System.out.println("=======================================================");
        int B[]=new int[10];        // Declaramos un array llamado B
        for (int i=0; i<B.length;i++){  // Bucle for para ir añadiendo numeros al array
            System.out.print("Introduce un numero para la tabla B: ");
            int numeroB=sc.nextInt(); // Pedimos por teclado
            B[i]=numeroB;           // Almacenamos en las posiciones i los numeros introducidos
        }
        System.out.println("La primera tabla contiene "+ Arrays.toString(A)); // Imprimimos el array A
        System.out.println("La segunda tabla contiene "+Arrays.toString(B));  // Imprimimos el array B
        int C[]=new int[20];      // Declaramos un array llamado C
        int j=0;                  // Inicializamos un indice j en 0
        for (int i=0; i<A.length;i++){ // Bucle for para ir añadiendo numeros al array C
            C[j++]=A[i];                // Almacenamos A[0] en C[0]
            C[j++]=B[i];                // Almacenamos B[0] en C[1]
                                        // A[1] en C[2]...
                                        // B[1] en C[3] ...

        }
        System.out.println("El array combinado es: "+Arrays.toString(C)); // Imprimimos el array C

    }
}
