package exercicio1oo;

import exercicio1oo.ContaBanco;

public class Circulo {
    public float raio;

        public Circulo(float raio) {
        this.raio = raio;
    }

    public float calcularDiametro() {
        return 2 * raio;
    }

    public float calcularPerimetro() {
        return 2 * (float) Math.PI * raio;
    }

    public float calcularArea() {
        return (float) Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Diâmetro: " + circulo.calcularDiametro());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Área: " + circulo.calcularArea());
    }
}

