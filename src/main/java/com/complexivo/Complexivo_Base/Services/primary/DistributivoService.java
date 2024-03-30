package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Distributivo;
import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;
import com.complexivo.Complexivo_Base.Repository.primary.DistributivoRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DistributivoService extends GenericServiceImpl<Distributivo, Long> implements GenericService<Distributivo, Long> {
    private DistributivoRepository distributivoRepository;
    @Override
    public CrudRepository<Distributivo, Long> getDao() {
        return distributivoRepository;
    }
}
