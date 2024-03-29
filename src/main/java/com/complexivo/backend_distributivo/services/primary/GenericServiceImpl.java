package com.complexivo.backend_distributivo.services.primary;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public  abstract class GenericServiceImpl <T, ID extends Serializable> implements GenericService<T, ID>{
    public abstract CrudRepository<T, ID> getDao();
    @SuppressWarnings("null")
    @Override
    public T save(T Entity) {
        return getDao().save(Entity);
    }

    @SuppressWarnings("null")
    @Override
    public T findById(ID id) {
        Optional<T> obj = getDao().findById(id);
        if (obj.isPresent()) {
            return obj.get();
        }
        return null;
    }

    @Override
    public List<T> findByAll() {
        List<T> list = new ArrayList<>();
        getDao().findAll().forEach(obj -> list.add(obj));
        return list;
    }

    @SuppressWarnings("null")
    @Override
    public void delete(ID id) {
        getDao().deleteById(id);
    }
}
