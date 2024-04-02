package ExamenOtraVez2.EJ2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class CarnetSocio {

    /*Atributos*/

    private String nombre;
    private String email;
    private String contraseña;
    private double monedero;
    private LocalDate caducidad;
    private Abono[] abonos;

    /*Constructores*/

    public CarnetSocio(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = generarContraseña();
        this.monedero = 0;
        this.caducidad = LocalDate.now().plusYears(1);
        this.abonos = new Abono[0];
    }

    /*Metodos*/

    public String generarContraseña(){
        String pass="";
        for (int i = 0; i <3 ; i++) {
            pass+=this.nombre.charAt(i);
        }

        pass+=".";

        for (int i = 0; i <3 ; i++) {
            pass+=(int)(Math.random()*10);
        }

        return pass.toLowerCase();
    }

    public void pagarCarnet(){
        this.caducidad=LocalDate.now().plusYears(1);
        this.monedero-=30;
        System.out.println("Carnet pagado con exito!");
    }

    public void cargarMonedero(double cantidad){
        this.monedero+=cantidad;
        System.out.println("Monedero recargado con exito!");
    }

    public Abono[] addAbono(LocalDate fecha, Tipo tipo){

        añadirArrAbono(abonos);
        abonos[abonos.length-1]=new ClasesNatacion(fecha,tipo);
        if (tipo.equals(Tipo.Aquagym)) this.monedero-=30;
        else this.monedero-=20;
        return abonos;
    }

    public Abono[] addAbono(LocalDate fecha, int calle, LocalDateTime hora){

        añadirArrAbono(abonos);
        abonos[abonos.length-1]=new NadoLibre(fecha,calle,hora);
        this.monedero-=2.5;
        return abonos;


    }

    public Abono[] añadirArrAbono(Abono[] arrBase){
        if (abonos==null){
            abonos=new Abono[1];
        }else{
            abonos = Arrays.copyOf(arrBase,arrBase.length+1);
        }
        return abonos;
    }


    public Abono[] nadoLibre(LocalDate fecha){
        int contador=0;
        Abono[] abonosAnteriores = new Abono[abonos.length];
        for (int i = 0; i < abonos.length; i++) {
            if (abonos != null && abonos[i] instanceof NadoLibre && abonos[i].getFecha().isBefore(fecha)){
                abonosAnteriores[contador++]=abonos[i];
            }
        }
        return Arrays.copyOf(abonosAnteriores,contador);
    }

    public void cancelarAbononadoLibre(LocalDate fecha){
        for (int i = 0; i <abonos.length ; i++) {
            if (abonos != null && abonos[i] instanceof NadoLibre && abonos[i].getFecha().isEqual(fecha)){
                abonos[i]=null;
            }
        }
        abonos = Arrays.copyOf(abonos,abonos.length-1);
    }










    /*Getters y Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public double getMonedero() {
        return monedero;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public Abono[] getAbonos() {
        return abonos;
    }

    public void setAbonos(Abono[] abonos) {
        this.abonos = abonos;
    }

    /*toString*/

    @Override
    public String toString() {
        return "CarnetSocio{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", monedero=" + monedero +
                ", caducidad=" + caducidad +
                ", abonos=" + Arrays.toString(abonos) +
                '}';
    }
}
