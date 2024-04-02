package Examen2trimestre;

import java.util.ArrayList;

public class ComisariaPolicia {
    ArrayList <Policia> policias;


    /*Metodos*/
    public void insertarPolicia(Policia p){
        policias.add(p);
    }
    public void insertarMultaPolicia(String codigo, Multa m){
        Policia policia = encontrarPorCodigo(codigo);
        if (policias == null)throw new RuntimeException("No se encontro ningun policia en comisaria");
        if (!(policia instanceof PoliciaTransito)) throw new RuntimeException("El policia no es de transito");
        ((PoliciaTransito) policia).introducirMulta(m);
    }
    public Policia encontrarPorCodigo(String codigo){
        for (int i = 0; i < policias.size(); i++) {
            Policia policia = policias.get(i);
            if (policia.getCodigoPolicia().equals(codigo))return policia;
        }
        return null;
    }

    public String toStringPoliciasYMultasOrdenadoPorCodigo(){
            String resultado = "";
        for (int i = 0; i < policias.size(); i++) {
            for (int j = i+1; j < policias.size(); j++) {
                if (policias.get(i).getCodigoPolicia().compareTo(policias.get(j).getCodigoPolicia())>0){
                    Policia temp = policias.get(i);
                    policias.set(i, policias.get(j));
                    policias.set(j, temp);
                }
            }
        }
        for (int i = 0; i < policias.size(); i++) {
            Policia policia = policias.get(i);
            resultado+="Codigo: "+policia.getCodigoPolicia()+"\nNombre:"+policia.getNombre();
            if (policia instanceof PoliciaTransito){
                int numMultas = ((PoliciaTransito) policia).numeroMultasTotal();
                resultado+="\nNumero de multas: "+numMultas;
            }
            resultado+="\n";
        }
        return resultado;
    }
}
