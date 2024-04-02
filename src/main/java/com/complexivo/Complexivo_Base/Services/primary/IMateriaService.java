package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Materia;



public interface IMateriaService {
	public List<Materia> findAll();
	public Materia save(Materia materia);
	public Materia findById(Long id);
	public void delete(Long id);
}
