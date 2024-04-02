package ObjetosRadio;

public class Radio {
    public float emisora;
    //Constructor

    public Radio(float emisora) {
        this.emisora = emisora;
    }
    public float aumentarEmisora(float emisora){
        if (emisora>=108){
            return emisora=80;
        }else{
            return (float) (emisora + 0.5);
        }
    }
    public float disminuirEmisora(float emisora){
        if (emisora<=80){
            return emisora=108;
        }else{
            return (float) (emisora-0.5);
        }
    }
}
