
public class AparelhoTelefone {
    String numero;

    public AparelhoTelefone(String numero) {
        this.numero = numero;
        ligar(getNumero());
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void ligar(String numero){
        System.out.println("ligando para o numero: " + getNumero());
    }

    public void atender(){
        System.out.println("Atendendo ao número: " + getNumero());
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Grave Sua mensagem. Você só será tarifado após o sinal.");
    }

    public static void interfaceAparelho(){
        System.out.println("Insira o número de telefone: ");
    }
}

