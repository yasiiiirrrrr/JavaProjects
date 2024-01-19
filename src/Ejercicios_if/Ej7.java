package Ejercicios_if;
import java.util.Scanner;
public class Ej7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int año= entrada.nextInt();

        if((año/4)==0||((año/100)==0)==false){
            System.out.println("Es bisiesto");

        }

    }
}
