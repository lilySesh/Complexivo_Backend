package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Distributivo_Periodo;
import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;
import com.complexivo.Complexivo_Base.Repository.primary.DistributivoPeriodoRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DistributivoPeriodoService extends GenericServiceImpl<Distributivo_Periodo, Long> implements GenericService<Distributivo_Periodo, Long> {

    private DistributivoPeriodoRepository distributivoPeriodoRepository;
    @Override
    public CrudRepository<Distributivo_Periodo, Long> getDao() {
        return distributivoPeriodoRepository;
    }
}
