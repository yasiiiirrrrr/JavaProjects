package ARRAYS.tanda3;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class array9tanda3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float Arrtabla[]= new float[10];

        for (int i=0; i<5; i++){
            System.out.print((i + 1) + ".-Introduce un numero: ");
            float numero = sc.nextFloat();
            Arrtabla[i] = numero;
        }
        System.out.println("6.-Introduce otro numero");
        float n=sc.nextFloat();
        Arrtabla[5]=n;
        Arrays.sort(Arrtabla);
        System.out.println("Este es el array que has introducido de forma ordenada "+Arrays.toString(Arrtabla));


    }
}
