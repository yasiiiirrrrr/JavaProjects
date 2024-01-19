package Ejercicios_de_Repaso;
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto: ");
        String cadena=entrada.nextLine();
        if(cadena.length()> 6){
            System.out.println("La cadena ingresada tiene mas de 6 caracteres ");
        }
        else if(cadena.length()< 6){
            System.out.println("La cadena ingresada tiene menos de 6 caracteres ");
        }
        else if (cadena.length()==6) {
            System.out.println("Tu cadena tiene 6 caracteres. ");
        }
    }
}
