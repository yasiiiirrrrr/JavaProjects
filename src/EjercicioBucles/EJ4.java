package EjercicioBucles;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena ,frase="";
        char letra;
        boolean esLetra=false;
        do{
            System.out.println("Introduce una letra, o un numero para salir");
            cadena=entrada.nextLine();
            letra=cadena.charAt(0);
            if(letra>'a' && letra<='z'){
                esLetra=true;
                frase=frase+letra+ " ";
            }
            else if(letra>='A' && letra<='Z'){
                esLetra=true;
                frase=frase+letra+ " ";

            }
            else if(letra>='0' && letra<='9'){
                esLetra=true;
            }
        }while(esLetra);
        System.out.println(frase);




    }
}

