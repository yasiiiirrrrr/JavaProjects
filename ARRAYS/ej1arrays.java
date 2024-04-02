package ARRAYS;

import java.util.Scanner;

public class ej1arrays {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int numeros[]=new int [15];
    numerosAleatorios(numeros);
    System.out.println("\nLa suma de todos los numeros es: "+sumaArrays(numeros));
    valorMaximo(numeros);
    System.out.print("Introduce el valor que deseas encontrar: ");
    int valor=sc.nextInt();
    if (posicion(numeros, valor)==false){
    System.out.println("El valor no se encuentra en el array" );
    }
    else if (posicion(numeros, valor)==true){
    System.out.println("El valor se encuentra en el array" );
    
    }

    }
    public static void numerosAleatorios(int numeros[]){;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =(int) (Math.random()*101);
            System.out.print(numeros[i] + " ");
        }    
    }
    public static int sumaArrays(int numeros[]){
    int suma=0;
     for (int i = 0; i < numeros.length; i++) {
        suma+=numeros[i];
    }
    return suma;
    }

    public static boolean posicion(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return true;
            }
        }
        
        return false;
    }
    public static void  valorMaximo(int[] numeros){
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El valor máximo en el array es: " + maximo);
    } 




}
        
