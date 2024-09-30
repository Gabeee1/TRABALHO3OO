package exercicio1oo;

public class testaCarro {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2021);

        System.out.println("Velocidade inicial: " + carro.getVelocidadeAtual() + " km/h");

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        carro.frear();
        carro.frear();

        carro.frear();
    }
}

