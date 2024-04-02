package CADENAS;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la cadena deseada: ");
        String cadena=sc.nextLine();
        System.out.println("Introduce el caracter deseado: ");
        String caracter=sc.nextLine();
        int numCaracteres=contarCaracteres(cadena,caracter.charAt(0));
        System.out.println("Hay "+numCaracteres+" caracteres entre el primer caracter: "+caracter+" y el ultimo caracter: "+caracter);

    }
    //hola buenos dias, como estas, yo bastante bien.

    public static int contarCaracteres(String cadena, char caracter){
        int primeraAparicion=-1;
        int ultimaAparicion=-1;
        for (int i=0;i<cadena.length();i++){
            if (cadena.charAt(i)==caracter){
                if (primeraAparicion==-1){
                    primeraAparicion=i;
                }
                ultimaAparicion=i;
            }

        }
        if (primeraAparicion==-1 || ultimaAparicion==-1){
            return 0;
        }else {
            return ultimaAparicion - primeraAparicion - 1;
        }
    }
}
