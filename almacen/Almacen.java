package almacen;

public class Almacen {


    /*Atributos*/
    public int ID;
    public double litros;
    public double precio;
    public String marca;

    /*Constructores*/

    public Almacen(int ID, double litros, double precio, String marca) {
        this.ID = ID;
        this.litros = litros;
        this.precio = precio;
        this.marca = marca;
    }

    /*Metodos*/

public double calcularPrecioAlmacen(int precio){
    return this.precio;
}





















    /*Getters y Setters*/

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*toString*/

    @Override
    public String toString() {
        return "Productos{" +
                "ID='" + ID + '\'' +
                ", litros=" + litros +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
