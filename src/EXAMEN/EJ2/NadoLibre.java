package EXAMEN.EJ2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NadoLibre extends Abono{
    private int calle;
    private LocalDateTime hora;
    /*Constructor*/

    public NadoLibre(LocalDate fecha, int calle, LocalDateTime hora) {
        super(2.5, fecha);
        this.calle = calle;
        this.hora = hora;
    }

    public NadoLibre(double precio, int calle, LocalDateTime hora, LocalDate fecha) {
        super(precio,fecha);
        this.calle = calle;
        this.hora = hora;
    }
}
