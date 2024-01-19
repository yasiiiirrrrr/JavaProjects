package Funciones;
import java.util.Scanner;

public class RECURSIVIDAD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do {
            int numero=sc.nextInt();
            System.out.println(sumarCifras(numero));
        }while(true);

    }

    public static int sumarCifras(int numero) {
       if (numero<10){
           return numero;
       }
       else{
           return numero%10+sumarCifras(numero/10);
       }
    }
}

