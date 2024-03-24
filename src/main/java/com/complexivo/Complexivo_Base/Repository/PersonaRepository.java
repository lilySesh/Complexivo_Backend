package com.complexivo.Complexivo_Base.Repository;

import com.complexivo.Complexivo_Base.Models.Persona;
import com.complexivo.Complexivo_Base.Repository.genericRepository.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends GenericRepository<Persona, Long> {
}
