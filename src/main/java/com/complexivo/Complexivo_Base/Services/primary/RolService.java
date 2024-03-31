package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Rol;
import com.complexivo.Complexivo_Base.Repository.primary.RolRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService extends GenericServiceImpl<Rol, Long> implements GenericService<Rol, Long> {

    private RolRepository rolRepository;
    @Override
    public CrudRepository<Rol, Long> getDao() {
        return rolRepository;
    }
}
