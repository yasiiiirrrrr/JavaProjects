package Examen2trimestre;

public abstract class Policia implements Comparable<Policia>{

    /*Atributos*/

   private String codigoPolicia;
   private String nombre;
   private double sueldoBase;

   /*Constructor*/

    public Policia(String nombre) {
        this.codigoPolicia = generarCodigo();
        this.nombre = nombre;
        this.sueldoBase = 1750;
    }



    /*Metodos*/

    private String generarCodigo(){
        String pass = "";
        pass+=(int) (Math.random()*100000);
        return pass;
    }

    /*Getters y Setters*/

    public String getCodigoPolicia() {
        return codigoPolicia;
    }

    public void setCodigoPolicia(String codigoPolicia) {
        this.codigoPolicia = codigoPolicia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public int compareTo(Policia o) {
        return this.codigoPolicia.compareTo(o.getCodigoPolicia());
    }

    /*toString*/

    @Override
    public String toString() {
        return "Policia{" +
                "codigoPolicia='" + codigoPolicia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldoBase=" + sueldoBase +
                '}';
    }
}
