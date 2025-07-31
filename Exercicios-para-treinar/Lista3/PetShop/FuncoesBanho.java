import java.util.Scanner;

public class FuncoesBanho {
    private static int numeroPets = 0;
    private static int nivelAgua = 0;
    private static int nivelShampoo = 0;
    private static boolean limpo = true;

    public void darBanho() {
        if (numeroPets == 0) {
            System.out.println("Não há pets na máquina.\n");
        } else if (nivelAgua < 10) {
            System.out.println("Nível de água insuficiente.\n");
        } else if (nivelShampoo < 2) {
            System.out.println("Nível de shampoo insuficinete.\n");
        } else {
            System.out.println("Dando banho no pet...\n");
            nivelAgua -= 10;
            nivelShampoo -= 2;
            limpo = true;
        }
    }

    public void colocarAgua(Scanner scanner) {
        if (nivelAgua < 30) {
            if (nivelAgua <= 28) {
                System.out.println("Abastecendo com água...\n");
                nivelAgua += 2;
            } else {
                System.out.println("O nível máximo será ultrapassado, não é possível abastecer.\n");
            }
        } else {
            System.out.println("O nível de água já está no máximo.\n");
        }
    }

    public void colocarShampoo(Scanner scanner) {
        if (nivelShampoo < 10) {
            if (nivelShampoo <= 8) {
                System.out.println("Abastecendo com shampoo...\n");
                nivelShampoo += 2;
            } else {
                System.out.println("O nível máximo será ultrapassado, não é possível abastecer.\n");
            }
        } else {
            System.out.println("O nível de shampoo já está no máximo.\n");
        }
    }

    public void nivelDeAgua() {
        System.out.println("A máquina tem " + nivelAgua + " litros de água.\n");
    }

    public void nivelDeShampoo() {
        System.out.println("A máquina tem " + nivelShampoo + " litros de shampoo.\n");
    }

    public void temPet() {
        if (numeroPets > 0) {
            System.out.println("Tem um pet na máquina.\n");
        } else {
            System.out.println("A máquina está vazia.\n");
        }
    }

    public void colocarPet() {
        if (numeroPets == 1) {
            System.out.println("Você não pode colocar outro pet, a máquina está lotada.\n");
        } else if (!limpo) {
            System.out.println("A máquina deve ser limpa primeiro.\n");
        } else {
            numeroPets++;
            limpo = false;
            System.out.println("O pet foi colocado na máquina.\n");
        }
    }

    public void retirarPet() {
        if (numeroPets == 0) {
            System.out.println("Não há pets para retirar da máquina.\n");
        } else {
            numeroPets--;
            System.out.println("O pet foi retirado da máquina.\n");
        }
    }

    public void limpar() {
        if (nivelAgua < 3) {
            System.out.println("Nível de água insuficiente.\n");
        } else if (nivelShampoo < 1) {
            System.out.println("Nível de shampoo insuficinete.\n");
        } else {
            System.out.println("Limpando a máquina...\n");
            limpo = true;
            nivelAgua -= 3;
            nivelShampoo -= 1;
        }
    }
}