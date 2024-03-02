package EXAMEN.EJ2;

import java.time.LocalDate;

public abstract class Abono {
    protected double precio;
    private LocalDate fecha;

    /*Construcor*/

    public Abono(double precio, LocalDate fecha) {
        this.precio = precio;
        this.fecha = fecha;
    }

}
