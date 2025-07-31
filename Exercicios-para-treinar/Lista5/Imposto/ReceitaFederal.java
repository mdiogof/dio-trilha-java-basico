/*------ Código Original -----------
public class ReceitaFederal {
    public static void main(String[] args) {
        Calculadora arroz = new Alimentacao();
        Calculadora remedio = new Saude();
        Calculadora camisa = new Vestuario();
        Calculadora musica = new Cultura();

        System.out.println("O imposto do arroz é R$" + arroz.calcularImposto(25));
        System.out.println("O imposto do remédio é R$" + remedio.calcularImposto(46.25));
        System.out.println("O imposto da camisa é R$" + camisa.calcularImposto(116.30));
        System.out.println("O imposto da música é R$" + musica.calcularImposto(14.77));
    }
}*/

// ----- Melhoria ------
import java.util.List;

public class ReceitaFederal {
    public static void main(String[] args) {
        List<Calculadora> produtos = List.of(
            new Alimentacao(),
            new Saude(),
            new Vestuario(),
            new Cultura()
        );

        double[] valores = {25, 46.25, 116.30, 14.77};
        String[] nomes = {"arroz", "remédio", "camisa", "música"};

        for (int i = 0; i < produtos.size(); i++) {
            double imposto = produtos.get(i).calcularImposto(valores[i]);
            System.out.printf("O imposto da %s é R$%.2f%n", nomes[i], imposto);
        }
    }
}

