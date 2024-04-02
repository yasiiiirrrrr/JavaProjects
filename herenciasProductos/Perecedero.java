package herenciasProductos;

public class Perecedero extends Producto {
    private int caducidad; //Dias que faltan para que caduque el producto
    /*Constructor*/
    public Perecedero(double precio, String nombre) {
        super(precio, nombre);
        caducidad=0;
    }
    public Perecedero(double precio, String nombre, int caducidad) {
        super(precio, nombre);
        this.caducidad=caducidad;
    }


    /*Getters y Setters*/

    public int getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }

    /*toString*/

    @Override
    public String toString() {
        return "Perecedero{" +
                "caducidad=" + caducidad +
                '}';
    }
}
