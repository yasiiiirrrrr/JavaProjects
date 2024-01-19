package ObjetosEjercicios.Objetos1.Objetos;

import java.util.Scanner;

public class CocheMain {

    // Variables

    private int ruedas;
    private String matricula;
    private String color;
    private float velocidad;


    //Constructor


    public CocheMain() throws Exception{
        this.ruedas=ruedas;
        if (ruedas<2 || ruedas>6) throw new Exception("Ruedas mal. El numero de ruedas debe de estar comprendido entre 2 y 6.");
        this.matricula=matricula;
        if (matricula.length()>=8) throw  new Exception("Matricula mal. La matricula debe tener una longitud menor o igual que 8.");
        this.color=color;
        this.velocidad=velocidad;
        if (velocidad<0) throw new Exception("Velocidad mal. La velocidad no puede ser menor que 0.");

    }


    //Metodos para leer por teclado


    public static int leerInt(){
        Scanner i= new Scanner(System.in);
        System.out.print("Introduce un numero(int): ");
        return  i.nextInt();
    }
    public static float leerFloat(){
        Scanner f= new Scanner(System.in);
        System.out.print("Introduce un numero(float): ");
        return  f.nextFloat();
    }
    public static String leerString(){
        Scanner s= new Scanner(System.in);
        System.out.print("Introduce una cadena(String): ");
        return  s.nextLine();
    }


    // Métodos principales de la clase


    public static int leerRuedas () {
        int ruedas;
        ruedas = leerInt();
        return ruedas;
    }

    public static String leerMatricula () {
        return leerString();
    }
    public static String leerColor () {
        return leerString();
    }
    public static float leerVelocidad () {
        return leerFloat();
    }

    @Override
    public String toString() {
        return "CocheMain{" +
                "ruedas=" + ruedas +
                ", matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }


    /* ---- MAIN ---- */


    public static void main(String[] args) {

        System.out.println("Inicia programa.");

        CocheMain coche = null;

        try {
            coche = new CocheMain();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println(coche.toString());
        }

    }
}
