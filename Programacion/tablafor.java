package Programacion;
import java.util.Scanner;
public class tablafor {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero para obtener su tabla: ");
        int numero=entrada.nextInt();
        for(int i=0; i<=10; i++) {
           int resultado=i*numero;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
    }
    }

