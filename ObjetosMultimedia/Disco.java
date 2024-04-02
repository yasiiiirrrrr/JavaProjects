package ObjetosMultimedia;

public class Disco extends Multimedia {

    protected String genero;

                        /*Constructor*/
    public Disco(String titulo, String autor, String formato, String duracion) {
        super(titulo, autor, formato, duracion);
    }

                        /*Metodos*/
    public String obtenerGenero(String genero){
        return "Genero: "+this.genero;
    }

                        /*Getters y Setters*/

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    /*toString*/

    @Override
    public String toString() {
        return "Disco{" +
                "genero='" + genero + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion='" + duracion + '\'' +
                '}';
    }
}
