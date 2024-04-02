package herenciasProductos;

public class noPerecedero extends Producto {
    public String tipo;

    /*Constructor*/
    public noPerecedero(double precio, String nombre, String tipo) {
        super(precio, nombre);
        this.tipo=tipo;
    }

    /*Getters y Setters*/

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /*toString*/
    @Override
    public String toString() {
        return "noPerecedero{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
