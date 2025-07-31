import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] nome = new String[2];
            int[] idade = new int[2];
            
            for (int i = 0; i < 2; i++) {
                System.out.printf("Digite o nome da pessoa %d:", i + 1);
                nome[i] = scanner.nextLine();
                System.out.printf("Digite a idade da pessoa %d:", i + 1);
                idade[i] = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha pendente
            }
            
            int diferencaIdade = Math.abs(idade[0] - idade[1]);
            System.out.printf("A diferença de idade entre %s e %s é de %d anos.", nome[0], nome[1], diferencaIdade);
        }
    }
}
