package exercicio2oo;


public class testaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4.0);

        System.out.println("Raio do círculo: " + circulo.getRaio());
        System.out.println("Diâmetro do círculo: " + circulo.calcularDiametro());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}


