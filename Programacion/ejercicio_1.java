import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Menu:");
            System.out.println("1-Calcular Potencias");
            System.out.println("2.-Salir");
            System.out.println("Introduce una opcion.");
            int opciones=sc.nextInt();
            
            if(opciones==1){
            System.out.print("Ingrese la base: ");
            double base = sc.nextDouble();
    
            System.out.print("Ingrese el exponente: ");
            int exponente = sc.nextInt();
    
            double resultado = calcularPotencia(base, exponente);
            System.out.println("El resultado es: " + resultado);      

            }   
            else if(opciones==2){
                break;
            }
        }
}
    public static double calcularPotencia(double base, int exponente){
       
        if (exponente==0){
          return 1;
        }
        else if(exponente>0){
            double resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado=resultado*base;
            }   
            return resultado;     
        }else{
            return 1.0 / calcularPotencia(base, -exponente);
        }
    }
}