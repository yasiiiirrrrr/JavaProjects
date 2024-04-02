package CLASES_Fecha;

public class Fecha {
    int dia;
    int mes;
    int año;
    int hora;
    int minuto;

//  Constructores
    public Fecha(int d, int m, int a, int h, int min){
        this.dia=d;
        this.mes=m;
        this.hora=h;
        this.año=a;
        this.minuto=min;
    }

//  Metodos
    public String verFecha(){
        return this.dia+"/"+this.mes+"/"+this.año+"  "+this.hora+":"+this.minuto;
    }
        //  Metodos para cambiar dia, mes, año, hora, minutos
        public void cambiardia(int d){
            if (dia>0 && dia<32){
                this.dia=d;
            }else{
                throw new RuntimeException("Dia erroneo. Introduce un dia valido(1-31)");
            }
        }
    public void cambiarMes(int m){
        if (mes>0 && mes<13){
            this.mes=m;
        }else{
            throw new RuntimeException("Mes erroneo. Introduce un dia valido(1-12)");
        }
    }

    public void cambiarAño(int a){
        if (año>=0 && año<10000){
            this.año=a;
        }else{
            throw new RuntimeException("Año erroneo. Introduce un dia valido(0-9999)");
        }
    }

    public void cambiarHora(int h){
        if (hora>0 && hora<24){
            this.dia=h;
        }else{
            throw new RuntimeException("Hora erronea. Introduce un dia valido(1-24)");
        }
    }

    public void cambiarMinuto(int min){
        if (minuto>=0 && minuto<61){
            this.minuto=min;
        }else{
            throw new RuntimeException("Minuto erroneo. Introduce un dia valido(0-60)");
        }
    }



//  Getters y Setters


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }



}
