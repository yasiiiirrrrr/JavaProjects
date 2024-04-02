package ExamenOtraVez2.EJ1;

public class ComponentedeCoche {

    /*Atributos*/
    private String descripcion;
    private double peso;
    private double coste;

    /*Constructor*/

    public ComponentedeCoche(String descripcion, double peso, double coste) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.coste = coste;
    }

    /*Metodos*/

    public void verDatos(){
        System.out.println("Descripcion: "+this.descripcion+".");
        System.out.println("Peso: "+this.peso+"Kg.");
        System.out.println("Coste: "+this.coste+"€.");
    }

}
