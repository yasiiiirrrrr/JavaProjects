package almacen;

public class AguaMineral extends Almacen {
    protected String manantial;

    /*Constructores*/

    public AguaMineral(int ID, double litros, double precio, String marca, String manantial) {
        super(ID, litros, precio, marca);
        this.manantial = manantial;
    }

    /*Getters y Setters*/

    public String getManantial() {
        return manantial;
    }

    public void setManantial(String manantial) {
        this.manantial = manantial;
    }


    /*Metodos*/



    /*toString*/

    @Override
    public String toString() {
        return "AguaMineral{" +
                "manantial='" + manantial + '\'' +
                ", ID='" + ID + '\'' +
                ", litros=" + litros +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}

