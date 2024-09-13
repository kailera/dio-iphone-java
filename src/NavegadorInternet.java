
public class NavegadorInternet {
    String url;

    public NavegadorInternet(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void exibirPagina(String url){
        System.out.println("Abrindo a página " + url);
    }

    public  void atualizandoPagina(){
        System.out.println("atualizando a página " + getUrl());
    }

    public void adicionarNovaPagina(){
        System.out.println("Abrindo nova página");
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public static void interfaceNavegador() {
        System.out.println("Insira o endereço que deseja: ");
    }
}
