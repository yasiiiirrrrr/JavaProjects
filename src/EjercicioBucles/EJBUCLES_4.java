package EjercicioBucles;

import java.util.Scanner;

public class EJBUCLES_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Por favor, ingrese un número entre 0 y 10: ");
            numero = entrada.nextInt();
        } while (numero < 0 || numero > 10);

        System.out.println("Tabla de multiplicar del número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
