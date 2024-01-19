package ARRAYS.tanda3;

import java.util.Arrays;
import java.util.Scanner;

public class array6tanda3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Array[]=new int [10];
        for (int i=0; i<Array.length;i++){
            System.out.println("Introduce un numero: ");
            int numero=sc.nextInt();
            Array[i]=numero;
        }

    }
/*    public static boolean esCreciente(int [] Array, int numero){


}*/
}
