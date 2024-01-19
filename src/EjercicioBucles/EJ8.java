package EjercicioBucles;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero para pasarlo a binario: ");
        int decimal = entrada.nextInt();

        while (decimal > 0) {
            int resto = decimal % 2;
            decimal /= 2;

        }
        /*System.out.print("El numero a binario es :" +binario);
    }*/
    }
}
/*TFM 24/2=    R=0
         12/2=     R=0
             6/2=   R=0
                3/2=   R=1
                       C=1
24=11000
*/