package dao;

import model.Livro;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO implements IDAO<Livro> {
    private final Connection connection;

    public LivroDAO() {
        this.connection = Conexao.getConnection();
    }

    @Override
    public List<Livro> list() {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livros";

        try (PreparedStatement stmt = connection.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Livro livro = new Livro();
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setPaginas(rs.getInt("paginas"));
                livro.setEditora(rs.getString("editora"));
                livro.setIsbn(rs.getString("isbn"));
                livro.setAvaliacao(rs.getInt("avaliacao"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar os livros", e);
        }

        return livros;
    }

    @Override
    public void update(Livro livro) {
        String sql = "UPDATE livros SET titulo=?, autor=?, paginas=?, editora=?, isbn=?, avaliacao=? WHERE id=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getPaginas());
            stmt.setString(4, livro.getEditora());
            stmt.setString(5, livro.getIsbn());
            stmt.setInt(6, livro.getAvaliacao());
            stmt.setLong(7, livro.getId());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar o livro", e);
        }
    }

    @Override
    public Livro getLivro(Long id) {
        Livro livro = null;
        String sql = "SELECT * FROM livros WHERE id=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                livro = new Livro();
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setPaginas(rs.getInt("paginas"));
                livro.setEditora(rs.getString("editora"));
                livro.setIsbn(rs.getString("isbn"));
                livro.setAvaliacao(rs.getInt("avaliacao"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar o livro", e);
        }

        return livro;
    }

    @Override
    public void save(Livro livro) {
        String sql = "INSERT INTO livros (titulo, autor, paginas, editora, isbn, avaliacao) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getPaginas());
            stmt.setString(4, livro.getEditora());
            stmt.setString(5, livro.getIsbn());
            stmt.setInt(6, livro.getAvaliacao());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar o livro", e);
        }
    }

    @Override
    public void remove(Livro livro) {
        String sql = "DELETE FROM livros WHERE id=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, livro.getId());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao remover o livro", e);
        }
    }
}