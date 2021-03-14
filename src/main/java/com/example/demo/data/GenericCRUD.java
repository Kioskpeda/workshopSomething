package com.example.demo.data;

import java.util.Collection;

public interface GenericCRUD<T, ID>{
    T findbyID(ID id);
    Collection<T> findAll();
    T create (T t);
    T update(T t);
    void delete(ID id);

}
