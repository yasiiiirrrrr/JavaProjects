package Conceptos_basicos;

import java.util.Scanner;

public class unidades_de_un_numero {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero=entrada.nextInt();
        System.out.println("\u001B[1mnumero "+numero+"\u001B[0m");
        int unidades= numero %10;
        System.out.println("Unidades"+unidades);

    }
}
