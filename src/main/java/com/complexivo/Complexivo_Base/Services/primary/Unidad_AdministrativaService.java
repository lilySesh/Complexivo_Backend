package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Unidad_Administrativa;
import com.complexivo.Complexivo_Base.Repository.primary.Unidad_AdministrativaRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Unidad_AdministrativaService extends GenericServiceImpl<Unidad_Administrativa, Long> implements GenericService<Unidad_Administrativa, Long> {

    private Unidad_AdministrativaRepository unidadAdministrativaRepository;
    @Override
    public CrudRepository<Unidad_Administrativa, Long> getDao() {

        return unidadAdministrativaRepository;
    }
}
