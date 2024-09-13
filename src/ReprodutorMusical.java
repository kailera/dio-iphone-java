
public class ReprodutorMusical {
    String musica;

    public ReprodutorMusical (String musica){
        this.musica = musica;
        selecionarMusica(this.musica);
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public void tocar(){
        System.out.println("Tocando: " + getMusica());
    }

    public void pausar(){
        System.out.println("Pausado: " + getMusica());
    }

    public void selecionarMusica(String musica){
        if(getMusica() == "") {
            setMusica(musica);
        }else{
            tocar();
        }
    }

    public static void interfaceMusica(){
        System.out.println("Selecione a música: ");
    }

}
