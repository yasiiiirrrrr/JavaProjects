package Conceptos_basicos;

import java.util.Scanner;

public class decenas_de_un_numero {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero=entrada.nextInt();
        System.out.println("numero "+numero);
        int decenas= (numero/10) %10;
        System.out.println("Decenas"+decenas);
    }
}
