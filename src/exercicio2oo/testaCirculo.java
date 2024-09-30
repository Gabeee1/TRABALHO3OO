package exercicio1oo;

public class testaCirculo {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(4.0);

        System.out.println("Raio: " + circulo.getRaio());

        double diametro = circulo.calcularDiametro();
        System.out.println("Diâmetro do círculo: " + diametro);

        double perimetro = circulo.calcularPerimetro();
        System.out.println("Perímetro (circunferência) do círculo: " + perimetro);

        double area = circulo.calcularArea();
        System.out.println("Área do círculo: " + area);
    }
}
