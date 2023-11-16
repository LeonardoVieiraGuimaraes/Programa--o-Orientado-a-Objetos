package dao;

import java.util.List;

public interface IDAO<T> {
    void save(T entity);

    T getLivro(Long id);

    List<T> list();

    void remove(T entity);

    void update(T entity);
}