package com.samuro.samuro.repository.jdbc;

public interface JDBCRepository<T, E> {
    T save(T entity);
    T update(T entity);
    void deleteById(E id);
    T findById(E id);

}
