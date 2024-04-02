package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Models.primary.Distributivo;
import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;
import com.complexivo.Complexivo_Base.Repository.primary.DistributivoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DistributivoService implements IDistributivoService{

	
	@Autowired
	private DistributivoRepository distributivorepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Distributivo> findAll() {
		// TODO Auto-generated method stub
	    return (List<Distributivo>) distributivorepository.findAll();
	}

	@Override
	@Transactional
	public Distributivo save(Distributivo distributivo) {
		// TODO Auto-generated method stub
		return distributivorepository.save(distributivo);
	}

	@Override
	@Transactional(readOnly = true)
	public Distributivo findById(Long id) {
		// TODO Auto-generated method stub
		return distributivorepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		distributivorepository.deleteById(id);
	}

}
