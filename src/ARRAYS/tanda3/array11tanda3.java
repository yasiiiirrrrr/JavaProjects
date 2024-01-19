package ARRAYS.tanda3;

import java.util.Arrays;
import java.util.Scanner;

public class array11tanda3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ArrLetras[]= new char[5];
        for (int i=0; i<ArrLetras.length; i++){
            System.out.print((i+1)+"1.-Introduce una letra minuscula: ");
            ArrLetras[i]=sc.nextLine().charAt(0);

        }
            if (minusOrdenadas(ArrLetras)){
                System.out.println("Las letras están ordenadas alfabéticamente (minúsculas).");
            }else{
                System.out.println("Las letras NO están ordenadas alfabéticamente (minúsculas).");
            }

            if (minusMayusOrdenadas(ArrLetras)){
                System.out.println("Las letras están ordenadas alfabéticamente (mayúsculas y minúsculas).");
            }else{
                System.out.println("Las letras NO están ordenadas alfabéticamente (mayúsculas y minúsculas).");
            }
    }
    public static boolean minusOrdenadas(char ArrLetras[]){
        boolean ordenadasMinus=true;
        for (int i=0; i<ArrLetras.length-1; i++){
            if(ArrLetras[i]>ArrLetras[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean minusMayusOrdenadas(char ArrLetras[]){
        boolean ordenadasMayusMinus=true;
        String letrasMayusculas = new String(ArrLetras).toUpperCase();
        for (int i=0; i<letrasMayusculas.length()-1; i++){
            if(letrasMayusculas.charAt(i)>letrasMayusculas.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
