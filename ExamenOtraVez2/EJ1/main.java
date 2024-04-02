package ExamenOtraVez2.EJ1;


public class main {
    public static void main(String[] args) {
        PuertaCoche puertaTrasera = new PuertaCoche("Puerta Trasera",120,200);

        puertaTrasera.verDatos();
        puertaTrasera.abrir();
        puertaTrasera.cerrar();
        puertaTrasera.bloquear();
        puertaTrasera.desbloquear();
        puertaTrasera.activarAlarma();
        puertaTrasera.desactivarAlarma();



    }
}
