package exercicio2oo;



public class testaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(10);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}