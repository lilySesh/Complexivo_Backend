package com.complexivo.Complexivo_Base.Repository.primary;

import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;

import com.complexivo.Complexivo_Base.Repository.genericRepository.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeridodAcademicoRepository  extends GenericRepository<Periodo_Academico, Long> {
}
