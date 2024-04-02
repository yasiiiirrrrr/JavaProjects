package EjerciciosColecciones.EJBARAJA_CARTAS;

import java.util.ArrayList;

public class BarajaEspañola extends Baraja<PalosBarajaEspañola>{
    private ArrayList<Carta<PalosBarajaEspañola>> baraja;

    public BarajaEspañola() {
        super(40, 10);
        baraja = new ArrayList<>();
    }

    @Override
    public void crearBaraja() {
        for (int i = 0; i < PalosBarajaEspañola.values().length; i++) {
            for (int j = 1; j <= this.numeroCartasPalo; j++) {
                String valor = "";
                if (j == 10) valor = "Sota";
                else if (j == 11) valor = "Caballo";
                else if (j == 12) valor = "Rey";
                else if (j == 1) valor = "As";
                else valor = String.valueOf(j); // Para los valores numéricos entre 2 y 9
                baraja.add(new Carta<>(PalosBarajaEspañola.values()[i], valor));
            }
        }
    }

    @Override
    public void SacarCartaAzar() {
        if (baraja.isEmpty()) {
            System.out.println("La baraja está vacía.");
            return;
        }

        int indiceAleatorio = (int) (Math.random() * baraja.size());
        Carta<PalosBarajaEspañola> carta = baraja.get(indiceAleatorio);
        carta.setRepartida(true);
        baraja.remove(indiceAleatorio);
        System.out.println(carta);
    }

    @Override
    public void SacarCarta(int numero) {
        if (baraja.isEmpty()) {
            System.out.println("La baraja está vacía.");
            return;
        }

        if (numero < 0 || numero >= baraja.size()) {
            System.out.println("Número de carta inválido.");
            return;
        }

        Carta<PalosBarajaEspañola> carta = baraja.get(numero);
        if (carta.isRepartida()) {
            System.out.println("Esta carta ya ha sido repartida.");
            return;
        }

        carta.setRepartida(true);
        baraja.remove(numero);
        System.out.println("Carta sacada: " + carta);
    }

    @Override
    public void BarajarCarta() {
        if (baraja.isEmpty()) {
            System.out.println("La baraja está vacía.");
        }

        for (int i = 0; i < baraja.size(); i++) {
            int indiceAleatorio = (int) (Math.random()* baraja.size()-1);

            Carta<PalosBarajaEspañola> cartaActual = baraja.get(i);
            Carta<PalosBarajaEspañola> cartaAleatoria = baraja.get(indiceAleatorio);

            baraja.set(i, cartaAleatoria);
            baraja.set(indiceAleatorio, cartaActual);

        }
        System.out.println("La baraja ha sido barajada con exito!.");
    }

    @Override
    public void MostarRepartidas() {
        ArrayList <Carta>cartasRepartidas = new ArrayList<>();
        if (baraja.isEmpty()) {
            System.out.println("La baraja está vacía.");
        }
        System.out.println("Cartas repartidas: ");
        for (int i = 0; i < baraja.size()-1; i++) {
            Carta<PalosBarajaEspañola> carta = baraja.get(i);
            if (carta.isRepartida()){
                cartasRepartidas.add(carta);
            }
        }
        System.out.println(cartasRepartidas);
    }
}
