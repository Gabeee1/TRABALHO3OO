package exercicio1oo;

import exericicio6oo.c;

public class Livro {
    public String titulo;
    public String autor;
    public boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;
        } else {
            return false;
        }
    }

    public void devolver() {
        disponivel = true;
    }

    public boolean verificarDisponibilidade() {
        return disponivel;
    }

    public static void main(String[] args) {
        c livro = new c("LIVRO SUPER LEGAl", "Autor Desconhecido");
        System.out.println("Disponível: " + livro.verificarDisponibilidade());

        livro.emprestar();
        System.out.println("Disponível após empréstimo: " + livro.verificarDisponibilidade());

        livro.devolver();
        System.out.println("Disponível após devolução: " + livro.verificarDisponibilidade());
    }
}

