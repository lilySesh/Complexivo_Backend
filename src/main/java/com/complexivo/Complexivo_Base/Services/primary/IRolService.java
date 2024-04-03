package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Rol;

public interface IRolService {

	public List<Rol> findAll();
	public Rol save(Rol rol);
	public Rol findById(Long id);
	public void delete(Long id);
}
