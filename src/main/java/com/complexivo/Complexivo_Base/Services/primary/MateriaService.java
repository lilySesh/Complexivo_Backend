package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Materia;
import com.complexivo.Complexivo_Base.Repository.primary.MateriaRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MateriaService extends GenericServiceImpl<Materia, Long> implements GenericService<Materia, Long> {

    private MateriaRepository materiaRepository;
    @Override
    public CrudRepository<Materia, Long> getDao() {

        return materiaRepository;
    }
}
