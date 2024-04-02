package ExamenOtraVez2.EJ2;

import java.time.LocalDate;

public class ClasesNatacion extends Abono{

    /*Atributos*/

    protected Tipo tipo;

    /*Constructores*/

    public ClasesNatacion(LocalDate fecha, Tipo tipo) {
        super(0, fecha);
        if (tipo.equals(Tipo.Aquagym)) super.precio=30;
        else super.precio=20;
        this.tipo = tipo;
    }

    /*Getters y Setters*/

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /*toString*/

    @Override
    public String toString() {
        return "ClasesNatacion{" +
                "tipo=" + tipo +
                ", precio=" + precio +
                '}';
    }
}
