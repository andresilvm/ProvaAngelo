package andre.tech.com.sistema;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    List<Livro> livrosDisponiveis;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosDisponiveis.remove(livro);
    }


    public void exibirLivrosDisponiveis() {
        if (livrosDisponiveis.isEmpty()) {
            System.out.println("Nenhum livro disponível.");
        } else {
            System.out.println("-------------------------");
            System.out.println("Livros disponíveis:");
            System.out.println("-------------------------");
            for (Livro livro : livrosDisponiveis) {
                livro.exibirLivro();
                System.out.println("-------------------------");
            }
            System.out.println("-------------------------");
        }
    }
}
