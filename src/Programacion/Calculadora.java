package Programacion;
import javax.swing.*;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        String genero="";
        do{
            genero=JOptionPane.showInputDialog("Introduce tu genero: ");
        }while(genero.equalsIgnoreCase("Hombre")==false && genero.equalsIgnoreCase("Mujer")==false);
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centimetros: "));
        int peso=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu peso en kilogramos: "));
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
        double alturam=altura*0.01;

        //ecuacion de Harris-Benedict
        double tmb=(655+9.6*peso+1.8*alturam-4.7*edad);

        System.out.println("\u001B[45m\u001B[1m\u001B[30m➜Tus calorias de mantenimiento son "+String.format("%.2f",tmb)+"kcal.\u001B[0m");


        int actividad_fisica;
            actividad_fisica=Integer.parseInt(JOptionPane.showInputDialog("1. Poco o ningun ejercicio.\n2. Ejercicio ligero unas cuantas veces a la semana\n" +
                    "3. Ejercicio moderado de 3 a 5 veces a la semana\n"+"4. Ejercicio intenso 6-7 veces por semana\n"+
                    "Introduce tu nivel de actividad fisica: "));
            if (actividad_fisica==1){
                double calorias_diarias=1.2*tmb;
                System.out.println("\u001B[46m\u001B[1m\u001B[30m➜Tus calorias diarias recomendadas son "+String.format("%.2f",calorias_diarias)+"kcal.\u001B[0m");
                System.out.println("\u001B[31m\uD83E\uDD69Proteinas: "+String.format("%.2f",(calorias_diarias*0.4)/4)+"g.");
                System.out.println("\u001B[32m\uD83C\uDF3ECarbohidratos: "+String.format("%.2f",(calorias_diarias*0.3)/4)+"g.");
                System.out.println("\u001B[33m\uD83E\uDD51Grasas: "+String.format("%.2f",(calorias_diarias*0.3)/9)+"g.");
            }
            if (actividad_fisica==2){
                double calorias_diarias=1.375*tmb;
                System.out.println("\u001B[46m\u001B[1m\u001B[30m➜Tus calorias diarias recomendadas son "+String.format("%.2f",calorias_diarias)+"kcal.\u001B[0m");
                System.out.println("\u001B[31m\uD83E\uDD69Proteinas: "+String.format("%.2f",(calorias_diarias*0.4)/4)+"g.");
                System.out.println("\u001B[32m\uD83C\uDF3ECarbohidratos: "+String.format("%.2f",(calorias_diarias*0.3)/4)+"g.");
                System.out.println("\u001B[33m\uD83E\uDD51Grasas: "+String.format("%.2f",(calorias_diarias*0.3)/9)+"g.");
            }
            if (actividad_fisica==3){
                double calorias_diarias=1.55*tmb;
                System.out.println("\u001B[46m\u001B[1m\u001B[30m➜Tus calorias diarias recomendadas son "+String.format("%.2f",calorias_diarias)+"kcal.\u001B[0m");
                System.out.println("\u001B[31m\uD83E\uDD69Proteinas: "+String.format("%.2f",(calorias_diarias*0.4)/4)+"g.");
                System.out.println("\u001B[32m\uD83C\uDF3ECarbohidratos: "+String.format("%.2f",(calorias_diarias*0.3)/4)+"g.");
                System.out.println("\u001B[33m\uD83E\uDD51Grasas: "+String.format("%.2f",(calorias_diarias*0.3)/9)+"g.");
            }
            if (actividad_fisica==4){
                double calorias_diarias=1.725*tmb;
                System.out.println("\u001B[46m\u001B[1m\u001B[30m➜Tus calorias diarias recomendadas son "+String.format("%.2f",calorias_diarias)+"kcal.\u001B[0m");
                System.out.println("\u001B[31m\uD83E\uDD69Proteinas: "+String.format("%.2f",(calorias_diarias*0.4)/4)+"g.");
                System.out.println("\u001B[32m\uD83C\uDF3ECarbohidratos: "+String.format("%.2f",(calorias_diarias*0.3)/4)+"g.");
                System.out.println("\u001B[33m\uD83E\uDD51Grasas: "+String.format("%.2f",(calorias_diarias*0.3)/9)+"g.");
            }












    }
}
