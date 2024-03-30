package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Docente;
import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;
import com.complexivo.Complexivo_Base.Repository.primary.DocenteRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DocenteService extends GenericServiceImpl<Docente, Long> implements GenericService<Docente, Long> {
    private DocenteRepository docenteRepository;
    @Override
    public CrudRepository<Docente, Long> getDao() {
        return docenteRepository;
    }
}
