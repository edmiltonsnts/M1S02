import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Digite o valor por hora: ");
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

       
        System.out.printf("O funcionário %s trabalhou %d horas, e portanto possui R$ %.2f a receber.%n",
                          nome, horasTrabalhadas, salario);

        sc.close();
    }
}
