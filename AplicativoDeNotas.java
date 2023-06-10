import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicativoDeNotas {
    private List<String> notas;

    public AplicativoDeNotas() {
        notas = new ArrayList<>();
    }

    public void adicionarNota(String nota) {
        notas.add(nota);
        System.out.println("Nota adicionada com sucesso!");
    }

    public void exibirNotas() {
        if (notas.isEmpty()) {
            System.out.println("Não há notas disponíveis.");
        } else {
            System.out.println("Notas:");
            for (String nota : notas) {
                System.out.println("- " + nota);
            }
        }
    }

    public static void main(String[] args) {
        AplicativoDeNotas app = new AplicativoDeNotas();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Aplicativo de Notas");
            System.out.println("1. Adicionar nota");
            System.out.println("2. Exibir notas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nota: ");
                    scanner.nextLine(); // Limpar o buffer
                    String nota = scanner.nextLine();
                    app.adicionarNota(nota);
                    break;
                case 2:
                    app.exibirNotas();
                    break;
                case 3:
                    System.out.println("Encerrando o aplicativo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        } while (opcao != 3);

        scanner.close();
    }
}
