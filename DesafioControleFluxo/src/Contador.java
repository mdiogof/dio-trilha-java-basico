import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)){
			boolean continuar = true;
			do {
				System.out.print("Digite o primeiro parâmetro: ");
				int parametroUm = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Digite o segundo parâmetro: ");
				int parametroDois = scanner.nextInt();
				scanner.nextLine();
		
				try {
					//chamando o método contendo a lógica de contagem
					contar(parametroUm, parametroDois);
					continuar = false; //se a contagem for bem-sucedida, não continuar o loop
				}catch (ParametrosInvalidosException exception) {
					System.out.println(exception.getMessage() + "Tente novamente.\n");
				}
			} while (continuar);
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("\nErro: o segundo parâmetro deve ser maior que o primeiro.\n");
		}
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i + 1));
		}
	}
}