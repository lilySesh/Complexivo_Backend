package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarreraService implements ICarreraService{

	
	@Autowired
	private CarreraRepository carrerarepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Carrera> findAll() {
	    return (List<Carrera>) carrerarepository.findAll();
	}

	@Override
	@Transactional
	public Carrera save(Carrera carrera) {

		return carrerarepository.save(carrera);
	}

	@Override
	@Transactional(readOnly = true)
	public Carrera findById(Long id) {

		return carrerarepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		carrerarepository.deleteById(id);
	}



}
