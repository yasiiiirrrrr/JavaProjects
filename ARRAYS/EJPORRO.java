package ARRAYS;

import java.util.Arrays;
//FUNCION QUE DADO POR PARAMETRO UN ARRAY Y UN VALOR AÑADA EL VALOR AL FINAL DEL ARRAY
public class EJPORRO {
    public static void main(String[] args) {
        int [] array = {2,4,5,43,55};
        int numero=7;
        System.out.println("Este es el array: "+Arrays.toString(array));
        System.out.println("Este es el array pero añadiendole un numero: "+(Arrays.toString(añadirAlArray(array, numero))));
        System.out.println("Este es el array pero con un numero menos:"+Arrays.toString(disminuirArray(array)));
    }
    public static int[] añadirAlArray(int[] array, int numero) {
        int[] newArray = new int[array.length +1 ];
        for (int i =0; i<array.length; i++){
            newArray[i] = array[i];
        }
        newArray[array.length] = numero;
        return newArray;
    }
    public static int[] disminuirArray(int[] array){
        int array2[]=new int[array.length-1];
        for (int i=1; i<array.length; i++){
            array2[i-1]=array[i];
        }
        return array2;
    }
}
