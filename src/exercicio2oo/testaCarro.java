package exercicio2oo;



public class testaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2021);

        System.out.println("Velocidade inicial: " + carro.getVelocidadeAtual() + " km/h");

        carro.acelerar();  // Acelerando o carro
        carro.acelerar();  // Acelerando mais uma vez

        carro.frear();     // Freando
        carro.frear();     // Freando até parar

        carro.acelerar();  // Acelerando novamente
    }
}