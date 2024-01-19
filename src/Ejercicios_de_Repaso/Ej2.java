package Ejercicios_de_Repaso;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        String num= entrada.nextLine();
        if (num.length()==1){
            System.out.println("El numero introducido tiene 1 cifra ");
        }
        else if (num.length()==2) {
            System.out.println("El numero introducido tiene 2 cifras ");
        }
        else if (num.length()==3) {
            System.out.println("El numero introducido tiene 3 cifras ");
        }
        else if (num.length()==4) {
            System.out.println("El numero introducido tiene 4 cifras ");
        }
        else if (num.length()==5) {
            System.out.println("El numero introducido tiene 5 cifras ");
        }
        else if (num.length()>=6) {
            System.out.println("El numero introducido tiene 6 cifras o mas ");
        }
    }
}
