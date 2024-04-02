package ARRAY_BIDIMENSIONALES;

import java.util.Arrays;
import java.util.Scanner;

//Crear una matriz de 5 filas y n columnas (usuario). Rellenarlo con numeros aleatorios entre 0 y 10
public class Bidimensionales_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de columnas que desees");
        int n = sc.nextInt(); // Pedimos un numero por teclado
        int Arr[][] = new int[5][n];  // Declaramos el array que rellenaremos con aleatorios, tendra 5 filas y las columnas que desee el usuario
        for (int i = 0; i < Arr.length; i++) {  // Recorrido de arrays bidimensionales
            for (int j = 0; j < Arr[i].length; j++) {
                Arr[i][j] = (int) (Math.random() * 11);// Generamos un numero aleatorio en las posiciones que va a ir generando Math.random}
            }

        }
        System.out.println(Arrays.deepToString(Arr)); // Imprimimos el array


        }


    }

