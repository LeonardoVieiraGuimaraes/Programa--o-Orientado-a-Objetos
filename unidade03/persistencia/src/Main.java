import dataservices.LivroDAO;
import domain.Livro;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        LivroDAO livroDAO = new LivroDAO();

        // Criando um novo livro
        Livro novoLivro = new Livro();
        novoLivro.setTitulo("Aventuras na Programação");
        novoLivro.setAutor("Coder");
        novoLivro.setPaginas(300);
        novoLivro.setEditora("Tech Books");
        novoLivro.setIsbn("123-456-789");
        novoLivro.setAvaliacao(5);

        // Salvando o livro no banco de dados
        livroDAO.salvar(novoLivro);

        // Listando todos os livros
        List<Livro> livros = livroDAO.listar();
        System.out.println("Livros na base de dados:");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }

        // Atualizando o livro recém-criado
        novoLivro.setAvaliacao(4);
        livroDAO.atualizar(novoLivro);

        // Listando novamente para verificar a atualização
        System.out.println("\nLivros na base de dados após atualização:");
        livros = livroDAO.listar();
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - Avaliação: " + livro.getAvaliacao());
        }

        // Deletando o livro recém-atualizado
        livroDAO.deletar(novoLivro.getId());

        // Listando novamente para verificar a exclusão
        System.out.println("\nLivros na base de dados após exclusão:");
        livros = livroDAO.listar();
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }
    }
}
