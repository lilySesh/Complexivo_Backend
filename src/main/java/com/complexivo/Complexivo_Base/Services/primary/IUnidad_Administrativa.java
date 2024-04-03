package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Unidad_Administrativa;

public interface IUnidad_Administrativa {
	public List<Unidad_Administrativa> findAll();
	public Unidad_Administrativa save(Unidad_Administrativa unidad_administrativa);
	public Unidad_Administrativa findById(Long id);
	public void delete(Long id);
}
