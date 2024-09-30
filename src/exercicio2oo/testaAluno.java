package exercicio1oo;

public class testaAluno {
    public static void main(String[] arg) {

        Aluno gabriel = new Aluno();
        gabriel.nome = "Gabriel";
        gabriel.n1 = 8;
        gabriel.n2 = 6;
        gabriel.n3 = 6;
        gabriel.n4 = 9;
        gabriel.idade = 18;
        System.out.println("Média de " + gabriel.nome + " que tem " + gabriel.idade + " anos: " + gabriel.calcularMedia());
        gabriel.imprimirSituacao();

        Aluno guilherme = new Aluno();
        guilherme.nome = "Guilherme";
        guilherme.n1 = 4;
        guilherme.n2 = 5;
        guilherme.n3 = 6;
        guilherme.n4 = 7;
        guilherme.idade = 19;
        System.out.println("Média de " + guilherme.nome + " que tem " + guilherme.idade + " anos: " + guilherme.calcularMedia());
        guilherme.imprimirSituacao();
    }
}
