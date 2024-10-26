package exercicio3oo;
//GABRIEL E HENRIQUE


public class Circulo {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        setRaio(raio);
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    // Getters e Setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio >= 0) {
            this.raio = raio;
        } else {
            System.out.println("O raio não pode ser negativo.");
        }
    }
}


