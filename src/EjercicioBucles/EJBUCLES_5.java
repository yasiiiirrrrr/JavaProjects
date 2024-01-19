package EjercicioBucles;

import java.util.Scanner;
//wtf
public class EJBUCLES_5 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Ingrese el valor de n1 (debe ser menor que n2): ");
            int n1 = entrada.nextInt();

            System.out.print("Ingrese el valor de n2: ");
            int n2 = entrada.nextInt();

            if (n1 >= n2) {
                System.out.println("El valor de n1 debe ser menor que n2. Por favor, vuelva a ingresar los valores.");
                return;
            }

            System.out.println("Realizando el proceso:");

        while (n1 <= n2) {
            System.out.println("n1 = " + n1 + ", n2 = " + n2);
            n1 *= 2;
            n2 /= 2;
    }
}
}
