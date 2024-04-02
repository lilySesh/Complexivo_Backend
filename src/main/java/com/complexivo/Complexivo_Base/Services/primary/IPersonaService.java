package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Persona;



public interface IPersonaService {
	public List<Persona> findAll();
	public Persona save(Persona persona);
	public Persona findById(Long id);
	public void delete(Long id);
}
