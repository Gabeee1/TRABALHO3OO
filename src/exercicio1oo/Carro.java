package exercicio1oo;
//GABRIEL E HENRIQUE


public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0; // Velocidade inicial é 0 km/h
    }

    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("O carro acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
            System.out.println("O carro freou. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            velocidadeAtual = 0;
            System.out.println("O carro parou. Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
