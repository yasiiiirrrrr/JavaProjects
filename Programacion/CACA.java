import java.util.Scanner;

public class CACA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Ingresa un caracter (o espacio para salir): ");
            char caracter = scanner.next().charAt(0);
            
            if (caracter == ' ') {
                break; // Salir del bucle si se ingresa un espacio
            } else {
                if (esVocal(caracter)) {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
            }
        }
        
        System.out.println("Programa terminado.");
    }
    
    public static boolean esVocal(char c) {
        // Comprobar si el caracter es una vocal (mayúscula o minúscula)
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
