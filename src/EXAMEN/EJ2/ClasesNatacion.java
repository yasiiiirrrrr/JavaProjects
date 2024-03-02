package EXAMEN.EJ2;

import java.time.LocalDate;

public class ClasesNatacion extends Abono {
    private Tipo tipo;

    /*Constructor*/

    public ClasesNatacion(LocalDate fecha, Tipo tipo) {
        super(0, fecha);
        if (tipo.equals(Tipo.Aquagym)){super.precio=30;}
        else{super.precio=20;}
        this.tipo = tipo;
    }
}
