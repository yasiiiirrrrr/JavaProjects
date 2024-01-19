package ARRAYS.tanda3;

import java.util.Arrays;
import java.util.Scanner;

public class array8tanda3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte[] Arr = new byte[10];
        byte[] ArrPar = new byte[10]; // Para almacenar los elementos pares
        byte[] ArrImpar = new byte[10]; // Para almacenar los elementos impares
        int contadorPar = 0;
        int contadorImpar = 0;

        // Leer 10 números de tipo byte e introducirlos en el array
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Introduce un numero que desees almacenar en el array: ");
            byte numero = sc.nextByte();
            Arr[i] = numero;

            // Guardar en el array correspondiente (par o impar)
            if (numero % 2 == 0) {
                ArrPar[contadorPar] = numero;
                contadorPar++;
            } else {
                ArrImpar[contadorImpar] = numero;
                contadorImpar++;
            }
        }

        // Mostrar los arrays resultantes
        System.out.println("Array original: " + Arrays.toString(Arr));
        System.out.println("Array de elementos pares: " + Arrays.toString(Arrays.copyOf(ArrPar, contadorPar)));
        System.out.println("Array de elementos impares: " + Arrays.toString(Arrays.copyOf(ArrImpar, contadorImpar)));
    }
}