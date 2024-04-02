package ExamenOtraVez2.EJ2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CarnetSocio Jose = new CarnetSocio("Jose","jose442@gmail.com");

    }
    public static void imprimirMenu(){
        Scanner sc = new Scanner(System.in);
        int opciones;
        do {
            System.out.println(" ╔════════════════════════════════════════╗");
            System.out.println(" ║                  MENU                  ║");
            System.out.println(" ╚════════════════════════════════════════╝");
            System.out.println(" ╔════════════════════════════════════════╗");
            System.out.println(" ║ 1.-Comprar Clase.                      ║");
            System.out.println(" ║ 2.-Listar abonos de Nado Libre.        ║");
            System.out.println(" ║ 3.-Cancelar Abonos.                    ║");
            System.out.println(" ║ 4.-Salir                               ║");
            System.out.println(" ╚════════════════════════════════════════╝");
            System.out.println(" Selecciona una opcion (1-4): ");
            opciones = sc.nextInt();
            switch (opciones){
                case 1 :

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Introduce un opcion correcta!");
            }
        }while(opciones > 0 );
    }
    public static void comprarClases(CarnetSocio Persona){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la fecha de compra de la clase: ");
        String fechaCompra = sc.nextLine();
        LocalDate fecha  = LocalDate.parse(fechaCompra, formatter);

    }


}
