package EjercicioBucles;

public class EJBUCLES4 {
    public static void main(String[] args) {
        long numero=985412L, numero2;
        numero2=numero;
        long contador=1;
        while(numero2>=10){
            numero2=numero/contador;
            contador=contador*10;
        }
        for(long x=contador; x>=10; x=x/10){
            System.out.print(numero/x+" ");
        }
    }
}
