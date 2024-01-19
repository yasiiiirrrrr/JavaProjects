package Programacion;
import java.util.Scanner;
import javax.swing.*;
import java.math.*;
public class Bucles3 {
    public static void main(String[] args) {
     //calculo del imc
        Scanner entrada=new Scanner(System.in);
        String genero="";
        do{
            genero=JOptionPane.showInputDialog("Introduce tu genero: ");
        }while(genero.equalsIgnoreCase("Hombre")==false && genero.equalsIgnoreCase("Mujer")==false);
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centimetros: "));
        int peso=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu peso en kilogramos: "));
        double alturam=altura*0.01;
        double imc=(int) ((peso)/(alturam*alturam));
        System.out.println("Tu Indice de Masa Corporal es: " +imc);

        //hombres
        if (genero.equalsIgnoreCase("Hombre") && imc<18.5){
            System.out.println("Estas en situacion de delgadez extrema");
        }
        if (genero.equalsIgnoreCase("Hombre") && imc<24.9 && imc>=18.5){
            System.out.println("Estas en tu peso ideal");
        }
        if (genero.equalsIgnoreCase("Hombre") && imc<29.9 && imc>=25){
            System.out.println("Estas en situacion de sobrepeso");
        }
        if (genero.equalsIgnoreCase("Hombre") && imc<39.9 && imc>=30){
            System.out.println("Estas en situacion de obesidad");
        }
        if (genero.equalsIgnoreCase("Hombre") && imc>40){
            System.out.println("Estas en situacion de obesidad morbida");
        }
        //mujeres
        if (genero.equalsIgnoreCase("Mujer") && imc<18.5){
            System.out.println("Estas en situacion de delgadez extrema");
        }
        if (genero.equalsIgnoreCase("Mujer") && imc<24.9 && imc>=18.5){
            System.out.println("Estas en tu peso ideal");
        }
        if (genero.equalsIgnoreCase("Mujer") && imc<29.9 && imc>=25){
            System.out.println("Estas en situacion de sobrepeso");
        }
        if (genero.equalsIgnoreCase("Mujer") && imc<34.9 && imc>=30){
            System.out.println("Estas en situacion de obesidad");
        }
        if (genero.equalsIgnoreCase("Mujer") && imc>35){
            System.out.println("Estas en situacion de obesidad morbida");
        }
    }

}
