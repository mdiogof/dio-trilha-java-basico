import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        DadosConta conta = new DadosConta();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem-vindo ao sistema bancário!");
            System.out.println("Primeiro, vamos criar uma conta. ");
            System.out.print("Digite o valor inicial que você deseja depositar nela: ");
            conta.setSaldoInicial(scanner.nextDouble());
            scanner.nextLine();
            conta.setSaldo(conta.getSaldoInicial());
            System.out.printf("Parabéns! Seu saldo inicial é de R$%.2f.\n", conta.getSaldoInicial());
            System.out.print("O valor do seu cheque especial será adicionado à sua conta.");

            int action;
            boolean continuar = true;

            while (continuar) {
                
                System.out.println("\n\nPor favor, escolha uma das opções abaixo:");
                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Consultar cheque especial");
                System.out.println("3 - Depositar dinheiro");
                System.out.println("4 - Sacar dinheiro");
                System.out.println("5 - Pagar um boleto");
                System.out.println("6 - Verificar se a conta está usando cheque especial");
                System.out.println("7 - Sair");
                action = scanner.nextInt();
                scanner.nextLine();
                
                double novoSaldo = conta.chequeEspecial() - (conta.getSaldo() + conta.chequeEspecial());
                switch (action) {
                    case 1 -> OperacoesConta.consultarSaldo(conta);
                    case 2 -> OperacoesConta.consultarChequeEspecial(conta);
                    case 3 -> OperacoesConta.depositar(conta, scanner, novoSaldo);
                    case 4 -> OperacoesConta.sacar(conta, scanner);
                    case 5 -> OperacoesConta.pagarBoleto(conta, scanner);
                    case 6 -> OperacoesConta.usaChequeEspecial(conta, novoSaldo);
                    case 7 -> continuar = false;
                    default -> System.out.println("Essa não é uma opção válida. Escolha outra.");
                }
                
                if ((novoSaldo > 0.00) && ((conta.getSaldo() + conta.chequeEspecial()) > conta.chequeEspecial())) {
                    conta.setSaldo(conta.getSaldo() - novoSaldo*0.2);
                    System.out.println("R$" + novoSaldo*0.2 + " -> taxa cobrada pelo uso do cheque especial.");
                }
            }
        }
    }
}
