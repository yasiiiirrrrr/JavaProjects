package BANCO_JAVA;

public class Gestor {
    public String nombre;
    private String telefono;
    private double importeMaximoAutorizado;

    // Constructor con valores predeterminados
    public Gestor() {
        this.importeMaximoAutorizado = 10000;
    }

    // Constructor para asignar nombre y teléfono
    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximoAutorizado = 10000;

    }


    // Getter para el teléfono
    public String getTelefono() {
        return telefono;
    }

    // Método para mostrar información del gestor
    public void mostrarInformacionGestor() {
        System.out.println("Información del Gestor:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Importe Máximo Autorizado: " + importeMaximoAutorizado + "€");
    }
}
