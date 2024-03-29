package com.complexivo.backend_distributivo.services.primary;

import com.complexivo.backend_distributivo.model.primary.Persona;
import com.complexivo.backend_distributivo.repository.primary.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
@Transactional
public class PersonaService extends GenericServiceImpl<Persona, Long> implements GenericService<Persona, Long> {
    private PersonaRepository personaRepository;
    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }
}
