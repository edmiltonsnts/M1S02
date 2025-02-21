import java.util.Scanner;

public class produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        
     
        int produto = valor1 * valor2;
        
       
        System.out.println("PRODUTO = " + produto);
        
        scanner.close();
    }
}