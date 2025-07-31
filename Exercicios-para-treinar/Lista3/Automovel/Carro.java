import java.util.Scanner;

public class Carro {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            FuncoesCarro carro = new FuncoesCarro();
            
            System.out.println("Parabéns! Você entrou no carro.");
            System.out.println("Essas são suas opções: ");
            
            
            boolean continuar = true;
            do {
                System.out.print("""
                                             1 - Ligar o carro;
                                             2 - Desligar o carro;
                                             3 - Acelerar;
                                             4 - Diminuir a velocidade;
                                             5 - Virar para a esquerda/direita;
                                             6 - Verificar a velocidade;
                                             7 - Trocar a marcha;
                                             8 - sair do carro.
                                             """);
                System.out.print("Digite o número do que deseja fazer: ");
                int action = scanner.nextInt();
                scanner.nextLine();
                
                switch (action) {
                    case 1 -> carro.ligar();
                    case 2 -> carro.desligar();
                    case 3 -> carro.acelerar();
                    case 4 -> carro.diminuirVelocidade();
                    case 5 -> carro.virar(scanner);
                    case 6 -> carro.velocidade();
                    case 7 -> carro.trocarMarcha(scanner);
                    case 8 -> {
                        System.out.println("Saindo do carro...");
                        continuar = false;
                    }
                    default -> System.out.println("Eu te dei essa opção?\n");
                }
            } while (continuar);
        }
        
    }
}
