package ru.geekbrains.lesson4.homework.model;

import java.util.Collection;

public interface Repository <T, TId>  {
    void add(T item);
    void update(T item);
    void delete(T item);
    T getById(TId id);
    Collection<T> getAll();

    /*
     * Используя Hibernate, напишите код для вставки, чтения, обновления и удаления данных в таблице Courses.
    * */
}
