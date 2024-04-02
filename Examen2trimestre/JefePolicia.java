package Examen2trimestre;

public class JefePolicia extends Policia{

    /*Constructor*/

    public JefePolicia(String nombre) {
        super(nombre);
        this.setCodigoPolicia("J-"+this.getCodigoPolicia());
        this.setSueldoBase(this.getSueldoBase()+1000);
    }

}
