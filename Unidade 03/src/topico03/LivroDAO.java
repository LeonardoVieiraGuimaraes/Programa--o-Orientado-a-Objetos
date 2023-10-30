package topico03;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO implements IDAO<Livro> {
    private Connection connection;
    private Conexao conexao;

    public LivroDAO() {
        conexao = new Conexao();
        connection = conexao.openConexao();
    }

    @Override
    public void save(Livro entity) {

        String sql = "INSERT INTO livro (titulo, autor, paginas, editora, isbn, avaliacao) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, entity.getTitulo());
            pstmt.setString(2, entity.getAutor());
            pstmt.setInt(3, entity.getPaginas());
            pstmt.setString(4, entity.getEditora());
            pstmt.setString(5, entity.getIsbn());
            pstmt.setInt(6, entity.getAvaliacao());
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Livro entity) {
        String sql = "UPDATE livro SET titulo = ?, autor = ?, paginas = ?, editora = ?, isbn = ?, avaliacao = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, entity.getTitulo());
            pstmt.setString(2, entity.getAutor());
            pstmt.setInt(3, entity.getPaginas());
            pstmt.setString(4, entity.getEditora());
            pstmt.setString(5, entity.getIsbn());
            pstmt.setInt(6, entity.getAvaliacao());
            pstmt.setLong(7, entity.getId());
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Livro entity) {
        String sql = "DELETE FROM livro WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setLong(1, entity.getId());
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Livro getLivro(long id) {
        Livro livro = null;
        String sql = "SELECT * FROM livro WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setLong(1, id);
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                livro = new Livro(
                        resultSet.getLong("id"),
                        resultSet.getString("titulo"),
                        resultSet.getString("autor"),
                        resultSet.getInt("paginas"),
                        resultSet.getString("editora"),
                        resultSet.getString("isbn"),
                        resultSet.getInt("avaliacao")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livro;
    }

    @Override
    public List<Livro> list() {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livro";
        try (Statement stmt = connection.createStatement()) {
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                Livro livro = new Livro(
                        resultSet.getLong("id"),
                        resultSet.getString("titulo"),
                        resultSet.getString("autor"),
                        resultSet.getInt("paginas"),
                        resultSet.getString("editora"),
                        resultSet.getString("isbn"),
                        resultSet.getInt("avaliacao")
                );
                livros.add(livro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livros;
    }

    public void closeConnection() {
        conexao.closeConexao();
    }
}