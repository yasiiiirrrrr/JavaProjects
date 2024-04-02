package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;
public class arrays8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array = {1,2,3,4,5,6};
        int[] arrayNuevo;
        int numero;
        for(int x=1; x<4; x++){
            numero=sc.nextInt();
            arrayNuevo=Arrays.copyOf(array,array.length+1);
            arrayNuevo[array.length]=numero;
            array=arrayNuevo;
        }
        System.out.println(Arrays.toString(array));
    }
}
