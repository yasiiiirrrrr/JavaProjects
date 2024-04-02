package ObjetosRadio;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Radio radio = new Radio(80);

        imprimirMenu(radio.emisora);
}

    public static void imprimirMenu(float emisora){
        Scanner sc= new Scanner(System.in);
        Radio radio = new Radio(80);
        while (true){
            System.out.println("=======================================");
            System.out.println("||         Emisora "+emisora+"MHz            ||");
            System.out.println("=======================================");
            System.out.println("||1.-  Aumentar Frecuencia(+0.5Mhz)  ||");
            System.out.println("||2.-  Disminuir Frecuencia(-0.5Mhz) ||");
            System.out.println("||3.-             Salir              ||");
            System.out.println("=======================================");
            System.out.println("||     ↑Up                  ↓Down    ||");
            System.out.println("=======================================");
            int opciones=sc.nextInt();
            switch (opciones){
                case 1:
                    emisora= radio.aumentarEmisora(emisora);
                    break;
                case 2:
                    emisora= radio.disminuirEmisora(emisora);
                    break;
                case 3:
                    return;
            }
        }
    }
}
