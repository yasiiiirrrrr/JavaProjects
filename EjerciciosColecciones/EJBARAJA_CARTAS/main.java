package EjerciciosColecciones.EJBARAJA_CARTAS;

import java.util.Scanner;

public class main {
    static Baraja barajaPoker;
    static Baraja barajaEspañola;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Crear Baraja Española");
            System.out.println("2. Crear Baraja de Poker");
            int opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    menuBaraja(barajaEspañola = new BarajaEspañola(), sc);
                    break;
                case 2:
                    menuBaraja(barajaPoker = new BarajaPoker(), sc);
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }
        }
    }

    public static void menuBaraja(Baraja baraja, Scanner sc) {
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Crear Baraja");
            System.out.println("2. Sacar Carta al Azar");
            System.out.println("3. Sacar Carta");
            System.out.println("4. Barajar Cartas");
            System.out.println("5. Mostrar Repartidas");
            System.out.println("6. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    baraja.crearBaraja();
                    System.out.println("Baraja creada con éxito!");
                    break;
                case 2:
                    baraja.SacarCartaAzar();
                    break;
                case 3:
                    System.out.print("Introduce el número de carta que deseas sacar: ");
                    int numCarta = sc.nextInt();
                    baraja.SacarCarta(numCarta);
                    break;
                case 4:
                    baraja.BarajarCarta();
                    break;
                case 5:
                    baraja.MostarRepartidas();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }
        }
    }
}
