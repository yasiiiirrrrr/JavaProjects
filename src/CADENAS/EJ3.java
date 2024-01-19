package CADENAS;

public class EJ3 {
    public static void main(String[] args) {
        String ejemplo = "adios";
        String cadenaInvertida = invertirCadena(ejemplo);
        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }
    public static String invertirCadena(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida=cadenaInvertida+cadena.charAt(i);
        }
        return cadenaInvertida;
    }
}
