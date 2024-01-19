package EjercicioBucles;
import java.util.Scanner;
public class EJ5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingresa un numero long: ");
        long numero= entrada.nextLong();
        if(numero==0){
            System.out.println("Has introducido 0");
        }
        else{
            while(numero>0){
                long cifra=numero % 10;
                System.out.print(cifra+" ");
                numero/=10;
            }
        }

    }
}
