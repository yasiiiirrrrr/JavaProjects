package BANCO_JAVA;

import java.util.Scanner;

public class CuentaCorriente {
    private String DNI;
    public String nombre;
    private double saldo;
    private String nombreBanco;
    private Gestor gestor;

    // Constructor para crear cuenta con DNI y nombre del titular
    public CuentaCorriente(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = 0;
        this.nombreBanco = "BANCO SANTANDER"; // Nombre por defecto
        this.gestor = new Gestor(); // Gestor con valores predeterminados
    }

    // Constructor sobrecargado para crear cuenta con DNI, nombre y saldo
    public CuentaCorriente(String DNI, String nombre, double saldo) {
        this(DNI, nombre); // Llamamos al constructor anterior
        this.saldo = saldo;
    }

    // Métodos de la clase CuentaCorriente

    public void sacarDinero(double cantidad) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad que desees retirar: ");
        cantidad = sc.nextDouble();
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retirando " + cantidad + "€...\nSe han retirado " + cantidad + "€ con éxito.\nSu saldo restante es de " + saldo + "€.");
        } else {
            System.out.println("Saldo Insuficiente. Por favor, ingrese dinero.");
        }
    }

    public void ingresarDinero(double cantidad) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad que desees ingresar: ");
        cantidad = sc.nextDouble();
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Ingresando " + cantidad + "€...\nSe han ingresado " + cantidad + "€ con éxito.\nSu saldo es de " + saldo + "€.");
        } else {
            System.out.println("Ingrese un valor válido.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("========================================");
        System.out.println("|            " + nombreBanco + "             |");
        System.out.println("|======================================|");
        System.out.println("|   Nombre: " + nombre + "             |");
        System.out.println("|   DNI: " + DNI + "             |");
        System.out.println("|   Saldo: " + saldo + "€             |");
        System.out.println("|======================================|");
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nuevoNombreBanco) {
        nombreBanco = nuevoNombreBanco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    // Creamos un método para mostrar el menú
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========================================");
            System.out.println("|           BANCO SANTANDER            |");
            System.out.println("|======================================|");
            System.out.println("|1.-Crear Cuenta.                      |");
            System.out.println("|2.-Retirar Dinero.                    |");
            System.out.println("|3.-Ingresar Dinero.                   |");
            System.out.println("|4.-Mostrar Informacion.               |");
            System.out.println("|5.-Salir.                             |");
            System.out.println("|======================================|");
            System.out.print("Ingrese el número de la opción deseada: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // No es necesario llamar a CrearCuenta() aquí, ya que la cuenta se crea en el constructor.
                    System.out.println("Cuenta ya creada. Utiliza las opciones de retiro, ingreso o consulta.");
                    break;
                case 2:
                    sacarDinero(saldo);
                    break;
                case 3:
                    ingresarDinero(saldo);
                    break;
                case 4:
                    mostrarInformacion();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número válido.");
            }
        }
    }
}
