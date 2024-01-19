package Programacion;
import javax.swing.*;
import java.util.Scanner;
//cuantos numeros son pares, impares , mayores de 50 y divisible entre 3
public class Acumulador_bucles {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;
        int acumulador=0;
        int contador=-1;
        System.out.println("Introduce un numero porfavor: ");
        numero = entrada.nextInt();
        int impar;

    while(numero>0) {
        numero = entrada.nextInt();
        acumulador=acumulador + numero;
        contador++;
    }

        System.out.println("La suma de los numeros es: "+acumulador+"\nHas introducido "+(contador+1)+" numeros\nLa media es: "+(acumulador/contador));
        System.out.println("Hay ");
    }
}
