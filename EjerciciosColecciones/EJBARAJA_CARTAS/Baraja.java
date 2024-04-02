package EjerciciosColecciones.EJBARAJA_CARTAS;

public abstract class Baraja <T>{

        /*Atributos*/
    protected int numeroCartas;
    protected int numeroCartasPalo;

        /*Constructor*/

    public Baraja(int numeroCartas, int numeroCartasPalo) {
        this.numeroCartas = numeroCartas;
        this.numeroCartasPalo = numeroCartasPalo;
    }
    public abstract void crearBaraja();
    public abstract void SacarCartaAzar();
    public abstract void SacarCarta(int numero);
    public abstract void BarajarCarta();
    public abstract void MostarRepartidas();



}
