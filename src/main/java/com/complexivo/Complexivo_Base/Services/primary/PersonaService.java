package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Persona;
import com.complexivo.Complexivo_Base.Repository.primary.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private PersonaRepository personarepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {

		return (List<Persona>) personarepository.findAll();
	}

	@Override
	@Transactional
	public Persona save(Persona persona) {

		return personarepository.save(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findById(Long id) {

		return personarepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		personarepository.deleteById(id);
	}

}
