package EjercicioBucles;

import java.util.Random;
import java.util.Scanner;

public class EJBUCLES_1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Random dado= new Random();
        System.out.println("20 lanzamientos de un dado:");
        for (int i = 1; i<=20; i++) {
            int resultado = dado.nextInt(6) + 1;
            System.out.println("Lanzamiento " + i + ": " + resultado);
        }
    }
}
