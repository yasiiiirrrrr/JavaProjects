package ObjetosEjercicios.Objetos.conductor;
public class conductor {
    public String nombre;
    public byte edad;
    private String DNI;
    private byte antigüedad;
    private String permiso;

    public boolean mayorEdad(){
        if (edad>17)return true;
        else return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public byte getAntigüedad() {
        return antigüedad;
    }

    public void setAntigüedad(byte antigüedad) {
        this.antigüedad = antigüedad;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }
}

