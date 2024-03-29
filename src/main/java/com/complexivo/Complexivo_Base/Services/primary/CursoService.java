package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Curso;
import com.complexivo.Complexivo_Base.Repository.primary.CursoRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CursoService extends GenericServiceImpl<Curso, Long> implements GenericService<Curso, Long> {

    private CursoRepository cursoRepository;
    @Override
    public CrudRepository<Curso, Long> getDao() {

        return cursoRepository;
    }
}
