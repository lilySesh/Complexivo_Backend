package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Curso_Materia;
import com.complexivo.Complexivo_Base.Repository.primary.Curso_MateriaRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Curso_MateriaService extends GenericServiceImpl<Curso_Materia, Long> implements GenericService<Curso_Materia, Long> {

    private Curso_MateriaRepository cursoMateriaRepository;
    @Override
    public CrudRepository<Curso_Materia, Long> getDao() {

        return cursoMateriaRepository;
    }
}
