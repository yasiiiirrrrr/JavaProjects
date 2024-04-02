package ARRAYS;
import javax.swing.*;
import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        
        System.out.println(funcionSecundaria(0)+"\n");
        System.out.println(funcionTerciaria(0)+"\n");
        System.out.println(funcionCuaternaria(0)+"\n");

    }
 

public static Integer funcionSecundaria(int numero){
    String [] paises={"Butan", "Kirguistan" , "Yibuti" , "Liberia" , "Nepal" , "Islas Feroe" , "Mozambique" , "Micronesia"};
    
      for(int i=0; i<paises.length; i++){
        System.out.println("Pais "+(i+1)+" "+paises[i]);
      }
return numero;

}
public static Integer funcionTerciaria(int numero){
        Scanner sc=new Scanner(System.in);
        String [] paises=new String[8];
    // bucle for mejorado
    for(int i=0; i<paises.length;i++){
        System.out.println("Introduce pais: "+(i+1));
        paises[i]=sc.nextLine();
    }

    for(String elemento:paises){
        System.out.println("Pais: "+(elemento)+".");
    }
return numero;

}

public static Integer funcionCuaternaria(int numero3){
       int[] matriz_random=new int[150];
    for(int i=0; i<matriz_random.length; i++){
        matriz_random[i]=(int)Math.round(Math.random()*100);
    }
    for(int numero:matriz_random){
        System.out.print(numero+" ");
    }
    
return numero3;
}
}



