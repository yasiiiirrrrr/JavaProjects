package herenciasProductos;

public class Producto {
    public double precio;
    public String nombre;


    /*Constructores*/

    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    /*Getters y Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /*Metodos*/

    public double calcularPrecio(int cantidad){
        return this.precio*cantidad;
    }

    /*toString*/

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
