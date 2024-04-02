package ARRAYS.tanda3;

import java.util.Arrays;
import java.util.Scanner;

public class array1tanda3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Array[]= new int[10];
        int suma=0;
        for (int i=0; i<Array.length;i++){
            System.out.print("Introduce el numero que deseas almacenar: ");
            int numero= sc.nextInt();
            Array[i]=numero;
            suma=suma+numero;
        }
        System.out.println("El array que has introducido es: "+ Arrays.toString(Array));
        System.out.println("La suma de todos los numeros es: "+suma);
    }
}
