package pe.edu.uni.educaapp.service;

import java.util.List;

public interface CrudServiceSpec<T> {

    T read(String codigo);

    List<T> readAll();

    List<T> readAll(T model);

    void insert(T model);

    void update(T model);

    void delete(String codigo);
}
