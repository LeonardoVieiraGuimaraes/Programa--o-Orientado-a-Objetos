// Declaração do pacote. 'dao' é uma abreviação comum para "Data Access Object".
package dao;

// Importação da classe Livro do pacote model. Livro é uma classe de modelo que representa um livro na aplicação.
import model.Livro;

// Importação da classe Conexao do pacote util. Conexao é uma classe utilitária que gerencia a conexão com o banco de dados.
import util.Conexao;

// Importação da interface Connection do pacote java.sql. Connection é uma interface do Java que representa uma conexão com um banco de dados.
import java.sql.Connection;

// Importação da interface PreparedStatement do pacote java.sql. PreparedStatement é uma interface do Java que representa uma instrução SQL pré-compilada.
import java.sql.PreparedStatement;

// Importação da interface ResultSet do pacote java.sql. ResultSet é uma interface do Java que representa o resultado de uma consulta ao banco de dados.
import java.sql.ResultSet;

// Importação da classe SQLException do pacote java.sql. SQLException é uma classe de exceção do Java que fornece informações sobre erros de acesso ao banco de dados.
import java.sql.SQLException;

// Importação da classe ArrayList do pacote java.util. ArrayList é uma classe do Java que implementa a interface List e representa uma lista redimensionável de objetos.
import java.util.ArrayList;

// Importação da interface List do pacote java.util. List é uma interface do Java que representa uma coleção ordenada (também conhecida como sequência).
import java.util.List;

// Declaração da classe LivroDAO. Esta classe implementa a interface IDAO com Livro como seu tipo de parâmetro.
public class LivroDAO implements IDAO<Livro> {

    // Declaração de um atributo privado final chamado connection do tipo
    // Connection.
    // Este atributo será usado para manter a conexão com o banco de dados.
    private final Connection connection;

    // Declaração do construtor da classe LivroDAO.
    // Este construtor não recebe nenhum argumento e é responsável por inicializar o
    // atributo connection.
    public LivroDAO() {
        // O atributo connection é inicializado chamando o método estático getConnection
        // da classe Conexao.
        // Este método é responsável por estabelecer e retornar uma conexão com o banco
        // de dados.
        this.connection = Conexao.getConnection();
    }

    // Método list() sobrescrito da interface IDAO. Este método é responsável por
    // listar todos os livros no banco de dados.
    @Override
    public List<Livro> list() {
        // Criação de uma nova lista vazia de livros.
        List<Livro> livros = new ArrayList<>();
        // Declaração da string SQL que será usada para consultar o banco de dados.
        String sql = "SELECT * FROM livros";

        // Bloco try-with-resources que garante que os recursos PreparedStatement e
        // ResultSet serão fechados após o uso.
        try (PreparedStatement stmt = connection.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            // Loop while que continua enquanto houver mais registros no ResultSet.
            while (rs.next()) {
                // Criação de um novo objeto Livro.
                Livro livro = new Livro();
                // Definição do título do livro com o valor da coluna "titulo" do registro atual
                // do ResultSet.
                livro.setTitulo(rs.getString("titulo"));
                // Definição do autor do livro com o valor da coluna "autor" do registro atual
                // do ResultSet.
                livro.setAutor(rs.getString("autor"));
                // Definição do número de páginas do livro com o valor da coluna "paginas" do
                // registro atual do ResultSet.
                livro.setPaginas(rs.getInt("paginas"));
                // Definição da editora do livro com o valor da coluna "editora" do registro
                // atual do ResultSet.
                livro.setEditora(rs.getString("editora"));
                // Definição do ISBN do livro com o valor da coluna "isbn" do registro atual do
                // ResultSet.
                livro.setIsbn(rs.getString("isbn"));
                // Definição da avaliação do livro com o valor da coluna "avaliacao" do registro
                // atual do ResultSet.
                livro.setAvaliacao(rs.getInt("avaliacao"));
                // Adição do livro à lista de livros.
                livros.add(livro);
            }
            // Bloco catch que captura qualquer SQLException que possa ocorrer durante a
            // execução do bloco try.
        } catch (SQLException e) {
            // Lançamento de uma nova RuntimeException com uma mensagem de erro e a exceção
            // original.
            throw new RuntimeException("Erro ao listar os livros", e);
        }

        // Retorno da lista de livros.
        return livros;
    }

