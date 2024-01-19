package Ejercicios_if;
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num= entrada.nextInt();
        int num2= entrada.nextInt();
        if(num>num2){
            System.out.println(num+" es mayor que "+num2);
        }
        else if(num2>num){
            System.out.println(num2+" es mayor que "+num);
        }
        else if(num2==num){
            System.out.println(num2+" es igual que "+num);
        }

        }
    }

