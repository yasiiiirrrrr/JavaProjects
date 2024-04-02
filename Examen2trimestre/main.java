package Examen2trimestre;

public class main {
    public static void main(String[] args) {
       ComisariaPolicia comisariaPolicia = new ComisariaPolicia();
       PoliciaTransito Jose = new PoliciaTransito("Jose");
       PoliciaTransito Juan= new PoliciaTransito("Juan");
       JefePolicia Miguel = new JefePolicia("Miguel");
       JefePolicia Antonio= new JefePolicia("Antonio");

        comisariaPolicia.insertarPolicia(Jose);
        comisariaPolicia.insertarPolicia(Juan);
        comisariaPolicia.insertarPolicia(Miguel);
        comisariaPolicia.insertarPolicia(Antonio);


       Multa multa1 = new Multa(200, TipoMulta.VELOCIDAD);
       Jose.introducirMulta(multa1);


    }
}
