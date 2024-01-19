package Ejercicios_if;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double num= entrada.nextDouble();
        double num2= entrada.nextDouble();
        double division= num/num2;
        System.out.println(division);
        if(division==0){
            System.out.printf("Value %.2f ERROR", division);
        }
    }
}

