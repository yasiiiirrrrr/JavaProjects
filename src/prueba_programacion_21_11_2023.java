import java.util.Arrays;
import java.util.Scanner;

public class prueba_programacion_21_11_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double array[] = new double[10];
        double nota;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce una nota: ");
            nota = sc.nextDouble();
            array[i] = nota;
        }

        while (array.length > 4 && (calcularDiferencia(array) >= 3)) {
            array = desestimarNotas(array);
        }

        System.out.println("Estas son las notas que has introducido después de desestimar: " + Arrays.toString(array));
        double media = calcularMedia(array);
        System.out.println("La media es: " + media);

    }
    public static double calcularMedia(double[] array) {
        // Calcular la suma de los elementos en el array
        double suma = 0;
        for (double elemento : array) {
            suma += elemento;
        }

        // Calcular la media dividiendo la suma por la cantidad de elementos
        return suma / array.length;
    }
    public static double calcularDiferencia(double[] array) {
        // Encontrar la nota más alta y más baja
        double maximo = array[0];
        double minimo = array[0];
         for (int i= 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            } else if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        // Calcular la diferencia entre la nota más alta y la más baja
        return maximo - minimo;
    }
    public static double[] desestimarNotas(double[] array) {
        // Encontrar la nota más alta y más baja
        double maximo = array[0];
        double minimo = array[0];
        int indiceMaximo = 0;
        int indiceMinimo = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
                indiceMaximo = i;
            } else if (array[i] < minimo) {
                minimo = array[i];
                indiceMinimo = i;
            }
        }
        // Crear un nuevo array sin la nota más alta y más baja
        double[] arrayReducido = new double[array.length - 2];
        int indiceNuevo = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != indiceMaximo && i != indiceMinimo) {
                arrayReducido[indiceNuevo] = array[i];
                indiceNuevo++;
            }
        }
        return arrayReducido;
    }
}