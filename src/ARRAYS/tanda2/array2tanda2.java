package ARRAYS.tanda2;

import java.util.Scanner;

public class array2tanda2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char arrayLetras[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','W','X','Y','Z'};
        //creamos un array de tipo char para almacenar arrays de A-Z;
        System.out.print("Introduce la posicione del array: ");
        int posicion=sc.nextInt(); //pedimos la posicion del array
        String cadena="";          //creamos una cadena vacia para luego almacenar los caracteres
        int numero;                //creamos un numero de tipo entero para mas tarde pedirlo
        while(true) {
            numero= sc.nextInt();
            if (numero>=0 && numero<=26){
                cadena=cadena+arrayLetras[numero];
            } else if (numero==-1) {
                System.out.println("Cerrando el programa...");
                break; //break para cerrar el programa
            }
            else{
                System.out.println("Numero no valido");
            }
        }
        System.out.println(cadena);
    }

}
