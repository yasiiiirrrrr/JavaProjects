package almacen;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BebidaAzucarada[] bebidaAzucaradas = new BebidaAzucarada[3];
        AguaMineral[] aguaMineral = new AguaMineral[3];

        /*      Bebidas Azucaradas    */

        BebidaAzucarada Fanta = new BebidaAzucarada(12004, 1.5, 2.2, "Coca-Cola", 15);
        bebidaAzucaradas[0] = Fanta;
        BebidaAzucarada Nestea = new BebidaAzucarada(11905, 1.7, 1.99, "Coca-Cola", 12);
        bebidaAzucaradas[1] = Nestea;
        BebidaAzucarada CocaCola = new BebidaAzucarada(13544, 2, 2.29, "Coca-Cola", 13);
        bebidaAzucaradas[2] = CocaCola;

        /*      Agua Mineral        */

        AguaMineral Aquarel = new AguaMineral(12353, 1.5, 1.2, "Aquarel","Las Jaras");
        aguaMineral[0]=Aquarel;
        AguaMineral Font_Vella = new AguaMineral(13556, 2, 1.7, "Font Vella","Sigüeza");
        aguaMineral[1]=Font_Vella;
        AguaMineral Liviana = new AguaMineral(15693, 1.3, 0.99, "Liviana","Eliqua");
        aguaMineral[2]=Liviana;

        imprimirMenu();
    }

    public static void imprimirMenu (){
        Scanner sc= new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("                      MENU                    ");
        System.out.println("==============================================");
        System.out.println("1.-Precio total de todos los productos.       ");
        System.out.println("2.-Precio de todas las bebidas de una marca.  ");
        System.out.println("3.-Agregar un producto.                       ");
        System.out.println("4.-Eliminar producto.                         ");
        System.out.println("5.-Informacion sobre el producto.             ");
        System.out.println("6.-Salir");
        System.out.println("==============================================");
        System.out.println("Elije una opcion (1-6)");
        int opciones=sc.nextInt();

        switch (opciones){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                return;
            default:
                System.out.println("ERROR. Introduce una opcion correcta!.");
        }

    }

}
