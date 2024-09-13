import java.util.Scanner;

public class IPhoneInterface {
    public static void main(String[] args) {

        Scanner inputMenu = new Scanner(System.in);

        System.out.println("         \uD83C\uDF4E IPhone\n " +
                "        ***Apps*** \n " +
                "1 - Reprodutor Musical \uD83C\uDFA7 \n " +
                "2 - Aparelho Telefone  \uD83D\uDCF1 \n " +
                "3 - Navegador Internet \uD83C\uDF10 " );

        int aplicativoSelecionado = inputMenu.nextInt();

        switch (aplicativoSelecionado){
            case 1:
                inputMenu.nextLine();
                System.out.println("Escolha a música");
                String musica = inputMenu.nextLine();
                ReprodutorMusical reprodutorMusical = new ReprodutorMusical(musica);
                break;

            case 2:
                inputMenu.nextLine();
                AparelhoTelefone.interfaceAparelho();
                String numero = inputMenu.nextLine();
                AparelhoTelefone telefone = new AparelhoTelefone(numero);
                break;

            case 3:
                inputMenu.nextLine();
                NavegadorInternet.interfaceNavegador();
                String endereço = inputMenu.nextLine();
                NavegadorInternet navegadorInternet = new NavegadorInternet(endereço);
                break;
        }
        inputMenu.close();
    }

}