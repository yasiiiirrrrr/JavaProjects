package Ejercicios_de_Repaso;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero=entrada.nextInt();
        System.out.println("\u001B[1mnumero "+numero+"\u001B[0m");
        int unidades= numero %10;
        int decenas= (numero/10) %10;


        System.out.printf("\u001B[43m\u001B[30mUnidades = %d\u001B[0m          ", unidades);
        System.out.printf("\u001B[33mDecenas = %d \u001B[0m", decenas);
    }
}
