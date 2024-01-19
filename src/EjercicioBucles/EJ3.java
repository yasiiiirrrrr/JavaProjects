package EjercicioBucles;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
                Scanner entrada=new Scanner(System.in);
                int numero;
                int acumulador=0;
                int contador=-1;
                int contadorimpar=0;
                int acumuladorimpares=0;
                int mayorpar=0;

                do{
                     System.out.println("Introduce un numero porfavor: ");
                     numero = entrada.nextInt();
                    acumulador=acumulador + numero;
                    contador++;
                    if(numero<0) {
                    break;
                    }
                    else if(numero % 2!=0){
                        contadorimpar++;

                    }
                    else if(numero % 2==0){
                        mayorpar++;
                    }

                }while(numero>0);

                System.out.println("La suma de los numeros es: "+acumulador+
                        "\nHas introducido "+(contador+1)+" numeros\nLa media de los numeros impares" +
                        " es: "+(acumulador/contadorimpar));
            }
        }

