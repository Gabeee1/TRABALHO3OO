package exercicio2oo;



public class testaLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        System.out.println("O livro está disponível? " + livro.isDisponivel());

        livro.emprestar();  // Emprestando o livro
        System.out.println("O livro está disponível? " + livro.isDisponivel());

        livro.devolver();  // Devolvendo o livro
        System.out.println("O livro está disponível? " + livro.isDisponivel());
    }
}
