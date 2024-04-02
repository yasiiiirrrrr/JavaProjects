package ARRAYS;

import java.util.Scanner;

public class arrays4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a=(int)Math.round(Math.random()*100);
    int b=(int)Math.round(Math.random()*100);
    int c=(int)Math.round(Math.random()*100);
    int d=(int)Math.round(Math.random()*100);
    int e=(int)Math.round(Math.random()*100);
    int f=(int)Math.round(Math.random()*100);
    int g=(int)Math.round(Math.random()*100);
    int h=(int)Math.round(Math.random()*100);
    int i=(int)Math.round(Math.random()*100);
    int j=(int)Math.round(Math.random()*100);
    int k=(int)Math.round(Math.random()*100);
    int l=(int)Math.round(Math.random()*100);
    int m=(int)Math.round(Math.random()*100);
    int n=(int)Math.round(Math.random()*100);
    int o=(int)Math.round(Math.random()*100);
    int [][] matrix={
            {a,b,c,d,e},
            {f,g,h,i,j},
            {k,l,m,n,o},
            };
        //   System.out.println("Valor "+ matrix[2][3]);
          for(int[]fila:matrix){
               System.out.println();
               for(int z:fila){
               System.out.print(z+" ");
               }        
          }
          int total=a+b+c+d+e+f+g+h+i+j+k+l+n+o;
        System.out.println("\nLa suma de la matriz es: "+total);
        System.out.println("Introduce el numero que quieres encontrar: ");
        int numeroBuscado=sc.nextInt();
        boolean existeNumero = posicion(matrix, numeroBuscado);
        if (existeNumero) {
            System.out.println("El número " + numeroBuscado + " existe en el array.");
        } else {
            System.out.println("El número " + numeroBuscado + " no existe en el array.");
        }
        System.out.println("El mayor numero es el "+valorMaximo(matrix));
          //imprimir el array obtenido y la suma de sus valores
    }
    public static boolean posicion(int[][] array,int valor){
        for (int i = 0; i < array.length; i++) {
                for (int a=0; a< array.length;a++){
                    if (array[i][a]==valor){
                     return true;
                    }
                }
            }
        return false;
    }
    public static int  valorMaximo(int[][] array) {
        int mayor = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > mayor) {
                    mayor = array[i][j];
                }
            }
        }
        return mayor;
    }
}



