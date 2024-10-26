package exercicio3oo;


import exercicio3oo.Aluno;

public class testaAluno {
    public static void main(String[] arg) {

        exercicio3oo.Aluno gabriel = new exercicio3oo.Aluno();
        gabriel.setNome("Gabriel");
        gabriel.setN1(8);
        gabriel.setN2(6);
        gabriel.setN3(6);
        gabriel.setN4(9);
        gabriel.setIdade(18);
        System.out.println("Média de " + gabriel.getNome() + " que tem " + gabriel.getIdade() + " anos: " + gabriel.calcularMedia());
        gabriel.imprimirSituacao();

        exercicio3oo.Aluno guilherme = new Aluno();
        guilherme.setNome("Guilherme");
        guilherme.setN1(4);
        guilherme.setN2(5);
        guilherme.setN3(6);
        guilherme.setN4(7);
        guilherme.setIdade(19);
        System.out.println("Média de " + guilherme.getNome() + " que tem " + guilherme.getIdade() + " anos: " + guilherme.calcularMedia());
        guilherme.imprimirSituacao();
    }
}
