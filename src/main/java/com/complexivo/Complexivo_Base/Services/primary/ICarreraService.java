package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;

public interface ICarreraService {


	public List<Carrera> findAll();
	public Carrera save(Carrera carrera);
	public Carrera findById(Long id);
	public void delete(Long id);
}
