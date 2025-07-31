import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela classe Scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Bem-vindo ao Banco Online! Vamos criar sua conta.\n\n");

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, "
         + "conta %d e seu saldo %.2f já está disponível para saque.\n\n", nomeCliente, numeroAgencia, numeroConta, saldoConta);

        scanner.close();
    }
}
