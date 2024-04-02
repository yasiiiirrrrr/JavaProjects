package ARRAYS;
import java.util.Scanner;

public class arrays7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce los numeor separados por comas : ");
        String numquiniela=sc.nextLine();
        String[] numerosApuesta =numquiniela.split(",");

        // Transformar la entrada en un array de números
        int [] apuesta = new int[numerosApuesta.length];
        for (int i = 0; i < numerosApuesta.length;i++){
            apuesta[i] = Integer.parseInt(numerosApuesta[i].trim());
        }
        // Comprobar que se han introducido seis números entre 0 y 4
        if (apuesta.length !=6){
            System.out.println("DEBES DE INTRODUCIR 6 NUMERO!");
        }
        for(int numero:apuesta){
            if (numero< 0|| numero > 46){
                System.out.println("Los numero deben de estar comprendidos entre 0 y 6");
                 return;
            }
        }
        // Generar al azar un array de seis números entre 0 y 46
        int numerosAzar []= new int[6];
        for (int i=0; i< numerosAzar.length;i++){
            numerosAzar[i]=(int)(Math.random()*47);
        }
        int aciertos =0;
        for (int numero : apuesta){
            for (int numeroAzar : numerosAzar){
                aciertos++;
                break;
            }
        }
        System.out.println("Numero de aciertos: "+aciertos);


    }
}
