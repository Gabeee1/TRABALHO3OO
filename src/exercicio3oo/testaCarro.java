package exercicio3oo;


import exercicio3oo.Carro;

public class testaCarro {
    public static void main(String[] args) {
        exercicio3oo.Carro carro = new Carro("Toyota", "Corolla", 2020);

        System.out.println("Velocidade inicial: " + carro.getVelocidadeAtual() + " km/h");

        carro.acelerar();
        carro.acelerar();
        carro.frear();
        carro.frear();
        carro.acelerar();
    }
}