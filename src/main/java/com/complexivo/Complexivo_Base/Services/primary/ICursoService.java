package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Curso;



public interface ICursoService {

	public List<Curso> findAll();
	public Curso save(Curso curso);
	public Curso findById(Long id);
	public void delete(Long id);
}
