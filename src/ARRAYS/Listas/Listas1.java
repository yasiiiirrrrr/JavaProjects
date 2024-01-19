package ARRAYS.Listas;
import java.util.Scanner;

public class Listas1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la lista: ");
        int lista[]={1,2,4,5,6,9,15};
        System.out.println("Introduce la posicion de la lista que quieres eliminar: ");
        int posicion=sc.nextInt();
        int opcion=0;
        while(true){
            imprimirMenu(opcion);
            if(opcion==1){
                insertarElemento(lista,4);
            }
            else if (opcion==2){
                imprimirLista(lista);
            }
            else if (opcion==3){
                eliminarElemento(lista,posicion);
            }
            else if (opcion==4){
                break;
            }
        }
    }
    public static int imprimirMenu(int opcion){
        Scanner sc= new Scanner(System.in);
        System.out.println("\n⎡---------------------------------⎤");
        System.out.println("|           Menú Principal        |");
        System.out.println("|---------------------------------|");
        System.out.println("|    1. Insertar elemento         |");
        System.out.println("|    2. Eliminar elemento         |");
        System.out.println("|    3. Ver lista                 |");
        System.out.println("|    4. Salir                     |");
        System.out.println("⎣_________________________________⎦");
        System.out.print("\n     Seleccione una opción (1-5): ");
        opcion = sc.nextInt();
        return opcion;
    }

    public static int[] insertarElemento(int array[], int valor){
        Scanner sc=new Scanner(System.in);
        int longitud= array.length;
        int [] newArray = new int[longitud-1];
        int i=0;
        while ((array[i]<valor) && (i<longitud)){
            newArray[i]=array[i];
            i++;

        }
        newArray[i]=valor;
        for(int j=i+1;j<=longitud;j++){
            newArray[j]=array[j-1];

        }
        return newArray;
    }
    public static int[] eliminarElemento(int array[], int posicion){
        int longitud= array.length;
        int [] newArray = new int[longitud-1];
        for(int i=0; i<posicion;i++){
            newArray[i]=array[i];
        }
        for (int i=posicion+1;i<longitud;i++){
            newArray[i-1]=array[i];

        }
        return newArray;
    }

    public static void imprimirLista(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}