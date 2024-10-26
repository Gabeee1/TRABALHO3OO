package exercicio3oo;


import exercicio3oo.Retangulo;

public class testaRetangulo {
    public static void main(String[] args) {
        exercicio3oo.Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(10);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}