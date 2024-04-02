package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Distributivo;



public interface IDistributivoService {

	
	public List<Distributivo> findAll();
	public Distributivo save(Distributivo distributivo);
	public Distributivo findById(Long id);
	public void delete(Long id);
}
