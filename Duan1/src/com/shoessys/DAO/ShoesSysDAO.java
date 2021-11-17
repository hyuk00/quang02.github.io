package com.shoessys.DAO;

import java.util.List;

public abstract class ShoesSysDAO<E, K> {
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void vohieuhoa(K key);
    abstract public List<E> selectAll();
    abstract public E selectById(K key);
    abstract protected List<E> selectBySql(String sql, Object...args);
}
