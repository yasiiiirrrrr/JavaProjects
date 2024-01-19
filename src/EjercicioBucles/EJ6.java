package EjercicioBucles;
import java.util.Scanner;
public class EJ6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        char caracter;
        while(true){
            System.out.print("Introduce un caracter (PRESIONA ESPACIO PARA SALIR):");
            caracter = entrada.next().charAt(0);
            if (caracter==' ') {
                break;
            }
            else{
                if (esVocal(caracter)) {
                    System.out.print("Es Vocal\n");
                }
                else{
                    System.out.print("No es Vocal\n");
                }
            }
        }
System.out.print("Has finalizado el programa");
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ;
    }
}
