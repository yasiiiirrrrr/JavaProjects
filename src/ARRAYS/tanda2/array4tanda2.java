package ARRAYS.tanda2;

import java.util.Arrays;
import java.util.Scanner;

public class array4tanda2 {
    public static void main(String[] args) {
        int ArrNumeros[]=new int[20];   //creamos el array en el que deseamos generar los 20 numeros
        generarNumeros(ArrNumeros);     //llamamos a la funcion generarNumeros.
        System.out.println(Arrays.toString(ArrNumeros));//imprimimos el array con los numeros una vez almacenados los numeros.
        eliminarNumeros(ArrNumeros);    //llamamos a la funcion de eliminar numeros.
    }
    public static int[] generarNumeros(int []Array){
        for (int i=0; i<Array.length; i++){
            int numAleatorio=(int)(Math.random()*51);   //creamos un numero aleatorio entre 0-50
            Array[i]=numAleatorio;                      //y lo vamos almacenando en las 20 posiciones del array
        }
        Arrays.sort(Array);                             // usamos sort para ordenar el array
        return Array;                                   //devolvemos el array ya con los nunmeros ordenados y generados
    }
    public static int[] eliminarNumeros(int []Array){
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce los numeros que desees eliminar: ");
        int numeroEliminado= sc.nextInt();              //pedimos que se introduzca el numero que queremos eliminar
        int indiceEliminado=0;                          //inicializamos el indice que queremos eliminar en 0
        for (int i=0; i<Array.length; i++){
            if (Array[i]==numeroEliminado){             //si el bucle for encuentra el numero que queremos eliminar en el array entonces i sera el indice que quermos eliminar
                indiceEliminado=i;

            }
        }
        int ArrReducido[]=new int[Array.length-1];     //creamos un array ya reducido
        int nuevoIndice=0;                             //creamos un nuevo indice que iremos incrementando conforme el bucle continue
        for (int i=0; i<Array.length; i++){
            if (i!=indiceEliminado){                    //si i es distinto del indice que queremos eliminar entonces en el nuevoIndice(comienza en 0) almacenamos el Array[0] en el Array Reducido
                ArrReducido[nuevoIndice]=Array[i];
                nuevoIndice++;
            }
        }

        System.out.println("El array reducido es: "+Arrays.toString(ArrReducido));
        return ArrReducido;                             //devolvemos el array ya reducido
    }
}
