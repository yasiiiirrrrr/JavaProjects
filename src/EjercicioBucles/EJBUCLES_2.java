package EjercicioBucles;

import java.util.Random;

public class EJBUCLES_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero;

        do {
            numero = random.nextInt(100);
            System.out.println("Número generado: " + numero);
        }while (numero % 9 != 0);

        System.out.println("¡Se generó un múltiplo de 9! El número es: " + numero);
    }
}
