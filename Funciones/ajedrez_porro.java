package Funciones;
public class ajedrez_porro {
    public static void main(String[] args) {
    int filas = 8;
    int columnas = 8;
        for (int fila = 0; fila < filas; fila++) {
        for (int columna = 0; columna < columnas; columna++) {
            boolean esNegra = (fila + columna) % 2 == 1;
            if (esNegra) {
                System.out.print("■ ");
            } else {
                System.out.print("□ ");
            }
        }
        System.out.println(); // Cambia de línea al final de cada fila
    }
}
}

