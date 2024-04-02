package ARRAYS.tanda3;

import java.util.Arrays;
import java.util.Scanner;

public class array12tanda3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Arrclase[]=new int[5];      // Creamos un array clase con 5 alumnos
        int ArrNotasclase[]=new int[5];      // Creamos un array clase con 5 alumnos
        double promedioClase=0;
        for (int i=0;i<Arrclase.length; i++){       // Bucle for para recorrer el Array de la clase
            System.out.println("Introduce las notas del alumno " + (i + 1));
            int ArrnotasAlumno[] = new int[3];  // Creamos un array para almacenar las notas de cada alumno
            for (int j = 0; j < 3; j++) {   // Bucle for para recorrer el Array de las notas de cada alumno
                System.out.print((j + 1) + "º Trimestre: ");
                int nota = sc.nextInt();    // Pedimos por teclado la nota del alumno en cada trimestre
                ArrnotasAlumno[j] = nota;   // Almacenamos cada nota en el Array

            }
            double promedioAlumno = calcularMediaAlumno(ArrnotasAlumno);  // Llamamos a la funcion de calcularMedia para calcular el promedio de las notas del alumno
            ArrNotasclase[i] = (int) promedioAlumno;                     // Almacenamos las notas medias de cada alumno en Array
            promedioClase= calcularMediaClase(Arrclase);

        }
        System.out.println("Notas medias de cada uno de los alumnos es: "+Arrays.toString(Arrclase)); // Imprimimos la nota media de los alumnos
        System.out.println("La nota media de la clase es: "+promedioClase);
    }
    public static double calcularMediaAlumno(int[] notas) { // Funcion para calcular la media
        int suma = 0;       // Inicializamos la suma en 0
        for (int i = 0; i < notas.length; i++) {    // Bucle for para recorrer el Array notas
            suma += notas[i];                       // Almacenamos las notas en suma y a la vez sumas las notas entre ellas cada vez que vuelve a realizarse el bucle
        }
        return (double) suma / notas.length;        // devolvemos la media(la suma de todas las notas entre el numero de notas que hay)
    }
    public static double calcularMediaClase(int[] notas) { // Funcion para calcular la media
        int suma = 0;       // Inicializamos la suma en 0
        for (int i = 0; i < notas.length; i++) {    // Bucle for para recorrer el Array notas
            suma += notas[i];                       // Almacenamos las notas en suma y a la vez sumas las notas entre ellas cada vez que vuelve a realizarse el bucle
        }
        return (double) suma / notas.length;        // devolvemos la media(la suma de todas las notas entre el numero de notas que hay)
    }
}
