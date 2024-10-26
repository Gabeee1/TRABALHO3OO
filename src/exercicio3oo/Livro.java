package exercicio3oo;
//GABRIEL E HENRIQUE



import java.util.Scanner;

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public boolean isDisponivel() {
        return !isEmprestado();
    }

    public void emprestar() {
        if (isDisponivel()) {
            setEmprestado(true);
            System.out.println("O livro '" + getTitulo() + "' foi emprestado com sucesso.");
        } else {
            System.out.println("O livro '" + getTitulo() + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (!isDisponivel()) {
            setEmprestado(false);
            System.out.println("O livro '" + getTitulo() + "' foi devolvido com sucesso.");
        } else {
            System.out.println("O livro '" + getTitulo() + "' já está disponível e não precisa ser devolvido.");
        }
    }

    public void verificarDisponibilidade() {
        if (isDisponivel()) {
            System.out.println("O livro '" + getTitulo() + "' está disponível para empréstimo.");
        } else {
            System.out.println("O livro '" + getTitulo() + "' está atualmente emprestado.");
        }
    }
}
