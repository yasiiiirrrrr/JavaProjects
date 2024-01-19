package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;
public class EJPORRO2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce todos los valores que desees: ");
        String valores=sc.nextLine();
        System.out.println("Introduce el dato que deseas añadir: ");
        String dato=sc.nextLine();
        String array[]=valores.split(" ");
//      System.out.println(Arrays.toString(array));
        int opcion = sc.nextInt();
        System.out.println(Menu(opcion));
    }
    public static int Menu(int menu){
        Scanner sc=new Scanner(System.in);
       do {
            System.out.println("\n⎡---------------------------------⎤");
            System.out.println("|           Menú Principal        |");
            System.out.println("|---------------------------------|");
            System.out.println("|    1. Ver Datos                 |");
            System.out.println("|    2. Introducir Valor          |");
            System.out.println("|    3. Sacar Valor               |");
            System.out.println("|    4. Ver Valor                 |");
            System.out.println("|    5. Salir                     |");
           System.out.println ("⎣_________________________________⎦");
           System.out.print("\n     Seleccione una opción (1-5): ");
        }while (true);
    }
    public static String[] verDato(String array[]) {

        return array;
    }
        public static String introducirValor(String array[], String valor){
            String[] newArray = new String[array.length +1 ];
            for (int i =0; i<array.length; i++){
                newArray[i] = array[i];
            }
            newArray[array.length] = valor;
        return valor;
    }
    public static String sacarValor(String valor){

        return valor;
    }
    public static String verValor(String valor){

        return valor;
    }

}
