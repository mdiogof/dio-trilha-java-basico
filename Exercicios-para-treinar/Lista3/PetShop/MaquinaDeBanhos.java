import java.util.Scanner;

public class MaquinaDeBanhos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FuncoesBanho maquina = new FuncoesBanho();

        System.out.println("Esta é uma máquina para limpar seu pet.");
        System.out.println("As seguintes funções estão disponíveis: ");

        boolean continuar = true;
        do {
            System.out.println("""
                    1 - Dar banho no pet;
                    2 - Abastecer com água;
                    3 - Abastecer com Shampoo;
                    4 - Verificar nível de água;
                    5 - Verificar nível de shampoo;
                    6 - Verificar se tem pet no banho;
                    7 - Colocar pet na máquina;
                    8 - Retirar pet da máquina;
                    9 - Limpar máquina;
                    0 - Sair.""");
            System.out.print("Insira o número da função que deseja: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1 -> maquina.darBanho();
                case 2 -> maquina.colocarAgua(scanner);
                case 3 -> maquina.colocarShampoo(scanner);
                case 4 -> maquina.nivelDeAgua();
                case 5 -> maquina.nivelDeShampoo();
                case 6 -> maquina.temPet();
                case 7 -> maquina.colocarPet();
                case 8 -> maquina.retirarPet();
                case 9 -> maquina.limpar();
                case 0 -> {
                    System.out.println("Saindo...\n");
                    continuar = false;
                }
                default -> System.out.println("Essa função não existe.");
            }
        } while (continuar);
    }
}
