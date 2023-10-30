import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComportamentosMaquina comportamentos = new ComportamentosMaquina();
        MaquinaDeBolinhas maquina = new MaquinaDeBolinhas();

        System.out.println("Valor das bolinhas: R$1,00 ");
        System.out.print("Quantas bolinhas você deseja comprar? ");
        int quantidadeMoedas = scanner.nextInt();

        comportamentos.colocarMoedas(quantidadeMoedas);
        comportamentos.girarMaquina();
        maquina.venderBolinhas(quantidadeMoedas);

        scanner.close();
    }
}
