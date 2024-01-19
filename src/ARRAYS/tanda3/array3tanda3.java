package ARRAYS.tanda3;

import java.util.Arrays;
import java.util.Scanner;

public class array3tanda3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double ArrNum[]= new double[10];
        int contadorImp=0;
        int contadorPar=0;
        for (int i=0; i<ArrNum.length; i++){
            System.out.println("Introduce el numero que desees almacenar en el array: ");
            double numero=sc.nextDouble();
            ArrNum[i]=numero;
            if (esPar(numero)){
                contadorPar++;
            }
            if (esImpar(numero)) {
                contadorImp++;
            }
        }
        System.out.println("Has introducido "+ Arrays.toString(ArrNum)+" , hay "+contadorImp+" numeros impares y "+contadorPar+" numeros pares");
    }
    public static boolean esPar(double numero){
        if (numero/2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean esImpar(double numero){
        if (numero/2!=0){
            return true;
        }
        else{
            return false;
        }
    }
}
