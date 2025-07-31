import java.util.Scanner;

public class SistemaCinema {
    private static final Scanner scanner = new Scanner(System.in);

    // Instâncias fixas conforme pedido
    private static final Gerente gerente = new Gerente("Pedro", "pedro@java.com", "4321");
    private static final Vendedor vendedor = new Vendedor("Marcos", "marcos@java.com", "2345");
    private static final Atendente atendente = new Atendente("Lucas", "lucas@java.com", "1234");

    private static Usuario usuarioLogado = null;

    public static void main(String[] args) {
        boolean sistemaAtivo = true;

        while (sistemaAtivo) {
            System.out.println("\n--- Sistema de Usuários ---");
            System.out.println("1 - Login");
            System.out.println("2 - Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> fazerLogin();
                case 2 -> {
                    System.out.println("Encerrando sistema...");
                    sistemaAtivo = false;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void fazerLogin() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (email.equalsIgnoreCase(gerente.getEmail()) && senha.equals(gerente.getSenha())) {
            usuarioLogado = gerente;
            menuGerente();
        } else if (email.equalsIgnoreCase(vendedor.getEmail()) && senha.equals(vendedor.getSenha())) {
            usuarioLogado = vendedor;
            menuVendedor();
        } else if (email.equalsIgnoreCase(atendente.getEmail()) && senha.equals(atendente.getSenha())) {
            usuarioLogado = atendente;
            menuAtendente();
        } else {
            System.out.println("Credenciais inválidas.\n");
        }
    }

    private static void menuGerente() {
        boolean ativo = true;
        while (ativo) {
            System.out.println("""
                \n--- Menu Gerente ---
                1 - Gerar relatório financeiro
                2 - Consultar vendas
                3 - Alterar dados
                4 - Alterar senha
                5 - Logoff""");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> gerente.gerarRelatorioFinanceiro(atendenteCaixa());
                case 2 -> System.out.println("Vendas atuais: " + vendedor.getQuantidadeVendas());
                case 3 -> alterarDados(gerente);
                case 4 -> alterarSenha(gerente);
                case 5 -> {
                    System.out.println("Saindo da conta gerente...");
                    usuarioLogado = null;
                    ativo = false;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void menuVendedor() {
        boolean ativo = true;
        while (ativo) {
            System.out.println("""
                \n--- Menu Vendedor ---
                1 - Realizar venda
                2 - Consultar vendas
                3 - Alterar dados
                4 - Alterar senha
                5 - Logoff""");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> vendedor.realizarVenda();
                case 2 -> System.out.println("Vendas atuais: " + vendedor.getQuantidadeVendas());
                case 3 -> alterarDados(vendedor);
                case 4 -> alterarSenha(vendedor);
                case 5 -> {
                    System.out.println("Saindo da conta vendedor...");
                    usuarioLogado = null;
                    ativo = false;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void menuAtendente() {
        boolean ativo = true;
        while (ativo) {
            System.out.println("""
                \n--- Menu Atendente ---
                1 - Receber pagamento
                2 - Fechar caixa
                3 - Alterar dados
                4 - Alterar senha
                5 - Logoff""");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor do pagamento: R$");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    atendente.receberPagamento(valor);
                }
                case 2 -> atendente.fecharCaixa();
                case 3 -> alterarDados(atendente);
                case 4 -> alterarSenha(atendente);
                case 5 -> {
                    if (!atendente.isCaixaFechado()) {
                        System.out.println("Você deve fechar o caixa antes de sair.");
                    } else {
                        System.out.println("Saindo da conta atendente...");
                        usuarioLogado = null;
                        ativo = false;
                    }
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void alterarDados(Usuario u) {
        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine();
        System.out.print("Novo email: ");
        String novoEmail = scanner.nextLine();
        u.setNome(novoNome);
        u.setEmail(novoEmail);
        System.out.println("Dados alterados com sucesso.");
    }

    private static void alterarSenha(Usuario u) {
        System.out.print("Nova senha: ");
        String novaSenha = scanner.nextLine();
        u.setSenha(novaSenha);
        System.out.println("Senha alterada com sucesso.");
    }

    private static double atendenteCaixa() {
        // Valor fictício simulado para o relatório
        return 1234.56;
    }
}
