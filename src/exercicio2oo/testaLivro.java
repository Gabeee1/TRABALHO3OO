package exercicio1oo;

public class testaLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        System.out.println("O livro está disponível? " + livro.isDisponivel());

        livro.emprestar();
        System.out.println("O livro está disponível? " + livro.isDisponivel());

        livro.emprestar();

        livro.devolver();
        System.out.println("O livro está disponível? " + livro.isDisponivel());

        livro.devolver();
    }
}
