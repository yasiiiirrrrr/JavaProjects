package Examen2trimestre;

import java.time.DayOfWeek;
import java.util.ArrayList;

public class PoliciaTransito extends Policia implements InterfazMultas{

    private ArrayList<Multa> multas;
    /*Constructor*/
    public PoliciaTransito(String nombre) {
        super(nombre);
        this.setCodigoPolicia("T-"+this.getCodigoPolicia());
        this.multas = new ArrayList<>();
    }

    /*Metodos*/

    private void actualizarSueldo(){
        double totalMultas = 0;

        for (int i = 0; i < multas.size(); i++) {
            totalMultas+=multas.get(i).getImporteMulta();
        }
        double incrementoSueldo = totalMultas * 0.10;
        if (incrementoSueldo > 800) incrementoSueldo=800;
        this.setSueldoBase(this.getSueldoBase()+incrementoSueldo);

    }
    /*Metodos Interfaz*/
    @Override
    public void introducirMulta(Multa m) {
        multas.add(m);
    }

    @Override
    public int numeroMultasTotal() {
        return multas.size();
    }

    @Override
    public int numeroMultas(DayOfWeek dia) {
        int numMultas = 0;
        for (int i = 0; i < multas.size(); i++) {
            if (multas.get(i).getFecha().getDayOfWeek()==dia) numMultas++;
        }
        return numMultas;
    }

    @Override
    public int numeroMultas(String tipomulta) {
        int numMultas = 0;
        for (int i = 0; i < multas.size(); i++) {
            if (multas.get(i).getTipoMulta().toString().equals(tipomulta)) numMultas++;
        }
        return numMultas;
    }
}
