package ARRAYS.tanda3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array7tanda3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Arrtabla[]=new int[10];
        for (int i=0; i<Arrtabla.length-2;i++){
            System.out.println((i+1)+".-Introduce un numero: ");
            int numero= sc.nextInt();
            Arrtabla[i]=numero;
        }
        System.out.println("Este es tu array: "+ Arrays.toString(Arrtabla));
        System.out.println("Introduce la posicion donde quieras insertar el numero: ");
        int posicion=sc.nextInt();
        System.out.println("Introduce un numero: ");
        int numero=sc.nextInt();
        for (int i=Arrtabla.length-1; i>posicion;i--){
            Arrtabla[i]=Arrtabla[i-1];
        }
        Arrtabla[posicion]=numero;
        System.out.println("Este es tu array: " + Arrays.toString(Arrtabla));
        System.out.println("Introduce la posicion donde quieras insertar el numero: ");
        posicion=sc.nextInt();
        System.out.println("Introduce un numero: ");
        numero=sc.nextInt();
        for (int i=Arrtabla.length-1; i>posicion;i--){
            Arrtabla[i]=Arrtabla[i-1];
        }
        Arrtabla[posicion]=numero;
        System.out.println("Este es tu array: " + Arrays.toString(Arrtabla));


    }
}
