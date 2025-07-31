public class Formas {
    public static void main(String[] args) {
        Area quadrado = new Quadrado(5);
        Area retangulo = new Retangulo(5, 4);
        Area circulo = new Circulo(2);

        System.out.printf("Quadrado: %.2f%n", quadrado.calcularArea());
        System.out.printf("Retângulo: %.2f%n", retangulo.calcularArea());
        System.out.printf("Círculo: %.2f%n", circulo.calcularArea());
    }
}
