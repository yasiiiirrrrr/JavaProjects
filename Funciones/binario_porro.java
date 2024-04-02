package Funciones;

import java.util.Scanner;

public class binario_porro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
              do {
                  System.out.println("Introduce un numero:");
                  /*int numero = sc.nextInt();*/
                  String cadena=sc.nextLine();
                  if (esBinarioc(cadena)) {
                      System.out.print("Es binario");
                  } else {
                      System.out.println("No es binario");
                  }
              }while (true);

            }


//funcion recursiva que diga si un numero es binario
    public static boolean esBinario(int numero) {
        if(numero==0 || numero==1){
            return true;
        }
        else if(numero%10 >1){
            return false;
        }
        else{
            return esBinario(numero/10);
        }
    }
    //funcion recursiva para saber si una cadena contiene un numero q es binario
    public static boolean esBinarioc(String cadena){
            if (cadena.equals('1') || cadena.equals('0')){
                return true;
            }
            else{
                return false;
            }
        }
    }