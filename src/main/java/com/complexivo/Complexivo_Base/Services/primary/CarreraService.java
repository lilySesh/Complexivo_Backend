package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		// TODO Auto-generated method stub
		return carrerarepository.save(carrera);
	}

	@Override
	@Transactional(readOnly = true)
	public Carrera findById(Long id) {
		// TODO Auto-generated method stub
		return carrerarepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carrerarepository.deleteById(id);
	}



}
