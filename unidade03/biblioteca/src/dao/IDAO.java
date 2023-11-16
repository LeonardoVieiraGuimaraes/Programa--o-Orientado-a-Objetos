// Declaração do pacote. 'dao' é uma abreviação comum para "Data Access Object".
package dao;

// Importação da interface List do pacote java.util. List é uma interface do Java que representa uma coleção ordenada (também conhecida como sequência).
import java.util.List;

// Declaração da interface IDAO. O <T> é um parâmetro de tipo que indica que a interface IDAO pode operar em objetos de qualquer tipo.
public interface IDAO<T> {
    // Método para salvar uma entidade no banco de dados. Deve ser implementado por
    // qualquer classe que implemente IDAO.
    void save(T entity);

    // Método para obter um livro do banco de dados pelo seu ID. Deve ser
    // implementado por qualquer classe que implemente IDAO.
    T getLivro(Long id);

    // Método para obter uma lista de todas as entidades do banco de dados. Deve ser
    // implementado por qualquer classe que implemente IDAO.
    List<T> list();

    // Método para atualizar uma entidade existente no banco de dados. Deve ser
    // implementado por qualquer classe que implemente IDAO.
    void update(T entity);

    // Método para remover uma entidade do banco de dados pelo seu ID. Deve ser
    // implementado por qualquer classe que implemente IDAO.
    void removeById(Long id);
}