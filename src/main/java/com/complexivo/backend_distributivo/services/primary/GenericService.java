package com.complexivo.backend_distributivo.services.primary;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T, ID extends Serializable>{
    @Transactional
    public T save(T entity);

    @Transactional(readOnly = true)
    public T findById(ID id);

    @Transactional(readOnly = true)
    public List<T> findByAll();

    @Transactional
    public void delete(ID id);
}
