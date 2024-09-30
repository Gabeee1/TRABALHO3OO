package exercicio1oo;
//GABRIEL E HENRIQUE


public class Circulo {
    private double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }


    public double getRaio() {
        return raio;
    }

    // Método para calcular o diâmetro do círculo
    public double calcularDiametro() {
        return 2 * raio;
    }

    // Método para calcular o perímetro (circunferência) do círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
