package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Curso_Materia;


public interface ICurso_MateriaService {
	public List<Curso_Materia> findAll();
	public Curso_Materia save(Curso_Materia curso_materia);
	public Curso_Materia findById(Long id);
	public void delete(Long id);

}
