package Ejercicios_if;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num= entrada.nextInt();
        int num2= num%2;
        if (num2==0){
            System.out.println("El numero es par ");
        }
        else if (num2!=0){
            System.out.println("El numero es impar ");
        }

    }
}
