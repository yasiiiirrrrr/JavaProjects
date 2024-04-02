package ARRAYS;
import java.util.Arrays;
public class arrays6 {
    public static void main(String[] args) {
        String cadena = "Esto:es:una:cadena:dividida:por:split:haciendo:uso:de:Arrays.toString:esta:clase:ha:sido:importada:desde:el:paquete:java.util.Arrays";
        String[] palabras = cadena.split(":");
        System.out.println(Arrays.toString(palabras));
        /*La funcion split divide el texto en arrays y separa cada palabra segun el caracter declarado en la variable palabras¨(linea 6)*/
    }
}
