package CADENAS;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cadena=sc.nextLine();
        int numVocales=contarVocales(cadena);
        System.out.println("'"+cadena+"'"+" tiene "+numVocales+" vocales.");
    }
    public static int contarVocales(String cadena){
        int contador=0;
        for (int i=0;i<cadena.length();i++){
            char caracter=Character.toLowerCase(cadena.charAt(i));
            if (caracter=='a'|| caracter=='e'|| caracter=='i'|| caracter=='o'|| caracter=='u'){
               contador++;
            }
        }
        return contador;
    }
}
