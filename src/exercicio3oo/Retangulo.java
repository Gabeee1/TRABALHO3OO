package exercicio3oo;
//GABRIEL E HENRIQUE
public class Retangulo {
    private int largura, altura;

    public double calcularArea() {
        return largura * altura;
    }


    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        if (largura >= 0) {
            this.largura = largura;
        } else {
            System.out.println("A largura não pode ser negativa. Valor não alterado.");
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("A altura não pode ser negativa. Valor não alterado.");
        }
    }
}



