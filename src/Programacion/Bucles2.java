package Programacion;
import java.util.*;
public class Bucles2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int aleatorio=(int)(Math.random()*100);
        int numero=0;
        int intentos=0;
        do{
            intentos++;
                System.out.println("Introduce un numero porfavor: ");
                numero=entrada.nextInt();
                if(aleatorio<numero){
                    System.out.println("Mas abajo");
                }
                else if(aleatorio>numero){
                    System.out.println("Mas alto");
                }
                if(intentos>=10){
                System.out.println("\n\u001B[1mHas perdido! "+aleatorio+ " es el numero buscado.");
                }
                if(numero==aleatorio){
                    System.out.println("\n\u001B[1mCorrecto! "+numero+ " es el numero buscado. \n\u001B[1mLo has conseguido despues de "+intentos+" intentos.");
                }
        }while(numero!=aleatorio && intentos<=9);
    }
}
