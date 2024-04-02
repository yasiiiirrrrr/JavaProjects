package Examen2trimestre;

import java.time.DayOfWeek;

public interface InterfazMultas {
    void introducirMulta(Multa m);
    int numeroMultasTotal();
    int numeroMultas(DayOfWeek dia);
    int numeroMultas(String tipomulta);
}
