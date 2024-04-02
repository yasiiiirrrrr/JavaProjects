package EjFutbol;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        /* Implementar una clase futbolista con dni, nombre, edad y número de goles, con su constructor y los
         * métodos toString y equals, basado este útimo en DNI. Implementa tambien la interfaz Comparable
         * con un criterio de relación en DNI también. Y un comparador para hacer ordenaciones por nombre,
         * y otro en edad.
         *
         * Crear una array de 5 futbolistas y mostrarlos ordenados por DNI, EDAD y NOMBRE
         * Crear otro comparador que ordene por edad, y si tienen la misma edad por nombre*/



        Futbolista RealMadrid[] = new Futbolista[6];
        RealMadrid[0]= new Futbolista("24371771M",48,"David Beckham",20);
        RealMadrid[1]= new Futbolista("34344733Z",39,"Cristiano Ronaldo",451);
        RealMadrid[2]= new Futbolista("64334171Y",46,"Raul Gonzalez",323);
        RealMadrid[3]= new Futbolista("54332323N",51,"Luis Figo",57);
        RealMadrid[4]= new Futbolista("94336671J",37,"Sergio Ramos",101);
        RealMadrid[5]= new Futbolista("94336671J",37,"Sergio Ramos",101);

        //Imprimimos Array
        imprimriArr(RealMadrid);

        //Implementando Equals para comparar DNIs
        System.out.println(RealMadrid[0].equals(RealMadrid[3])); //Return False
        System.out.println(RealMadrid[4].equals(RealMadrid[5])); //Return True

        //Ordena goles, sino ordena por dni
        System.out.println(" ===================Comparando goles==================");
        comparadorGoles c1 = new comparadorGoles();
        Arrays.sort(RealMadrid,c1);
        imprimriArr(RealMadrid);

        //Ordena Nombre
        System.out.println("==================Comparador Nombre===================");
        comparadorNombre c2 = new comparadorNombre();
        Arrays.sort(RealMadrid,c2);
        imprimriArr(RealMadrid);

    }

    public static void imprimriArr(Futbolista arrbase[]){
        for (int i = 0; i < arrbase.length; i++) {
            System.out.println(arrbase[i]);
        }
        System.out.println();
    }
}
