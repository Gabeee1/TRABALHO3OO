package exercicio3oo;
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
        this.velocidadeAtual = 0.0;
    }

    public void acelerar() {
        setVelocidadeAtual(velocidadeAtual + 10);
        System.out.println("O carro acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual >= 10) {
            setVelocidadeAtual(velocidadeAtual - 10);
            System.out.println("O carro freou. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            setVelocidadeAtual(0);
            System.out.println("O carro parou. Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        if (velocidadeAtual >= 0) {
            this.velocidadeAtual = velocidadeAtual;
        } else {
            System.out.println("A velocidade não pode ser negativa.");
        }
    }
}




