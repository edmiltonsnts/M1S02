import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n🎮 MENU:");
            System.out.println("1. Jogar");
            System.out.println("2. Configurações");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu JOGAR!");
                    break;
                case 2:
                    System.out.println("Você escolheu CONFIGURAÇÕES!");
                    break;
                case 3:
                    System.out.println("Saindo... Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3); // Continua até o usuário escolher "Sair"

        scan.close();
    }
}