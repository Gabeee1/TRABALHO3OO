package exercicio1oo;



public class Aluno {
    public String nome;
    public int idade;
    public double n1, n2, n3, n4;

    public double calcularMedia() {
        return (n1 + n2 + n3 + n4) / 4;
    }

    public void imprimirSituacao() {
        double media = calcularMedia();
        if (media >= 6) {
            System.out.println(nome + " está Aprovado com média " + media);
        } else {
            System.out.println(nome + " está Reprovado com média " + media);
        }
    }
}








