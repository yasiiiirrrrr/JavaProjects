package ObjetosEjercicios.Objetos1.Objetos;

public class Coche {
    private int ruedas;
    private String matricula;
    private String color;
    private float velocidad;
    //Constructores.
    public Coche(int ruedas, String matricula, String color, float velocidad) throws Exception{
        this.ruedas=ruedas;
        if (ruedas<2 || ruedas>6) throw new Exception("Introduce un valor valido. El numero de ruedas debe de estar comprendido entre 2 y 6.");
        this.matricula=matricula;
        if (matricula.length()>=8) throw  new Exception("Introduce un valor valido. La matricula debe tener una longitud menor o igual que 8.");
        this.color=color;
        this.velocidad=velocidad;
        if (velocidad<0) throw new Exception("Introduce un valor valido. La velocidad no puede ser menor que 0.");
    }
    //Getters y Setters


    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    //To String
    @Override
    public String toString(){
        return "Coche{" +
                "ruedas = "+ruedas+
                "Color = "+color+
                "Velocidad"+velocidad+
                "}";

    }
}
