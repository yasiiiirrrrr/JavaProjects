package EXAMEN.EJ2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CarnetSocio {
    private String Nombre;
    private String email;
    private String contraseña;
    private double monedero;
    private LocalDate caducidad;
    private ArrayList<Abono> abonos= new ArrayList<Abono>();


    /*Constructor*/

    public CarnetSocio(String Nombre, String email) {
        this.Nombre = Nombre;
        this.email = email;
        this.contraseña=generarContraseña();
        this.caducidad=LocalDate.now().plusYears(1);

    }
    /*Metodos*/

    public String generarContraseña(){
        String pass = "";
        for (int i = 0; i < 3; i++) {
            pass+=this.Nombre.charAt(i);

        }
        pass+=".";
        for (int i = 0; i < 3; i++) {
            pass+=(int)(Math.random()*10);

        }
        return pass;
    }
    public void pagarCarnet(){
        this.monedero-=30;
        this.caducidad=LocalDate.now().plusYears(1);
    }
    public void cargarMonedero(double cantidad){
        this.monedero+=cantidad;
    }
    public boolean caducado(){
        return LocalDate.now().isAfter(caducidad);
    }
    public void addAbono(LocalDate fecha, LocalDateTime hora, int calle){
        abonos.add(new NadoLibre(fecha,calle,hora) );
        this.monedero-=2.5;
    }
    /*toString*/
    @Override
    public String toString() {
        return "CarnetSocio{" +
                "Nombre='" + Nombre + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", monedero=" + monedero +
                ", caducidad=" + caducidad +
                ", abonos=" + abonos +
                '}';
    }
}
