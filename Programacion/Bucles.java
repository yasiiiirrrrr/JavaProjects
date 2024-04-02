package Programacion;
import javax.swing.*;
public class Bucles {
    public static void main(String[] args) {
        String clave="1234";
        String contraseña="";
        while(clave.equals(contraseña)==false){
            contraseña= JOptionPane.showInputDialog("Introduce la contraseña: ");
            if(clave.equals(contraseña)==false){
                System.out.println("Contraseña Incorrecta");
            }
        }
        System.out.println("¡Contraseña correcta.Acceso permitido!");
    }
}
