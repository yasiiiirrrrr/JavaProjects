package ARRAYS.tanda3;

import java.util.Arrays;
import java.util.Scanner;

public class array10tanda3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float Arrtabla[]= new float[10];
        for (int i=0; i<Arrtabla.length; i++){
            System.out.print((i + 1) + ".-Introduce un numero: ");
            float numero = sc.nextFloat();
            Arrtabla[i] = numero;
        }
        Arrays.sort(Arrtabla);
        System.out.println("Este es el array que has introducido "+Arrays.toString(Arrtabla));

        System.out.print("Introduce el numero que deseas buscar: ");
        float n=sc.nextFloat();
        int posicion=-1;
        for (int i=0; i<Arrtabla.length; i++){
            if (Arrtabla[i]==n){
                posicion=i;
                break;
            }
        }
        if(posicion!=-1){
            System.out.println(n+" se encuentra en la posicion "+posicion);
        }else{
            System.out.println("El numero que has introducido no existe en el array ");
        }


    }
}
