package EjercicioBucles;
import javax.swing.*;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String clave="1234";
        String contraseña="";
        int intentos=0;

        do{
            intentos++;
            System.out.println("Introduce la contraseña: ");
            contraseña= entrada.nextLine();
            if(clave.equals(contraseña)==false){
                System.out.println("\nContraseña Incorrecta.\nLlevas " +intentos+ " intentos.\nVuelve a intentarlo.\n");
            }
            else if (intentos==5) {
                System.out.println("Has gastado todos tus intentos ");
                break;
            }
            else if (clave.equals(contraseña)==true) {
                System.out.println("¡Contraseña correcta!.Acceso permitido");
                break;
            }
        }while(clave.equals(contraseña)==false && intentos<5 );

    }
}
