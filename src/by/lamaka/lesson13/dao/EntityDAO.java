package by.lamaka.lesson13.dao;

import by.lamaka.lesson13.exception.DAOException;

import java.util.List;

public interface EntityDAO<T> {
    void save(T t) throws DAOException;

    void saveAll(List<T> entities) throws DAOException;

    void update(T t) throws DAOException;

    void delete(int id) throws DAOException;

    T get(int id) throws DAOException;

    List<T> getAll() throws DAOException;
}
