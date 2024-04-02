package ObjetosMultimedia;

public class Multimedia {

    protected String titulo;
    protected String autor;
    protected String formato;
    protected String duracion;

            /*Constructores*/

    public Multimedia(String titulo, String autor, String formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

            /*Metodos*/

    public String mostrarAtributos(String titulo, String autor, String formato, String duracion){
        return "Titulo: "+this.titulo+"\n Autor: "+this.autor+"\n Formato: "+this.formato+"\n Duracion: "+this.duracion;
    }



            /*Getters y Setters*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

            /*toString*/

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion='" + duracion + '\'' +
                '}';
    }
}
