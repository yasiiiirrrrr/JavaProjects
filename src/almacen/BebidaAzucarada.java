package almacen;

public class BebidaAzucarada extends Almacen {

    protected double porcentajeAzucar;

    /*Constructores*/

    public BebidaAzucarada(int ID, double litros, double precio, String marca, double porcentajeAzucar) {
        super(ID, litros, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
    }

    /*Metodos*/

    public String promocion(double total){
        total=+this.precio*0.9;
        return "Descuento Aplicado: "+total+"€. ";
    }

    /*toString*/

    @Override
    public String toString() {
        return "BebidaAzucarada{" +
                "porcentajeAzucar=" + porcentajeAzucar +
                ", ID='" + ID + '\'' +
                ", litros=" + litros +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
