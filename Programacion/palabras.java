package Programacion;

import java.util.Scanner;

//progrrama que lea palñabras hasta que se introduzca la cadena vacia e indeque cuantas
// palabras habia con mas de 5 caracteres y cuantas tenian mayusculas
public class palabras {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int contador=0;
        String palabra;
        String minus;
        int mayus=0;
        do{
            System.out.println("Introduce una palabra porfavor: ");
            palabra = entrada.nextLine();
            int numpal=palabra.length();
            minus=palabra.toLowerCase();
           if(numpal>=5){
                contador++;
            }

           if(!palabra.equals(minus)){
               mayus++;

           }
        }while(!palabra.equals(""));
        System.out.println("Has introducido "+contador+" palabras, de las cuales "+mayus+" tenian mayusucula");
    }
}
