package dataservices.dao;

import domain.Livro;
import dataservices.conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    private final Connection connection;

    public LivroDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void salvar(Livro livro) {
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

    public List<Livro> listar() {
        String sql = "SELECT * FROM livros";
        List<Livro> livros = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getLong("id"));
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

    public void atualizar(Livro livro) {
        String sql = "UPDATE livros SET titulo=?, autor=?, paginas=?, editora=?, isbn=?, avaliacao=? WHERE id=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getPaginas());
            stmt.setString(4, livro.getEditora());
            stmt.setString(5, livro.getIsbn());
            stmt.setInt(6, livro.getAvaliacao());
            stmt.setLong(7, livro.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar o livro", e);
        }
    }

    public void deletar(long livroId) {
        String sql = "DELETE FROM livros WHERE id=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, livroId);

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar o livro", e);
        }
    }
}
