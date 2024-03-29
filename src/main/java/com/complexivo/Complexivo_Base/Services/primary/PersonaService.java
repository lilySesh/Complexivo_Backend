package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Persona;
import com.complexivo.Complexivo_Base.Repository.primary.PersonaRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService extends GenericServiceImpl<Persona, Long> implements GenericService<Persona, Long> {
    private PersonaRepository personaRepository;
    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }
}