package Ejercicios_de_Repaso;
import java.util.Scanner;
public class Ej5 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int numero1=entrada.nextInt();
        int numero2=entrada.nextInt();
        System.out.println("\u001B[1mnumero "+numero1+"\u001B[0m");
        System.out.println("\u001B[1mnumero "+numero2+"\u001B[0m");
        int unidades1= numero1 %10;
        int decenas1= (numero1/10) %10;
        int unidades2= numero2 %10;
        int decenas2= (numero2/10) %10;


        System.out.printf("Unidades =%d          ", unidades1);
        System.out.printf("Decenas =%d\n", decenas1);
        System.out.printf("Unidades =%d          ", unidades2);
        System.out.printf("Decenas =%d ", decenas2);

        if (numero1<10){
            System.out.println("\n\u001B[1mEL primer numero es menor que 10\u001B[0m");

        }
        if (numero2<10) {
            System.out.println("\n\u001B[1mEL segundo numero es menor que 10\u001B[0m");

        }
    }

}
