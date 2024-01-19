package EjercicioBucles;

import java.util.Scanner;

public class EJBUCLES_3 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero=entrada.nextInt();
        int resultado=0;
        System.out.println("Introduce un numero: ");
        int numero2= entrada.nextInt();
        for(int i=0; i<numero; i++ ){
            resultado=resultado+numero2;
        }
        System.out.println(numero+" x "+numero2+" = "+resultado);
    }
}

//2*3=2+2+2