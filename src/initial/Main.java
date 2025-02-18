package initial;

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
    }
}
