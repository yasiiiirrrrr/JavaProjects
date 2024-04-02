package EjFutbol;


import java.util.Objects;

public class Futbolista implements Comparable{

    /*Atributos*/

    private String DNI;
    private int edad;
    private String nombre;
    private int numeroGoles;

    /*Constructores*/

    public Futbolista(String DNI, int edad, String nombre, int numeroGoles) {
        this.DNI = DNI;
        this.edad = edad;
        this.nombre = nombre;
        this.numeroGoles = numeroGoles;
    }

    /*Metodos*/
    @Override
    public int compareTo(Object obj) {
    Futbolista Robinho = (Futbolista)obj;
        return this.DNI.compareTo(Robinho.getDNI());
    }
    //Si this.DNI es menor que Robinho.getDNI(), compareTo devolverá un número negativo.
    //Si son iguales, devolverá cero.
    //Si this.DNI es mayor que Robinho.getDNI(), devolverá un número positivo

    @Override
    public boolean equals(Object obj) {
        // Paso 1: Verificar si el objeto es el mismo
        if (this == obj) {
            return true;
        }

        // Paso 2: Verificar si el objeto no es nulo y es de la misma clase
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Paso 3: Realizar el casting del objeto y comparar propiedades
        Futbolista Kaka = (Futbolista) obj;

        // Paso 4: Comparar propiedades relevantes para la igualdad (en este caso, DNI)
        return Objects.equals(this.DNI, Kaka.getDNI());
    }


    /*Getters y Setters*/

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    /*toString*/

    @Override
    public String toString() {
        return "Futbolista{" +
                "DNI='" + DNI + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", numeroGoles=" + numeroGoles +
                '}';
    }


}
