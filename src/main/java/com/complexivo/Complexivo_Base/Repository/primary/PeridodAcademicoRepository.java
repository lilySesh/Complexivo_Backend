package com.complexivo.Complexivo_Base.Repository.primary;

import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeridodAcademicoRepository  extends CrudRepository<Periodo_Academico, Long> {
}
