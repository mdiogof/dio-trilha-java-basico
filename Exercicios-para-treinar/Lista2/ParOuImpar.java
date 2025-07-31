import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int number1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite um número maior que esse: ");
            int number2 = scanner.nextInt();
            scanner.nextLine();
            
            while (number2 <= number1) {
                System.out.print("O segundo número deve ser maior que o primeiro. Por favor, digite novamente: ");
                number2 = scanner.nextInt();
                scanner.nextLine();
            }
            
            System.out.print("Você prefere números pares ou ímpares? (Digite 'par' ou 'impar'): ");
            String preference = scanner.nextLine().toLowerCase();
            
            switch (preference) {
                case "par" -> {
                    for (int i = number2; i >= number1; i--) {
                        if (i % 2 == 0) {
                            System.out.printf("%d ", i);
                        }
                    }
                }
                case "impar" -> {
                    for (int i = number2; i >= number1; i--) {
                        if (i % 2 != 0) {
                            System.out.printf("%d ", i);
                        }
                    }
                }
                default -> System.out.println("Opção inválida. Por favor, reinicie o programa e escolha 'par' ou 'ímpar'.");
            }
        }
    }
}
