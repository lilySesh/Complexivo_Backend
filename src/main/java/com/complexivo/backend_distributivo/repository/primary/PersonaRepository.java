package com.complexivo.backend_distributivo.repository.primary;

import com.complexivo.backend_distributivo.model.primary.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends GenericRepository<Persona, Long> {
}
