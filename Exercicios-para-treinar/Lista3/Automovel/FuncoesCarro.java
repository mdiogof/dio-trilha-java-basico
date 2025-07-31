import java.util.Scanner;

public class FuncoesCarro {
    private static boolean estado = true; // em true, o carro está desligado
    private static int velocidade = 0;
    public int marchaAtual = 0;

    public void getEstado() {
        if (estado) {
            System.out.println("Desligado.\n");
        } else {
            System.out.println("Ligado.\n");
        }
    }
    
    public void ligar() {
        if (estado) {
            System.out.println("O carro foi ligado.\n");
            estado = false;
        } else {
            System.out.println("O carro já está ligado.\n");
        }
    }

    public void desligar() {
        if (marchaAtual == 0 && velocidade == 0 && !estado) {
            System.out.println("O carro foi desligado.\n");
        } else if (estado) {
            System.out.println("O carro já está desligado.\n");
        } else {
            System.out.println("O carro deve estar parado e em ponto-morto para desligar.\n");
        }
    }

    public void acelerar() {
        if (estado) {
            System.out.println("Ligue o carro.\n");
        } else if ((marchaAtual == 1 && velocidade < 20) || (marchaAtual == 2 && velocidade < 40) || (marchaAtual == 3 && velocidade < 60) || (marchaAtual == 4 && velocidade < 80) || (marchaAtual == 5 && velocidade < 100) || (marchaAtual == 6 && velocidade < 120)) {
            System.out.println("Acelerando...\n");
            velocidade ++;
        } else if (velocidade == 120) {
            System.out.println("Velocidade máxima atingida.\n");
        } else if (marchaAtual == 0) {
            System.out.println("O carro está em ponto-morto. Troque de marcha.\n");
        } else {
            System.out.println("O carro não pode acelerar mais nessa marcha.\n");
        }
    }

    public void diminuirVelocidade() {
        if (estado) {
            System.out.println("Ligue o carro.\n");
        } else if (velocidade > 0 && (marchaAtual == 1 && velocidade <= 20) || (marchaAtual == 2 && velocidade > 20) || (marchaAtual == 3 && velocidade > 40) || (marchaAtual == 4 && velocidade > 60) || (marchaAtual == 5 && velocidade > 80) || (marchaAtual == 6 && velocidade > 100)) {
            velocidade--;
            System.out.println("Diminuindo a velocidade...\n");
        } else if (velocidade == 0) {
            System.out.println("Você não pode diminuir a velocidade. O carro está parado.\n");
        } else {
            System.out.println("Você não pode diminuir a velocidade nessa marcha.\n");
        }
    }

    public void virar(Scanner scanner) {
        if (estado) {
            System.out.println("Ligue o carro.\n");
        } else if (velocidade >= 1 && velocidade <= 40) {
            System.out.print("Digite o lado para o qual deseja virar (direita/esquerda): ");
            var lado = scanner.nextLine().equalsIgnoreCase("direita");

            if (lado) {
                System.out.println("O carro virou para a direita.\n");
            } else if (!lado) {
                System.out.println("O carro virou para a esquerda.\n");
            }
        } else if (velocidade < 1) {
            System.out.println("O carro está muito devagar para virar.\n");
        } else if (velocidade > 40) {
            System.out.println("O carro está muito rápido para virar.\n");
        }
    }

    public void velocidade() {
        if (estado) {
            System.out.println("Ligue o carro.\n");
        } else {
            System.out.println("A velocidade atual é " + velocidade + "km/h\n");
        }
    }

    public void trocarMarcha(Scanner scanner) {
        if (estado) {
            System.out.println("Ligue o carro.\n");
        } else {
            System.out.print("Insira a marcha desejada: ");
            int marcha = scanner.nextInt();
            scanner.nextLine();

            if (marcha == marchaAtual) {
                System.out.println("Essa é a marcha atual.\n");
            } else if (marcha != (marchaAtual + 1) && marcha != (marchaAtual - 1)) {
                System.out.println("Você não pode pular marchas.\n");
            } else if (marcha < 0 || marcha > 6) {
                System.out.println("O carro não possui essa marcha.\n");
            } else if (velocidade == 0 || velocidade == 20 || velocidade == 40 || velocidade == 60 || velocidade == 80 || velocidade == 100){
                marchaAtual = marcha;
                System.out.println("Trocando de marcha...\n");
            } else {
                System.out.println("Você não pode trocar de marcha nessa velocidade.\n");
            }
        }
    }
}
