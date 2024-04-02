package ExamenOtraVez2.EJ2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NadoLibre extends Abono {

    /*Atributos*/

    private int calle;
    private LocalDateTime hora;

    /*Constructores*/

    public NadoLibre(LocalDate fecha, int calle, LocalDateTime hora) {
        super(2.5, fecha);
        this.calle = calle;
        this.hora = hora;
    }

    public NadoLibre(double precio, LocalDate fecha, int calle, LocalDateTime hora) {
        super(precio, fecha);
        this.calle = calle;
        this.hora = hora;
    }

    /*Metodos*/


    /*Getters y Setters*/

    public int getCalle() {
        return calle;
    }

    public void setCalle(int calle) {
        this.calle = calle;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    /*toString*/

    @Override
    public String toString() {
        return "NadoLibre{" +
                "calle=" + calle +
                ", hora=" + hora +
                '}';
    }
}
