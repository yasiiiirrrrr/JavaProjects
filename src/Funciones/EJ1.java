package Funciones;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
     while(true){
         System.out.println("Menu: ");
         System.out.println("  1.-Codificar.");
         System.out.println("  2.-Decodificar. ");
         System.out.println("  3.-Salir. ");
         System.out.print("Debes de seleccionar una opcion:");
         int opciones = entrada.nextInt();
         if (opciones == 1) {
             String mensaje = leerTexto();
             String mensajeCodificado = codificarMensaje(mensaje);
             System.out.println("Aqui tiene tu mensaje codificado:\n" + mensajeCodificado);
         } else if (opciones == 2) {
             String mensaje = leerTexto();
             String mensajedecodificado = decodificarMensaje(mensaje);
             System.out.println("Aqui tiene tu mensaje codificado:\n" + mensajedecodificado);
         } else if (opciones == 3) {
             System.out.print("Saliendo...");
             break;

         }
     }
    }
    public static String leerTexto(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el mensaje que quieras codificar a continuacion: ");
        return entrada.nextLine();

    }
    public static String textoMayuscula(String cadena){
     return cadena.toUpperCase();
    }
    public static String remplazarLetraSiguiente(String cadena){
        String nuevaCadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c)) {
                char nuevaLetra;
                if (c == 'Z') {
                    nuevaLetra = 'A';
                } else {
                    nuevaLetra = (char) (c + 1);
                }
                nuevaCadena =nuevaCadena+nuevaLetra;
            } else {
                nuevaCadena =nuevaCadena+c;
            }
        }
        return nuevaCadena;
    }
    public static String reemplazarNumeroSiguiente(String cadena) {
        String nuevaCadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isDigit(c)) {
                char nuevoDigito;
                if (c == '9') {
                    nuevoDigito = '0';
                } else {
                    nuevoDigito = (char) (c + 1);
                }
                nuevaCadena =nuevaCadena+nuevoDigito;
            } else {
                nuevaCadena =nuevaCadena+c;
            }
        }
        return nuevaCadena;
    }
    public static String reemplazarEspaciosBlanco(String cadena) {
        if (cadena==" "){
            cadena="ç";
        }

        return cadena;
    }
    public static String remplazarLetraAnterior(String cadena){
        String nuevaCadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c)) {
                char nuevaLetra;
                if (c == 'A') {
                    nuevaLetra = 'Z';
                } else {
                    nuevaLetra = (char) (c - 1);
                }
                nuevaCadena =nuevaCadena+nuevaLetra;
            } else {
                nuevaCadena =nuevaCadena+c;
            }
        }
        return nuevaCadena;
    }
    public static String reemplazarNumeroAnterior(String cadena) {
        String nuevaCadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isDigit(c)) {
                char nuevoDigito;
                if (c == '0') {
                    nuevoDigito = '9';
                } else {
                    nuevoDigito = (char) (c - 1);
                }
                nuevaCadena =nuevaCadena+nuevoDigito;
            } else {
                nuevaCadena =nuevaCadena+c;
            }
        }
        return nuevaCadena;
    }
    public static String ponerEspaciosEnBlanco(String cadena) {
        if (cadena=="ç"&& cadena=="Ç"){
            cadena=" ";
        }
        return cadena;
    }
    public static String codificarMensaje(String texto) {
        texto = textoMayuscula(texto);
        texto = remplazarLetraSiguiente(texto);
        texto = reemplazarNumeroSiguiente(texto);
        texto = reemplazarEspaciosBlanco(texto);
        return texto;
    }
public  static String decodificarMensaje(String texto){
       texto = reemplazarNumeroAnterior(texto);
       texto = remplazarLetraAnterior(texto);
       texto = ponerEspaciosEnBlanco(texto);
        return texto;
}

}
