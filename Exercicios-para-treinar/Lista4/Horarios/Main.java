import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            
            Relogio brasileiro = new RelogioBrasileiro(12, 45, 36);
            Relogio americano = new RelogioAmericano(1, 30, 5);
            Relogio relogioAtual;
            
            while (continuar) {
                System.out.print("Selecione o relógio que deseja usar (brasileiro/americano): ");
                String escolha = scanner.nextLine();
                
                if (escolha.equalsIgnoreCase("brasileiro")) {
                    relogioAtual = brasileiro;
                } else if (escolha.equalsIgnoreCase("americano")) {
                    relogioAtual = americano;
                } else {
                    System.out.println("Relógio não reconhecido.");
                    continue; // volta pro início do while
                }
                
                boolean subMenu = true;
                while (subMenu) {
                    System.out.println("""
                                                       O que você deseja fazer?
                                                       1 - Ver as horas
                                                       2 - Atualizar o relógio
                                                       3 - Trocar de relógio
                                                       4 - Sair do programa
                                                       """);
                    
                    int opcao = scanner.nextInt();
                    scanner.nextLine(); // limpar buffer
                    
                    switch (opcao) {
                        case 1 -> System.out.println("As horas nesse relógio são: " + relogioAtual.retornarHora());
                        case 2 -> {
                            System.out.print("Insira as horas: ");
                            int hora = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Insira os minutos: ");
                            int minuto = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Insira os segundos: ");
                            int segundo = scanner.nextInt();
                            scanner.nextLine();
                            
                            if (relogioAtual == brasileiro) {
                                brasileiro.setRelogio(new RelogioBrasileiro(hora, minuto, segundo));
                            } else {
                                americano.setRelogio(new RelogioAmericano(hora, minuto, segundo));
                            }
                            System.out.println("Relógio atualizado com sucesso!");
                        }
                        case 3 -> subMenu = false; // volta pro menu de escolha de relógio
                        case 4 -> {
                            continuar = false;
                            subMenu = false;
                            System.out.println("Encerrando o programa...");
                        }
                        default -> System.out.println("Opção inválida.");
                    }
                }
            }
        }
    }
}

