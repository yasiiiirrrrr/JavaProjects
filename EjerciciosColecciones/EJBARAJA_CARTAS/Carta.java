package EjerciciosColecciones.EJBARAJA_CARTAS;

public class Carta <T>{

    /*Atributos*/
    protected T tipoPalo;
    protected boolean repartida;
    protected String valor;


    /*Constructor*/

    public Carta(T tipoPalo, String Valor) {
        this.tipoPalo = tipoPalo;
        this.repartida = false;
        this.valor = Valor;
    }

    /*Getters y Setters*/

    public T getTipoPalo() {
        return tipoPalo;
    }

    public void setTipoPalo(T tipoPalo) {
        this.tipoPalo = tipoPalo;
    }

    public boolean isRepartida() {
        return repartida;
    }

    public void setRepartida(boolean repartida) {
        this.repartida = repartida;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String colorBlue = "\u001B[34m";
        String colorCyan = "\u001B[36m";
        String colorYellow = "\u001B[33m";
        String colorReset = "\u001B[0m";

        String cartaHeader = colorBlue +
                "\n ╔══════════════════════════════════════╗" +
                "\n ║" + colorCyan + "              Carta              " + colorBlue + "     ║\n" +
                " ╚══════════════════════════════════════╝\n";

        String cartaContent = colorBlue +
                " ╔══════════════════════════════════════╗\n" +
                " ║    Palo=" + colorYellow + this.tipoPalo + colorBlue + "                     ║\n" +
                " ║    Repartida=" + colorYellow + this.repartida + colorBlue + "                    ║\n" +
                " ║    Valor=" + colorYellow + this.valor + colorBlue + "                           ║" +
                "\n ╚══════════════════════════════════════╝\n";

        return cartaHeader + cartaContent + colorReset;
    }



}
