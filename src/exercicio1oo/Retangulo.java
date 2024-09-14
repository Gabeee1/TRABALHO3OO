package exercicio1oo;

public class Retangulo {

    public int base, altura;

    public void imprimirArea() {
        System.out.println("'Area = " + (base * altura));

    }

    public static class TestaRetangulo {

        public static void main(String[] arg) {
           Retangulo retangulo = new Retangulo();
            retangulo.altura = 5;
            retangulo.base = 10;
            retangulo.imprimirArea();
        }
    }
}
