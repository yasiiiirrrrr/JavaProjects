package ObjetosMultimedia;

public class Pelicula extends Multimedia{

     String actorPrincipal;
     String actrizPrincipal;

                    /*Constructor*/

    public Pelicula(String titulo, String autor, String formato, String duracion) {
        super(titulo, autor, formato, duracion);
    }

                    /*Metodos*/
    public String mostrarActor(String actorPrincipal){
        return "Actor Principal: "+this.actorPrincipal;
    }

    public String mostrarActriz(String actrizPrincipal){
        return "Actriz Principal: "+this.actrizPrincipal;
    }

                    /*Getter y Setters*/

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }
    /*toString*/

    @Override
    public String toString() {
        return "Pelicula{" +
                "actorPrincipal='" + actorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion='" + duracion + '\'' +
                '}';
    }
}
