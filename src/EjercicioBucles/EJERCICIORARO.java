package EjercicioBucles;
//a - 4
//e - 3
//o - 0
//i - 1
//u - 2
public class EJERCICIORARO {
    public static void main(String[] args) {
        String cadena = "Hola, esto es un ejemplo";
        String cadena2 = "";

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            char cambio = caracter;

            switch (caracter) {
                case 'a':
                    cambio = '4';
                    break;
                case 'e':
                    cambio = '3';
                    break;
                case 'o':
                    cambio = '0';
                    break;
                case 'i':
                    cambio = '1';
                    break;
                case 'u':
                    cambio = '2';
                    break;
            }

            cadena2=cadena2+cambio;
        }

        System.out.println("Texto original: " + cadena);
        System.out.println("Texto modificado: " + cadena2);
    }
}