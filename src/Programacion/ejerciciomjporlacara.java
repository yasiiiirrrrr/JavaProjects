package Programacion;
import java.util.Locale;
import java.util.Scanner;
//leer una cadeba, decir si tiene +6 digitos y tiene alguna mayuscula en la cadena;
//Si la contraseña tiene menos de 6 digitos y alguna mayuscula contraseña correcta
//si tiene mas de seis cifras y no tiene mayusculas. error debe tener mayusuclas
public class ejerciciomjporlacara {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce una contraseña: ");
        String cadena= entrada.nextLine();
         //minuscula, -6 digitos.
        String minuscula= cadena.toLowerCase();
        int longitud = cadena.length();
        //mayuscula
        String mayusucla= cadena.toUpperCase();


        if (cadena.length()>=6 && cadena.equals(minuscula) ) {
            System.out.println("El numero introducido tiene 6 cifras o mas y no tiene mayusculas ");
        }
        else if (cadena.length()>=6 && cadena.equals(mayusucla) ) {
            System.out.println("El numero introducido tiene 6 cifras o mas y tiene mayusculas ");
        }
        else if (cadena.length()<=6 && cadena.equals(mayusucla)) {
            System.out.println("El numero introducido tiene menos 6 cifras y tiene mayusculas ");
        }
        else if (cadena.length()<=6 && cadena.equals(minuscula) ) {
            System.out.println("El numero introducido tiene menos 6 cifras y no tiene mayusculas ");
        }

    }

    }
