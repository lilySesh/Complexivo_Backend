package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Docente;

public interface IDocenteService {
	
	public List<Docente> findAll();
	public Docente save(Docente docente);
	public Docente findById(Long id);
	public void delete(Long id);
}
