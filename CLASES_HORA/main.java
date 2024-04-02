package CLASES_HORA;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Hora horaCumple= new Hora(23, 32, 15);
        System.out.println(horaCumple.darHora());
        System.out.println(horaCumple.darHora(tipoFormato.FORMATO_12H));
        System.out.println(horaCumple.darHora(tipoFormato.FORMATO_24H));
        System.out.println(horaCumple.darHora());

    }
    public static void imprimirMenu(Hora hora){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("====================================");
            System.out.println("    1. Cambiar hora.");
            System.out.println("    2. Escribir hora Formato AM/PM.");
            System.out.println("    3. Escribir hora Estandar.");
            System.out.println("    4. Salir.");
            System.out.println("====================================");
            System.out.print("Elige una opcion(1-4)");
            int opciones = sc.nextInt();
            switch (opciones){
                case 1:
                    hora.cambiarHora(0);

                    break;
                case 2:
                    hora.darHora(null);
                    break;
                case 3:
                    hora.darHora();
                    break;
                case 4:
                    return;
                }
        }
    }
}
