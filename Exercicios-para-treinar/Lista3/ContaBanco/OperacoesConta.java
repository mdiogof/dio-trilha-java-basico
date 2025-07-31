import java.util.Scanner;

public class OperacoesConta {
    public static void consultarSaldo(DadosConta conta) {
        System.out.printf("Seu saldo é de R$%.2f", conta.getSaldo() + conta.chequeEspecial());
    }

    public static void consultarChequeEspecial(DadosConta conta) {
        System.out.printf("Seu cheque especial é de R$%.2f", conta.chequeEspecial());    
    }

    public static void depositar(DadosConta conta, Scanner scanner, double novoSaldo) {
        System.out.print("Digite o valor a ser depositado: ");
        double deposito = scanner.nextDouble();
        scanner.nextLine();
        if ((novoSaldo > 0.00) && ((conta.getSaldo() + conta.chequeEspecial()) > conta.chequeEspecial())) {
            conta.setSaldo(conta.getSaldo() + deposito - novoSaldo*0.2);
            System.out.printf("R$%.2f -> taxa cobrada pelo uso do cheque especial.\n", novoSaldo*0.2);
            System.out.printf("Depósito feito com sucesso! Seu novo saldo é R$%.2f\n", conta.getSaldo() + conta.chequeEspecial() - novoSaldo*0.2);
        } else {
            conta.setSaldo(conta.getSaldo() + deposito);
            System.out.printf("Depósito feito com sucesso! Seu novo saldo é R$%.2f\n", conta.getSaldo() + conta.chequeEspecial());
        }
    }

    public static void sacar(DadosConta conta, Scanner scanner) {
        System.out.print("Digite o valor que deseja sacar: ");
        double saque = scanner.nextDouble();
        scanner.nextLine();
        conta.setSaldo(conta.getSaldo() - saque);
        System.out.printf("Saque feito com sucesso! Seu novo saldo é R$%.2f\n", conta.getSaldo() + conta.chequeEspecial());
    }

    public static void pagarBoleto(DadosConta conta, Scanner scanner) {
        System.out.print("Digite o valor do boleto a ser pago: ");
        double boleto = scanner.nextDouble();
        scanner.nextLine();
        conta.setSaldo(conta.getSaldo() - boleto);
        System.out.printf("Boleto pago com sucesso! Seu novo saldo é R$%.2f\n", conta.getSaldo() + conta.chequeEspecial());
    }

    public static void usaChequeEspecial(DadosConta conta, double novoSaldo) {
        if ((conta.getSaldo() + conta.chequeEspecial()) <= conta.chequeEspecial()) {
            System.out.printf("Você está usando R$%.2f do seu cheque especial.", novoSaldo);
        } else {
            System.out.println("Você ainda não atingiu seu cheque especial.");
        }
    }
}
