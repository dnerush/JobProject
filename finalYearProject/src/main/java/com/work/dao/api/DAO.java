package com.work.dao.api;

import java.util.List;

/**
 * Created by Sky_el on 21.03.2017.
 */
public interface DAO<T> {
    List<T> get();
    void save(T obj);
    void update(int obj);
    void delete(int obj);
}