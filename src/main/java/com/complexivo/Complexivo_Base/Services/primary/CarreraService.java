package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CarreraService extends GenericServiceImpl<Carrera, Long> implements GenericService<Carrera, Long> {

    private CarreraRepository carreraRepository;
    @Override
    public CrudRepository<Carrera, Long> getDao() {

        return carreraRepository;
    }
}
