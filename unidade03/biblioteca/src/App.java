
// Importação da classe LivroDAO do pacote dao. Esta classe é provavelmente usada para realizar operações de banco de dados relacionadas a livros.
import dao.LivroDAO;

// Importação da classe Livro do pacote model. Esta classe é usada para representar um livro no seu aplicativo.
import model.Livro;

// Importação da interface List do pacote java.util. Esta interface é usada para representar uma lista de objetos em Java.
import java.util.List;

// Declaração da classe App. Esta é a classe principal do seu aplicativo.
public class App {
    // Declaração do método main. Este é o ponto de entrada do seu aplicativo.
    public static void main(String[] args) {
        // Criação de um novo objeto LivroDAO. Este objeto será usado para realizar
        // operações de banco de dados relacionadas a livros.
        LivroDAO livroDAO = new LivroDAO();

        // Criação de um novo objeto Livro.
        Livro novoLivro = new Livro();
        // Definição do título do novo livro.
        novoLivro.setTitulo("Aventuras na Programação");
        // Definição do autor do novo livro.
        novoLivro.setAutor("Coder");
        // Definição do número de páginas do novo livro.
        novoLivro.setPaginas(300);
        // Definição da editora do novo livro.
        novoLivro.setEditora("Tech Books");
        // Definição do ISBN do novo livro.
        novoLivro.setIsbn("123-456-789");
        // Definição da avaliação do novo livro.
        novoLivro.setAvaliacao(5);

        // Salvando o livro no banco de dados usando o método save() do objeto livroDAO.
        livroDAO.save(novoLivro);

        // Listando todos os livros usando o método list() do objeto livroDAO.
        List<Livro> livros = livroDAO.list();
        System.out.println("Livros na base de dados:");
        // Loop for-each para iterar sobre todos os livros na lista de livros.
        for (Livro livro : livros) {
            // Impressão do título e do autor de cada livro.
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }

        // Atualizando o livro recém-criado. A avaliação do livro é alterada para 4.
        novoLivro.setAvaliacao(4);
        // Atualizando o livro no banco de dados usando o método update() do objeto
        // livroDAO.
        livroDAO.update(novoLivro);

        // Listando novamente todos os livros para verificar a atualização.
        System.out.println("\nLivros na base de dados após atualização:");
        livros = livroDAO.list();
        for (Livro livro : livros) {
            // Impressão do título, do autor e da avaliação de cada livro.
            System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - Avaliação: " + livro.getAvaliacao());
        }

        // Deletando o livro recém-atualizado usando o método removeById() do objeto
        // livroDAO.
        livroDAO.removeById(novoLivro.getId());

        // Listando novamente todos os livros para verificar a exclusão.
        System.out.println("\nLivros na base de dados após exclusão:");
        livros = livroDAO.list();
        System.out.println(livros.toString());

        for (Livro livro : livros) {
            // Impressão do título e do autor de cada livro.
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }

        // dao.gerConecao().fecharConecao();
    }
}
