package EjerciciosColecciones.EJBARAJA_CARTAS;

import java.util.ArrayList;

public class BarajaPoker extends Baraja<PalosBarajaPoker>{
    private ArrayList<Carta<PalosBarajaPoker>> baraja;

    public BarajaPoker() {
        super(54, 13);
        baraja = new ArrayList<>();
    }

    @Override
    public void crearBaraja() {
        for (int i = 0; i < PalosBarajaPoker.values().length; i++) {
            for (int j = 1; j <= this.numeroCartasPalo; j++) {
                String valor = "";
                if (j == 11) valor = "Jota";
                else if (j == 12) valor = "Reina";
                else if (j == 13) valor = "Rey";
                else if (j == 1) valor = "As";
                baraja.add(new Carta<>(PalosBarajaPoker.values()[i], valor));
            }
        }
    }

    @Override
    public void SacarCartaAzar() {
        if (baraja.isEmpty()) {
            System.out.println("La baraja está vacía.");
        }
        int indiceAleatorio = (int) (Math.random()* baraja.size());
        Carta <PalosBarajaPoker> carta = baraja.get(indiceAleatorio);
        carta.setRepartida(true);
        baraja.remove(indiceAleatorio);
        System.out.println(carta);
    }

    @Override
    public void SacarCarta(int numero) {
        Carta <PalosBarajaPoker> carta = baraja.get(numero);
        if (baraja.isEmpty()) {
            System.out.println("La baraja está vacía.");
        }
        if (numero < 0 || numero >= baraja.size()) {
            System.out.println("Número de carta inválido.");
        }
        if (carta.isRepartida()){
            System.out.println("Esta carta ya ha sido repartida.");
        }
        carta.setRepartida(true);
        baraja.remove(numero);
        System.out.println(carta+" Eliminada.");
    }

    @Override
    public void BarajarCarta() {
        if (baraja.isEmpty()) {
            System.out.println("La baraja está vacía.");
        }

        for (int i = 0; i < baraja.size()-1; i++) {
            int indiceAleatorio = (int) (Math.random()* baraja.size());

            Carta<PalosBarajaPoker> cartaActual = baraja.get(i);
            Carta<PalosBarajaPoker> cartaAleatoria = baraja.get(indiceAleatorio);

            baraja.set(i, cartaAleatoria);
            baraja.set(indiceAleatorio, cartaActual);

        }
        System.out.println("La baraja ha sido barajada con exito!.");
    }

    @Override
    public void MostarRepartidas() {
        if (baraja.isEmpty()) {
            System.out.println("La baraja está vacía.");
        }
        System.out.println("Cartas repartidas: ");
        for (int i = 0; i < baraja.size()-1; i++) {
            Carta<PalosBarajaPoker> carta = baraja.get(i);
            if (carta.isRepartida()){
                System.out.println(carta);
            }
        }
    }

}
