package ARRAYS.tanda3;

import java.util.Arrays;
import java.util.Scanner;

public class array2tanda3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ArrayLetras[]= new String[20];
        int contadorVocales=0;
        int contadorConsonantes=0;

        for (int i=0; i<ArrayLetras.length;i++){
            System.out.print("Introduce la letra que deseas almacenar: ");
            String Letra= sc.nextLine();
            if (esVocal(Letra)){
                contadorVocales++;
            } else if (esVocal(Letra)==false) {
                contadorConsonantes++;
            }
            ArrayLetras[i]=Letra;
        }
        System.out.println("Has introducido "+contadorVocales+" vocales");
        System.out.println("Has introducido "+contadorConsonantes+" consonantes");
    }
    public static boolean esVocal(String Letra) {
        if (Letra.equalsIgnoreCase("A") || Letra.equalsIgnoreCase("E") || Letra.equalsIgnoreCase("I") || Letra.equalsIgnoreCase("O") || Letra.equalsIgnoreCase("U")) {
            return true;
        } else {
            return false;
        }
    }
}
