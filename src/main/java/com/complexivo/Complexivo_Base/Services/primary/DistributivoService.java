package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Distributivo;
import com.complexivo.Complexivo_Base.Repository.primary.DistributivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DistributivoService implements IDistributivoService{

	
	@Autowired
	private DistributivoRepository distributivorepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Distributivo> findAll() {

		return (List<Distributivo>) distributivorepository.findAll();
	}

	@Override
	@Transactional
	public Distributivo save(Distributivo distributivo) {

		return distributivorepository.save(distributivo);
	}

	@Override
	@Transactional(readOnly = true)
	public Distributivo findById(Long id) {

		return distributivorepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		distributivorepository.deleteById(id);
	}

}
