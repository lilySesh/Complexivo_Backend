package com.complexivo.Complexivo_Base.Repository.primary;

import com.complexivo.Complexivo_Base.Models.primary.Docente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository  extends CrudRepository<Docente, Long> {

}