    // Método update() sobrescrito da interface IDAO. Este método é responsável por
    // atualizar um livro no banco de dados.
    @Override
    public void update(Livro livro) {
        // Declaração da string SQL que será usada para atualizar o livro no banco de
        // dados.
        String sql = "UPDATE livros SET titulo=?, autor=?, paginas=?, editora=?, isbn=?, avaliacao=? WHERE id=?";

        // Bloco try-with-resources que garante que o recurso PreparedStatement será
        // fechado após o uso.
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // Definição do primeiro parâmetro da consulta SQL com o título do livro.
            stmt.setString(1, livro.getTitulo());
            // Definição do segundo parâmetro da consulta SQL com o autor do livro.
            stmt.setString(2, livro.getAutor());
            // Definição do terceiro parâmetro da consulta SQL com o número de páginas do
            // livro.
            stmt.setInt(3, livro.getPaginas());
            // Definição do quarto parâmetro da consulta SQL com a editora do livro.
            stmt.setString(4, livro.getEditora());
            // Definição do quinto parâmetro da consulta SQL com o ISBN do livro.
            stmt.setString(5, livro.getIsbn());
            // Definição do sexto parâmetro da consulta SQL com a avaliação do livro.
            stmt.setInt(6, livro.getAvaliacao());
            // Definição do sétimo parâmetro da consulta SQL com o ID do livro.
            stmt.setLong(7, livro.getId());

            // Execução da consulta SQL.
            stmt.execute();
            // Bloco catch que captura qualquer SQLException que possa ocorrer durante a
            // execução do bloco try.
        } catch (SQLException e) {
            // Lançamento de uma nova RuntimeException com uma mensagem de erro e a exceção
            // original.
            throw new RuntimeException("Erro ao atualizar o livro", e);
        }
    }

    // Método getLivro() sobrescrito da interface IDAO. Este método é responsável
    // por obter um livro do banco de dados pelo seu ID.
    @Override
    public Livro getLivro(Long id) {
        // Declaração de uma variável livro inicializada como null. Esta variável será
        // usada para armazenar o livro obtido do banco de dados.
        Livro livro = null;
        // Declaração da string SQL que será usada para consultar o livro no banco de
        // dados.
        String sql = "SELECT * FROM livros WHERE id=?";

        // Bloco try-with-resources que garante que os recursos PreparedStatement e
        // ResultSet serão fechados após o uso.
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // Definição do primeiro parâmetro da consulta SQL com o ID do livro.
            stmt.setLong(1, id);
            // Execução da consulta SQL e armazenamento do resultado no ResultSet rs.
            ResultSet rs = stmt.executeQuery();

            // Verificação se o ResultSet contém pelo menos um registro.
            if (rs.next()) {
                // Criação de um novo objeto Livro.
                livro = new Livro();
                // Definição do título do livro com o valor da coluna "titulo" do registro atual
                // do ResultSet.
                livro.setTitulo(rs.getString("titulo"));
                // Definição do autor do livro com o valor da coluna "autor" do registro atual
                // do ResultSet.
                livro.setAutor(rs.getString("autor"));
                // Definição do número de páginas do livro com o valor da coluna "paginas" do
                // registro atual do ResultSet.
                livro.setPaginas(rs.getInt("paginas"));
                // Definição da editora do livro com o valor da coluna "editora" do registro
                // atual do ResultSet.
                livro.setEditora(rs.getString("editora"));
                // Definição do ISBN do livro com o valor da coluna "isbn" do registro atual do
                // ResultSet.
                livro.setIsbn(rs.getString("isbn"));
                // Definição da avaliação do livro com o valor da coluna "avaliacao" do registro
                // atual do ResultSet.
                livro.setAvaliacao(rs.getInt("avaliacao"));
            }
            // Bloco catch que captura qualquer SQLException que possa ocorrer durante a
            // execução do bloco try.
        } catch (SQLException e) {
            // Lançamento de uma nova RuntimeException com uma mensagem de erro e a exceção
            // original.
            throw new RuntimeException("Erro ao buscar o livro", e);
        }

        // Retorno do livro obtido do banco de dados. Se nenhum livro foi encontrado, o
        // valor null será retornado.
        return livro;
    }

    // Método save() sobrescrito da interface IDAO. Este método é responsável por
    // salvar um livro no banco de dados.
    @Override
    public void save(Livro livro) {
        // Declaração da string SQL que será usada para inserir o livro no banco de
        // dados.
        String sql = "INSERT INTO livros (titulo, autor, paginas, editora, isbn, avaliacao) VALUES (?, ?, ?, ?, ?, ?)";

        // Bloco try-with-resources que garante que o recurso PreparedStatement será
        // fechado após o uso.
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // Definição do primeiro parâmetro da consulta SQL com o título do livro.
            stmt.setString(1, livro.getTitulo());
            // Definição do segundo parâmetro da consulta SQL com o autor do livro.
            stmt.setString(2, livro.getAutor());
            // Definição do terceiro parâmetro da consulta SQL com o número de páginas do
            // livro.
            stmt.setInt(3, livro.getPaginas());
            // Definição do quarto parâmetro da consulta SQL com a editora do livro.
            stmt.setString(4, livro.getEditora());
            // Definição do quinto parâmetro da consulta SQL com o ISBN do livro.
            stmt.setString(5, livro.getIsbn());
            // Definição do sexto parâmetro da consulta SQL com a avaliação do livro.
            stmt.setInt(6, livro.getAvaliacao());

            // Execução da consulta SQL.
            stmt.execute();
            // Bloco catch que captura qualquer SQLException que possa ocorrer durante a
            // execução do bloco try.
        } catch (SQLException e) {
            // Lançamento de uma nova RuntimeException com uma mensagem de erro e a exceção
            // original.
            throw new RuntimeException("Erro ao salvar o livro", e);
        }
    }

    // Método removeById() sobrescrito da interface IDAO. Este método é responsável
    // por remover um livro do banco de dados pelo seu ID.
    @Override
    public void removeById(Long id) {
        // Declaração da string SQL que será usada para remover o livro do banco de
        // dados.
        String sql = "DELETE FROM livros WHERE id=?";

        // Bloco try-with-resources que garante que o recurso PreparedStatement será
        // fechado após o uso.
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // Definição do primeiro parâmetro da consulta SQL com o ID do livro.
            stmt.setLong(1, id);

            // Execução da consulta SQL.
            stmt.execute();
            // Bloco catch que captura qualquer SQLException que possa ocorrer durante a
            // execução do bloco try.
        } catch (SQLException e) {
            // Lançamento de uma nova RuntimeException com uma mensagem de erro e a exceção
            // original.
            throw new RuntimeException("Erro ao remover o livro", e);
        }

    }
}