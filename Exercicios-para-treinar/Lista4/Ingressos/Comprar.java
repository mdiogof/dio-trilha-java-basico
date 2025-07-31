import java.util.Scanner;

public class Comprar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("""
                    Qual opção de ingresso você deseja?
                    1 - Inteiro;
                    2 - Meia;
                    3 - Família.
                    """);
            System.out.print(": ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1 -> System.out.println("Pague R$" + Inteiro.getValor());
                case 2 -> System.out.println("Pague R$" + Meio.getValor());
                case 3 -> {
                    System.out.print("Digite o número de pessoas: ");
                    int pessoas = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Pague R$" + Familia.getValor(pessoas));
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
