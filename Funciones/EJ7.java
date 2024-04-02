package Funciones;

public class EJ7 {
    public static void main(String[] args) {
      /*  factorizar(12);
        factorizar(11);
        factorizar(35);
        factorizar(40);*/
        for (int x=1; x<=5; x++){
            imprimirLinea(x);
        }

    }
    public static void imprimirLinea(int linea){
        String cadena="";
        int posicionInicial=5-linea;
        for(int i=0; i<=posicionInicial;i++){
            cadena+=" ";
        }
        for (int i=1; i<=linea;i++){
            cadena+="* ";
        }
        System.out.print(cadena);
    }
}
