package ExamenOtraVez2.EJ1;

public class PuertaCoche extends ComponentedeCoche implements Alarma, PuertaBloqueable {

    /*Atributos*/

    private boolean estaBloqueada;
    private boolean estaCerrado;
    private boolean alarmaActivada;

    /*Constructor*/

    public PuertaCoche(String descripcion, double peso, double coste, boolean estaBloqueada, boolean estaCerrado, boolean alarmaActivada) {
        super(descripcion, peso, coste);
        this.estaBloqueada = estaBloqueada;
        this.estaCerrado = estaCerrado;
        this.alarmaActivada = alarmaActivada;
    }

    public PuertaCoche(String descripcion, double peso, double coste) {
        super(descripcion, peso, coste);
    }


    /*Metodos*/

    @Override
    public void abrir() {
        this.estaCerrado=false;
        System.out.println("===Puerta Abierta=== ");
    }

    @Override
    public void cerrar() {
        this.estaCerrado=true;
        System.out.println("===Puerta Cerrada=== ");
    }

    @Override
    public void activarAlarma() {
        this.alarmaActivada=true;
        System.out.println("===Alarma Activada=== ");
    }

    @Override
    public void desactivarAlarma() {
        this.alarmaActivada=false;
        System.out.println("===Alarma Desactivada=== ");
    }

    @Override
    public void bloquear() {
        this.estaBloqueada=true;
        System.out.println("===Puerta Bloqueada=== ");
    }

    @Override
    public void desbloquear() {
        this.estaBloqueada=false;
        System.out.println("===Puerta Desbloqueada=== ");
    }
}
