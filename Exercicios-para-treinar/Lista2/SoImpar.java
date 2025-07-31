import java.util.Scanner;

public class SoImpar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            
            int n1 = number;
            
            while (number % 2 == 0 || number < n1) {
                System.out.print("Digite outro número: ");
                number = scanner.nextInt();
                scanner.nextLine();
            }
            
            System.out.println("Fim.");
        }
    }
}
