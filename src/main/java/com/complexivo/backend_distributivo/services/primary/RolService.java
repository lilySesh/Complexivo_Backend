package com.complexivo.backend_distributivo.services.primary;

import com.complexivo.backend_distributivo.model.primary.Rol;
import com.complexivo.backend_distributivo.repository.primary.RolRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
@Transactional
public class RolService extends GenericServiceImpl<Rol, Long> implements GenericService<Rol, Long> {

    private RolRepository rolRepository;
    @Override
    public CrudRepository<Rol, Long> getDao() {
        return rolRepository;
    }
}
