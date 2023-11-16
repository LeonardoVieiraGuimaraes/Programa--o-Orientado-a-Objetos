package topico03;

public class MainJDBCDAO {
    public static void main(String[] args) {
        LivroDAO dao = new LivroDAO();

        Livro livro = new Livro();
        livro.setTitulo("Dom Quixote");
        livro.setAutor("Miguel de Cervantes");
        livro.setPaginas(863);
        livro.setEditora("Editora A");
        livro.setIsbn("978-85-123456-7-8");
        livro.setAvaliacao(4);

        dao.save(livro);

        dao.closeConnection();
    }
}
