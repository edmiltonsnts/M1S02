package initial;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Comentário
            para
            várias
            linhas
         */
        //Comentário em linha

        //DECLARAÇÃO DE VARIÁVEIS E CONSTANTES
        byte number1; // declarando variável
        number1 = 1; // atribuindo um valor a variável
        short number2 = 2;
        int number3 = 3;
        long number4 = 499999999;

        double decimal1 = 3.14;
        float decimal2 = 1.0f;

        char sexo = 'M';

        boolean isActive = false;

        final double PI = 3.14;

        //OPERADORES
        int idade = 15;
        boolean habilitado = false;

        System.out.println(idade > 18); //false
        System.out.println(idade < 18); //true

        System.out.println(habilitado == true); //false

        System.out.println(idade > 18 && habilitado == true); //false

        //CASTING
        double testNumber1 = 10; // Inteiro para Double

        int testnumber2 = (int) 10.0; // Double para Inteiro

        /*
            ENTRADA DE DADOS - PROCESSAMENTO - SAÍDA DE DADOS
        */
        Scanner scan = new Scanner(System.in);
        /*
        //String
        scan.next();
        scan.nextLine();
        //Inteiros
        scan.nextInt();
        //Decimais
        scan.nextDouble();
        scan.nextFloat();
        //Lógico
        scan.nextBoolean();
        */

        System.out.print("CADASTRO DE USUÁRIO\nNome Completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.print("Idade: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Endereço: ");
        String endereco = scan.nextLine();

        System.out.println("RELATÓRIO DO USUÁRIO");
        System.out.printf("Nome Completo: %s\nIdade: %d\nEndereço: %s", nomeCompleto, age, endereco);

        //%i %d -> Inteiros
        //%s -> String
        //%f -> Decimais
        //%c -> Caractere Único

        if(age >= 18) {
            System.out.println("Usuário maior de idade");
        }else {
            System.out.println("Usuário menor de idade");
        }

        boolean conexaoBanco = false;

        if(!conexaoBanco){
            System.out.println("Falha ao conectar com o banco de dados!");
        }

        //EXERCÍCIO 01
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        if(numero % 2 == 0){
            System.out.println("Número PAR!");
        }else{
            System.out.println("Número ÍMPAR!");
        }

        System.out.println(numero % 2 == 0 ? "Número PAR!" : "Número ÍMPAR");

        //EXERCÍCIO 02
        System.out.print("Digite a sua idade: ");
        int _idade = scan.nextInt();

        if(_idade >= 0 && _idade <= 12){
            System.out.println("CRIANÇA");
        }else if (_idade >= 13 && _idade <= 19){
            System.out.println("ADOLESCENTE");
        }else if (_idade >= 20){
            System.out.println("ADULTO");
        }else{
            System.out.println("IDADE INVÁLIDA!");
        }


        //ESTRUTURA DE ESCOLHA

        int valor = 0;

        switch(valor){
            case 1:
                System.out.println("O valor é 1!");
                break;
            case 5:
                System.out.println("O valor é 5!");
                break;
            default:
                System.out.println("O valor não foi identificado!");
        }

        //ESTRUTURA DE REPETIÇÃO

        int contador = 0;
        while(contador < 5){
            System.out.println("Estou em execução!");
            contador++; //Incremento - contador = contador + 1
        }

        System.out.println("__________________");

        contador = 0;
        while(true){
            System.out.println("Estou em execução!");
            if(contador == 4) {
                break;
            }
            contador++; //Incremento - contador = contador + 1
        }

        //Pelo menos uma única vez o bloco de código será executado sendo a condição falsa
        do{
            System.out.println("Estou em execução!");
        }while(false);

        for(int i = 3; i >= 0; i--){
            System.out.println(i);
        }

        for(int i = 0; i < 3; i++){
            System.out.println(i);
        }

        int i = 0;
        int x;

        //Pós incremento-decremento
        x = i++; // x = i = i + 1 -> 0
        i--;

        //Pré incremento-decremento
        x = ++i; // x = i + 1 -> 1
        --i;
    }
}
