package CLASES_HORA;

public class Hora {

    //
    int h;
    int min;
    int seg;

    //=======>Constructores<========

    public Hora(){
        this.h = 0;
        this.min = 0;
        this.seg = 0;
    }

    public Hora(int h, int min, int seg) {
        this.h = h;
        this.min = min;
        this.seg = seg;
    }


    //Metodos

    //Funcion que me retorna la hora separada por puntos
    public String darHora(){
        return this.h+":"+this.min+":"+this.seg;
    }
    public void cambiarHora(int hora) {
        if (hora>=0 && hora<24) {
            this.h = hora;
        }else{
            throw new RuntimeException("Hora erronea");
        }


    }
    public void cambiarMin( int minutos) {
        if (minutos>=0 && minutos<60) {
            this.min = minutos;
        }else{
            throw new RuntimeException("Minutos erroneos");
        }
    }
    public void cambiarSeg( int segundos) {
        if (segundos>=0 && segundos<60) {
            this.seg = segundos;
        }else{
            throw new RuntimeException("Segundos erroneos");
        }
    }

    //Formato
    //Funcion que me retorna la hora segun el formato pasado
    public String darHora(tipoFormato formato) {
        if (formato.equals(formato.FORMATO_12H)) {
            if (this.h >= 12) {
                return (this.h - 12) + ":" + this.min + ":" + this.seg + " pm.";
            } else {
                return darHora() + " am. ";
            }
        } else {
            return darHora();
        }
    }


    @Override
    public String toString() {
        return "Hora{" +
                "h=" + h +
                ", min=" + min +
                ", seg=" + seg +
                '}';
    }

}
