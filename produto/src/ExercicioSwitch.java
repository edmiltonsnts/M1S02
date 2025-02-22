import java.util.Scanner;

public class ExercicioSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = -1; // Inicializa a variável

        while (opcao != 0) { // Permite sair digitando 0
            System.out.println("Escolha o nível de condicionamento físico:\n" +
                               "1. Iniciante\n" +
                               "2. Intermediário\n" +
                               "3. Avançado\n" +
                               "0. Sair\n" +
                               "Opção: ");
            
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu o nível iniciante.");
                    break;
                case 2:
                    System.out.println("Você escolheu o nível intermediário.");
                    break;
                case 3:
                    System.out.println("Você escolheu o nível avançado.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scan.close(); // Fechar o Scanner ao terminar
    }
}

