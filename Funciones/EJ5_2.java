package Funciones;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EJ5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("MENU");
            System.out.println("1.COMPROBAR SI ES PRIMO");
            System.out.println("2.RECIBIR NUMEROS PRIMOS");
            System.out.println("3.SALIR");
            int opciones = sc.nextInt();
            if (opciones == 1) {
                System.out.println("Introduce un numero para comprobar si es primo: ");
                int numero = sc.nextInt();
                if (esPrimo(numero)) {
                    System.out.println("\u001B[32mES PRIMO \u2713\u001B[0m");
                } else {
                    System.out.println("\u001B[31mNO ES PRIMO \u2717\u001B[0m");
                }
            } else if (opciones == 2) {
                System.out.println("Introduce un numero de primos que deseas: ");
                int numeroDePrimos = sc.nextInt();
                imprimirPrimos(numeroDePrimos);
                System.out.println(numeroDePrimos);

            } else if (opciones == 3) {
                System.out.println("Saliendo...");
                break;
            }
        }
    }

    public static boolean esPrimo(int numero) {
        int indice = 2;
        while (indice < numero) {
            if (numero % indice == 0) {
                return false;
            }
            indice++;
        }
        return true;
    }

    public static boolean imprimirPrimos(int numero) {
        Scanner sc = new Scanner(System.in);
        int numerodeP = sc.nextInt();
        for (int i = 2; i < numerodeP; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return false;
    }
}
