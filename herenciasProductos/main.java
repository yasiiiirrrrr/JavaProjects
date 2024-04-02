package herenciasProductos;

public class main {
    public static void main(String[] args) {
        Perecedero [] perecederos=new Perecedero[5];
        noPerecedero [] noPerecederos=new noPerecedero[5];

                                /*Productos Perecederos*/
        /*=====================================================================================*/
        Perecedero leche = new Perecedero(1.5,"Leche",2);      perecederos[0]=leche;
        Perecedero huevos = new Perecedero(2, "Huevos", 1);   perecederos[1]=huevos;
        Perecedero yogurt = new Perecedero(1.7, "Yogurt", 3);  perecederos[2]=yogurt;
        Perecedero filete = new Perecedero(6, "Filete", 4);    perecederos[3]=filete;
        Perecedero queso = new Perecedero(1.26, "Queso", 5);   perecederos[4]=queso;

        /*======================================================================================*/
                                /*Productos no Perecederos*/
        /*=====================================================================================*/
        noPerecedero miel = new noPerecedero(5,"Miel","viscosa");               noPerecederos[0]=miel;
        noPerecedero agua = new noPerecedero(0.70, "Agua", "Liquido");          noPerecederos[1]=agua;
        noPerecedero mermelada = new noPerecedero(1.2, "Mermelada", "Liquido"); noPerecederos[2]=mermelada;
        noPerecedero lenteja = new noPerecedero(0.5, "Lentejas", "Legumbre");   noPerecederos[3]=lenteja;
        noPerecedero cafe = new noPerecedero(1.35, "Cafe", "Grano");            noPerecederos[4]=cafe;
        /*=====================================================================================*/

                                /*Calcular el Precio de Perecederos*/
        System.out.println("\nAlimentos Perecederos: \n");
        double precioTotal=0.0;
        for (int i = 0; i <perecederos.length; i++) {
            if (perecederos[i].getCaducidad() == 1){
                precioTotal+=(perecederos[i].calcularPrecio(1))/4;
                System.out.println("El precio de "+perecederos[i].getNombre()+" es de "+precioTotal+"€. Quedan "+perecederos[i].getCaducidad()+" dias para que caduque");
            }
            else if(perecederos[i].getCaducidad() == 2){
                precioTotal+=(perecederos[i].calcularPrecio(1))/3;
                System.out.println("El precio de "+perecederos[i].getNombre()+" es de "+precioTotal+"€. Quedan "+perecederos[i].getCaducidad()+" dias para que caduque");
            }
            else if(perecederos[i].getCaducidad() == 3){
                precioTotal+=(perecederos[i].calcularPrecio(1))/2;
                System.out.println("El precio de "+perecederos[i].getNombre()+" es de "+precioTotal+"€. Quedan "+perecederos[i].getCaducidad()+" dias para que caduque");
            }else{
                precioTotal+=perecederos[i].calcularPrecio(1);
                System.out.println("El precio de "+perecederos[i].getNombre()+" es de "+precioTotal+"€. Quedan "+perecederos[i].getCaducidad()+" dias para que caduque");
            }
        }
        System.out.println("\nAlimentos No Perecederos: \n");
        double precioFinal=0.0;
        for (int i = 0; i < noPerecederos.length; i++) {
            precioFinal+=noPerecederos[i].calcularPrecio(1);
            System.out.println("El precio de "+noPerecederos[i].getNombre()+" es "+precioFinal+"€.");
        }

        
    }
}
