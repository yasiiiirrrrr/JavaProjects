package Funciones;
import java.util.Scanner;

public class agencia {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("MENU");
            System.out.println("1.CALCULAR TU SALARIO.");
            System.out.println("2.SALIR");           
            int opciones=sc.nextInt();
            if (opciones==1) {
                System.out.print("Introduce el numero de autos vendidos: ");
                int autosVendidos=sc.nextInt();
                System.out.println("Has vendido "+autosVendidos+" autos.");
                System.out.print("Introduce el monto de las ventas de los autos vendidos: ");
                double montoVentas=sc.nextInt();
                System.out.println("Has hecho un total de "+montoVentas+"€ en ventas.");
                double salarioVendedor = salario(montoVentas, autosVendidos);
                System.out.println("Tu salario sera de "+salarioVendedor+"€ este mes.");
            }
            else if (opciones==2) {
              System.out.println("Saliendo...");
                break;
            }
        }
    

    }
        public static double salario(double montoVentas, int autosVendidos){  
             double salarioBase=800;
             double comisionPorauto=170;
             double porcerntajeAuto=0.05;
             double comision= autosVendidos*comisionPorauto;
             double comisionVentas=montoVentas*porcerntajeAuto;
             double salarioTotal=salarioBase+comision+comisionVentas;
            return salarioTotal;
        }
}
