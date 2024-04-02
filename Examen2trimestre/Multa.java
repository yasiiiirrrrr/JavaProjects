package Examen2trimestre;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Multa{

    /* Atributos */
    private static int numeroMultas = 100;
    private String codigoMulta;
    private double importeMulta;
    private LocalDate fecha;
    private TipoMulta tipoMulta;

    /* Constructor */
    public Multa(double importeMulta, TipoMulta tipoMulta) {
        this.codigoMulta = "M-" + numeroMultas;
        this.importeMulta = importeMulta;
        this.fecha = LocalDate.now();
        this.tipoMulta = tipoMulta;
    }

    /*Getters y Setters*/

    public static int getNumeroMultas() {
        return numeroMultas;
    }

    public static void setNumeroMultas(int numeroMultas) {
        Multa.numeroMultas = numeroMultas;
    }

    public String getCodigoMulta() {
        return codigoMulta;
    }

    public void setCodigoMulta(String codigoMulta) {
        this.codigoMulta = codigoMulta;
    }

    public double getImporteMulta() {
        return importeMulta;
    }

    public void setImporteMulta(double importeMulta) {
        this.importeMulta = importeMulta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoMulta getTipoMulta() {
        return tipoMulta;
    }

    public void setTipoMulta(TipoMulta tipoMulta) {
        this.tipoMulta = tipoMulta;
    }

    /*toString*/

    @Override
    public String toString() {
        return "Multa{" +
                "codigoMulta='" + codigoMulta + '\'' +
                ", importeMulta=" + importeMulta +
                ", fecha=" + fecha +
                ", tipoMulta=" + tipoMulta +
                '}';
    }
}
