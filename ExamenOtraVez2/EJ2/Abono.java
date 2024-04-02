package ExamenOtraVez2.EJ2;

import java.time.LocalDate;

public abstract class Abono {

    /*Atributos*/

    protected double precio;
    private LocalDate fecha;

    /*Constructores*/

    public Abono(double precio, LocalDate fecha) {
        this.precio = precio;
        this.fecha = fecha;
    }

    /*Getters y Setters*/

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /*toString*/

    @Override
    public String toString() {
        return "Abono{" +
                "precio=" + precio +
                ", fecha=" + fecha +
                '}';
    }
}
