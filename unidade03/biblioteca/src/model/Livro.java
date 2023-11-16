// Declaração do pacote 'model'. Este pacote provavelmente contém as classes que representam os modelos de dados do seu aplicativo.
package model;

// Declaração da classe Livro. Esta classe representa um livro no seu aplicativo.
public class Livro {
    // Declaração de um atributo privado 'id' do tipo long. Este atributo
    // provavelmente representa o ID único de um livro.
    private long id;
    // Declaração de um atributo privado 'titulo' do tipo String. Este atributo
    // representa o título de um livro.
    private String titulo;
    // Declaração de um atributo privado 'autor' do tipo String. Este atributo
    // representa o autor de um livro.
    private String autor;
    // Declaração de um atributo privado 'paginas' do tipo int. Este atributo
    // representa o número de páginas de um livro.
    private int paginas;
    // Declaração de um atributo privado 'editora' do tipo String. Este atributo
    // representa a editora de um livro.
    private String editora;
    // Declaração de um atributo privado 'isbn' do tipo String. Este atributo
    // representa o ISBN de um livro.
    private String isbn;
    // Declaração de um atributo privado 'avaliacao' do tipo int. Este atributo
    // representa a avaliação de um livro.
    private int avaliacao;

    // Declaração do construtor da classe Livro que recebe todos os atributos como
    // parâmetros.
    public Livro(long id, String titulo, String autor, int paginas, String editora, String isbn, int avaliacao) {
        // Inicialização do atributo id com o valor do parâmetro id.
        this.id = id;
        // Inicialização do atributo titulo com o valor do parâmetro titulo.
        this.titulo = titulo;
        // Inicialização do atributo autor com o valor do parâmetro autor.
        this.autor = autor;
        // Inicialização do atributo paginas com o valor do parâmetro paginas.
        this.paginas = paginas;
        // Inicialização do atributo editora com o valor do parâmetro editora.
        this.editora = editora;
        // Inicialização do atributo isbn com o valor do parâmetro isbn.
        this.isbn = isbn;
        // Inicialização do atributo avaliacao com o valor do parâmetro avaliacao.
        this.avaliacao = avaliacao;
    }

    // Declaração dos métodos getters e setters para todos os atributos da classe
    // Livro.
    // Estes métodos permitem que os atributos da classe Livro sejam lidos e
    // modificados de fora da classe.

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    // Declaração do construtor padrão da classe Livro. Este construtor não recebe
    // nenhum argumento e não faz nada.
    public Livro() {
    }

}