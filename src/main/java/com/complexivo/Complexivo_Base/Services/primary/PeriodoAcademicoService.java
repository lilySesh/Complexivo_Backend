package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;
import com.complexivo.Complexivo_Base.Models.primary.Persona;
import com.complexivo.Complexivo_Base.Repository.primary.PeridodAcademicoRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PeriodoAcademicoService extends GenericServiceImpl<Periodo_Academico, Long> implements GenericService<Periodo_Academico, Long> {

    private PeridodAcademicoRepository peridodAcademicoRepository;
    @Override
    public CrudRepository<Periodo_Academico, Long> getDao() {
        return peridodAcademicoRepository;
    }
}
